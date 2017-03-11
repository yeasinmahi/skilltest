package com.example.arafat.skilltest;

import android.content.Context;
import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arafat on 03/03/2017.
 */

public class ApiHelper extends AsyncTask {
    private static ArrayList<HashMap<String,String>> list;
    private Context context;
    private MyInterface.OnTaskCompleted listener;
    public ApiHelper(Context context, MyInterface.OnTaskCompleted listener, ArrayList list){
        this.context=context;
        this.listener = listener;
        this.list=list;
    }
    public ApiHelper(Context context, MyInterface.OnTaskCompleted listener){
        this.context=context;
        this.listener = listener;
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
                case "getQuestion":
                    String categoryId = (String)params[1];
                    link = Utility.link+"?method="+method+"&categoryId="+categoryId;
                    break;
            }
            return Utility.getResponseFromUrl(link);
        } catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
    @Override
    protected void onPostExecute(Object result){
        if (result.toString().contains("Exception")) {
            listener.onTaskCompleted(Utility.Status.noInternet);
        }
        else if(result.toString().equals("")){
            listener.onTaskCompleted(Utility.Status.noData);
        }
        else {
            switch (method){
                case "getCategory":
                    Utility.populateCategory(result,list);
                    break;
                case "getQuestion":
                    Utility.populateQuestion(result,list);
                    break;
            }
            listener.onTaskCompleted(Utility.Status.success);
        }
    }

}
