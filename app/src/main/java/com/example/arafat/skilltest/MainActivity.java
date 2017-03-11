package com.example.arafat.skilltest;

import android.app.Application;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity implements MyInterface.OnTaskCompleted,MyInterface.OnRetry {
    ProgressDialog progressBar;
    public ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new SimpleAdapter(this, list, R.layout.custom_row_view, new String[]{"category"}, new int[]{R.id.text1});
        requestToApi();

    }
    private void requestToApi(){
        if (Utility.isConnectingToInternet(this)){
            progressBar=Utility.getProgressBar(this);
            progressBar.show();
            new ApiHelper(this,this,list).execute("getCategory");
        }
        else {
            Utility.popUpWindow(this,this,"Check your internet");
        }
    }
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        try {
            Intent intentMain = new Intent(MainActivity.this, QuestionActivity.class);
            int categoryId=Integer.parseInt(list.get(position).get("id"));
            intentMain.putExtra("categoryId", categoryId);
            startActivity(intentMain);
        } catch (Exception e) {
            Log.d("ListItem",e.getMessage());
        }
    }

    @Override
    public void onTaskCompleted(Utility.Error isSuccess) {
        if (isSuccess==Utility.Error.success){
            setListAdapter(adapter);

        }else if(isSuccess== Utility.Error.noData){
            Utility.popUpWindow(this,this,"No category available");
        }else {
            Utility.popUpWindow(this,this,"Check your internet");
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
        System.exit(0);
    }

}
