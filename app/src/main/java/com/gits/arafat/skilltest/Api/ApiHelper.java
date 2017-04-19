package com.gits.arafat.skilltest.Api;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.gits.arafat.skilltest.Database.DBUtility;
import com.gits.arafat.skilltest.Database.DbHelper;
import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.Question;
import com.gits.arafat.skilltest.Model.SubCategory;
import com.gits.arafat.skilltest.NetworkManager.NetworkUtil;
import com.gits.arafat.skilltest.Others.Utility;

import java.util.ArrayList;

/**
 * Created by Arafat on 03/03/2017.
 */

public class ApiHelper extends AsyncTask {
    private Context context;
    public ApiHelper(Context context){
        this.context=context;
    }
    private String tableName;
    @Override
    protected Object doInBackground(Object[] params) {
        String link="";
        try{
            tableName = (String)params[0];
            switch (tableName){
                case "category":
                    link = NetworkUtil.link+"?tableName="+ tableName +"&&id="+ DbHelper.getInstance(context).getLastId(DBUtility.CategoryTableName);
                    break;
                case "subcategory":
                    link = NetworkUtil.link+"?tableName="+ tableName +"&&id="+ DbHelper.getInstance(context).getLastId(DBUtility.SubCategoryTableName);
                    break;
                case "question":
                    link = NetworkUtil.link+"?tableName="+ tableName +"&&id="+ DbHelper.getInstance(context).getLastId(DBUtility.QuestionTableName);
                    break;
            }
            return Utility.getResponseFromUrl(link);
        } catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
    @Override
    protected void onPostExecute(Object result){
        if (result.toString().contains("Exception") || result.equals("<br />")) {
            //listener.onTaskCompleted(Utility.Status.noInternet);
            Log.d("ApiHelper","Exception: " + result);
        }
        else if(result.toString().equals("")){
            //listener.onTaskCompleted(Utility.Status.noData);
            Log.d("ApiHelper","Exception: " + result);
        }
        else {
            switch (tableName){
                case "category":
                    ArrayList<Category> categories = JsonParser.getCategories(result);
                    if (categories.size()>0){
                        DbHelper.getInstance(context).insertCategory(categories);
                    }
                    break;
                case "subcategory":
                    ArrayList<SubCategory> subCategories = JsonParser.getSubCategories(result);
                    if (subCategories.size()>0){
                        DbHelper.getInstance(context).insertSubCategory(subCategories);
                    }
                    break;
                case "question":
                    ArrayList<Question> questions = JsonParser.getQuestions(result);
                    if (questions.size()>0){
                        DbHelper.getInstance(context).insertQuestion(questions);
                    }
                    break;
            }
            Log.d("ApiHelper","Method : " + tableName +" \nresult: "+ result);
            //listener.onTaskCompleted(Utility.Status.success);
        }
    }

}
