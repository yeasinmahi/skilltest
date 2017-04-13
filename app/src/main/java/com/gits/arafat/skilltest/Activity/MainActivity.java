package com.gits.arafat.skilltest.Activity;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gits.arafat.skilltest.Api.ApiHelper;
import com.gits.arafat.skilltest.Database.DBUtility;
import com.gits.arafat.skilltest.Database.DbHelper;
import com.gits.arafat.skilltest.Database.PopulatedOpenHelper;
import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.SubCategory;
import com.gits.arafat.skilltest.NetworkManager.NetworkUtil;
import com.gits.arafat.skilltest.Others.MyInterface;
import com.gits.arafat.skilltest.Others.Utility;
import com.gits.arafat.skilltest.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity implements MyInterface.OnTaskCompleted,MyInterface.OnRetry {
    ProgressDialog progressBar;
    boolean onMainPage=true;
    public ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PopulatedOpenHelper.getInstance(getApplicationContext());
        adapter = new SimpleAdapter(this, list, R.layout.custom_row_view, new String[]{"category"}, new int[]{R.id.text1});
        requestToApi();
        getItemFromDatabase(true,0);

    }
    private void requestToApi(){

        if (NetworkUtil.isConnectingToInternet(this)){
            new ApiHelper(getApplicationContext()).execute(DBUtility.CategoryTableName);
            new ApiHelper(getApplicationContext()).execute(DBUtility.SubCategoryTableName);
            new ApiHelper(getApplicationContext()).execute(DBUtility.QuestionTableName);

        }
    }
    private void getItemFromDatabase(boolean isCategory,int categoryId){

        progressBar=Utility.getProgressBar(this);
        progressBar.show();
        if (isCategory){
            ArrayList<Category> categories=DbHelper.getInstance(getApplicationContext()).getAllCategory();
            list.clear();
            for (Category category:categories) {
                HashMap<String, String> temp = new HashMap<String, String>();
                temp.put("id", String.valueOf(category.getId()));
                temp.put("category", category.getCategory());
                temp.put("hasSubcategory", String.valueOf(category.getHasSubcategory()));

                list.add(temp);
            }
        }else {
            ArrayList<SubCategory> subCategories=DbHelper.getInstance(getApplicationContext()).getSubCategory(categoryId);
            list.clear();
            for (SubCategory subCategory:subCategories) {
                HashMap<String, String> temp = new HashMap<String, String>();
                temp.put("id", String.valueOf(subCategory.getId()));
                temp.put("category", subCategory.getSubCategoryName());
                temp.put("categoryId", String.valueOf(subCategory.getCategoryId()));
                list.add(temp);
            }
        }

        setListAdapter(adapter);
        Log.d("Db:","get Data From Database");
        progressBar.cancel();
        progressBar.dismiss();
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        l.setItemsCanFocus(false);
        try {
            if(list.get(position).containsKey("hasSubcategory")){

                int hasSubCategory=Integer.parseInt(list.get(position).get("hasSubcategory"));
                int categoryId=Integer.parseInt(list.get(position).get("id"));
                if(hasSubCategory==1){
                    onMainPage=false;
                    //requestToApi(false,categoryId);
                    getItemFromDatabase(false,categoryId);
                }else {
                    Intent intentMain = new Intent(MainActivity.this, QuestionActivity.class);
                    intentMain.putExtra("categoryId", categoryId);
                    intentMain.putExtra("subCategoryId", 0);
                    startActivity(intentMain);
                }
            }else {
                int subCategoryId=Integer.parseInt(list.get(position).get("id"));
                int categoryId=Integer.parseInt(list.get(position).get("categoryId"));
                Intent intentMain = new Intent(MainActivity.this, QuestionActivity.class);
                intentMain.putExtra("categoryId", categoryId);
                intentMain.putExtra("subCategoryId", subCategoryId);
                startActivity(intentMain);
            }


        } catch (Exception e) {
            Log.d("ListItem",e.getMessage());
            Utility.popUpWindow(this,this,"Data Parsing Error",true);
        }
    }

    @Override
    public void onTaskCompleted(Utility.Status isSuccess) {
        if (isSuccess== Utility.Status.success){
            setListAdapter(adapter);

        }else if(isSuccess== Utility.Status.noData){
            Utility.popUpWindow(this,this,"No category available",true);
        }else {
            Utility.popUpWindow(this,this,"Check your internet",true);
        }
        progressBar.cancel();
        progressBar.dismiss();

    }

    @Override
    public void onRetry() {
        requestToApi();
    }
    @Override
    public void onBackPressed() {
        if (onMainPage){
            finish();
        }else {
            //new ApiHelper(this,this,list).execute("getCategoryId");
            getItemFromDatabase(true,0);
            onMainPage=true;
        }
    }

}
