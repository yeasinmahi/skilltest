package com.gits.arafat.skilltest.Api;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.Question;
import com.gits.arafat.skilltest.Model.SubCategory;
import com.gits.arafat.skilltest.Others.MyInterface;
import com.gits.arafat.skilltest.Others.Utility;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arafat on 03/03/2017.
 */

public class ApiHelper extends AsyncTask {
    private Context context;
    public ApiHelper(Context context){
        this.context=context;
    }
    private String method;
    @Override
    protected Object doInBackground(Object[] params) {
        String link="";
        try{
            method = (String)params[0];
            switch (method){
                case "getCategory":
                    link = Utility.link+"?method="+method;
                    break;
                case "getSubCategory":
                    String categoryId = (String)params[1];
                    link = Utility.link+"?method="+method+"&categoryId="+categoryId;
                    break;
                case "getQuestion":
                    categoryId = (String)params[1];
                    String subCategoryId = (String)params[2];
                    link = Utility.link+"?method="+method+"&categoryId="+categoryId+"&subCategoryId="+subCategoryId;
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
            switch (method){
                case "getCategory":
                    ArrayList<Category> categories = JsonParser.getCategories(result);
                    break;
                case "getSubCategory":
                    ArrayList<SubCategory> subCategories = JsonParser.getSubCategories(result);
                    break;
                case "getQuestion":
                    ArrayList<Question> questions = JsonParser.getQuestions(result);
                    break;
            }
            Log.d("ApiHelper","Method : " +method+" \nresult: "+ result);
            //listener.onTaskCompleted(Utility.Status.success);
        }
    }

}
