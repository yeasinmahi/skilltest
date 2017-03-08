package com.example.arafat.skilltest;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Switch;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arafat on 03/03/2017.
 */

public class ApiHelper extends AsyncTask {
    private static ArrayList<HashMap<String,String>> list;
    private Context context;
    private Utility.OnTaskCompleted listener;
    public ApiHelper(Context context, Utility.OnTaskCompleted listener, ArrayList list){
        this.context=context;
        this.listener = listener;
        this.list=list;
    }
    public ApiHelper(Context context, Utility.OnTaskCompleted listener){
        this.context=context;
        this.listener = listener;
    }
    private String method;
    @Override
    protected String doInBackground(Object[] params) {
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
            return Utility.getResponceFromUrl(link);
        } catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
    @Override
    protected void onPostExecute(Object result){
        if (!result.toString().contains("Exception")) {
            switch (method){
                case "getCategory":
                    Utility.populateCategory(result,list);
                    break;
                case "getQuestion":
                    Utility.populateQuestion(result,list);
                    break;
            }
            listener.onTaskCompleted(true);
        }
        else {
            listener.onTaskCompleted(false);
        }
    }

}
