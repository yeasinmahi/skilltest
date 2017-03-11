package com.example.arafat.skilltest;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Arafat on 03/03/2017.
 */

public class Utility {
    public static String link="http://gits-bd.com/WebService/SkillTest/apiParser.php";
    public static int questionToBeAnswered=10;
    public static JSONArray convertStringToJson(String s){
        try {
            return new JSONArray(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getResponseFromUrl(String link){
        try{
            HttpParams httpParameters = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpParameters, 3000);
            HttpConnectionParams.setSoTimeout(httpParameters, 5000);

            HttpClient client = new DefaultHttpClient(httpParameters);
            HttpGet request = new HttpGet();
            request.setURI(new URI(link));

            HttpResponse response = client.execute(request);
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(response.getEntity().getContent()));

            StringBuffer sb = new StringBuffer("");
            String line="";

            while ((line = in.readLine()) != null) {
                sb.append(line);
                break;
            }

            in.close();
            return sb.toString();
        } catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
    static void populateCategory(Object result, ArrayList<HashMap<String, String>> list) {
        JSONArray jsonArray = Utility.convertStringToJson((String) result);
        if (jsonArray!=null){
            //list.clear();
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        HashMap<String, String> temp = new HashMap<String, String>();
                        String id = jsonObject.getString("id");
                        String category = jsonObject.getString("category");

                        temp.put("id", id);
                        temp.put("category", category);

                        list.add(temp);
                    } catch (JSONException e) {
                        // Oops
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void populateQuestion(Object result, ArrayList list) {
        JSONArray jsonArray = Utility.convertStringToJson((String) result);
        if (!jsonArray.equals(null)){
            //list.clear();
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        HashMap<String, String> temp = new HashMap<String, String>();
                        String id = jsonObject.getString("id");
                        String question = jsonObject.getString("question");
                        String optionA = jsonObject.getString("optionA");
                        String optionB = jsonObject.getString("optionB");
                        String optionC = jsonObject.getString("optionC");
                        String optionD = jsonObject.getString("optionD");
                        String correctAns = jsonObject.getString("correctAns");
                        String categoryId = jsonObject.getString("categoryId");

                        temp.put("id", id);
                        temp.put("question", question);
                        temp.put("optionA", optionA);
                        temp.put("optionB", optionB);
                        temp.put("optionC", optionC);
                        temp.put("optionD", optionD);
                        temp.put("correctAns", correctAns);
                        temp.put("categoryId", categoryId);
                        temp.put("isAnswered", "0");
                        temp.put("isCorrect", "0");

                        list.add(temp);
                    } catch (JSONException e) {
                        // Oops
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static int getTotalCorrectAnswer(ArrayList<HashMap<String, String>> list,int size){
        int counter=0;
        for (int i=0;i<size;i++){
            if(list.get(i).get("isCorrect").equals("1")){
                counter++;
            }
        }
        return counter;

    }
    public static ArrayList getRandomizationList(ArrayList list){
        Collections.shuffle(list, new Random(System.nanoTime()));
        return list;
    }
    public static int setQuestionSize(int size){
        if(size>=questionToBeAnswered){
            size=questionToBeAnswered;
        }
        return size;
    }
    public static ArrayList<HashMap<String, String>> setQuestionProperty(ArrayList<HashMap<String,String>> list, int currentPosition, String isAnswered, String isCorrect){
        list.get(currentPosition).put("isAnswered",isAnswered);
        list.get(currentPosition).put("isCorrect",isCorrect);
        return list;
    }
    public static boolean isAnswered(ArrayList<HashMap<String, String>> list,int currentPosition){
        String ss= list.get(currentPosition).get("isAnswered");
        if (ss.equals("1"))
            return true;
        return false;
    }
    public static String getCorrectAnswered(ArrayList<HashMap<String, String>> list,int currentPosition){
        return list.get(currentPosition).get("correctAns");
    }
    enum Error{
        success,
        noInternet,
        noData
    }
    public static ProgressDialog getProgressBar(Context context){
        ProgressDialog progress = new ProgressDialog(context,R.style.MyTheme);
        //progress.setTitle("Loading...");
        //progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setCancelable(false);
        progress.setProgressStyle(android.R.style.Widget_ProgressBar_Large);
        //progress.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return progress;
    }
    public static boolean isConnectingToInternet(Context context){
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null)
        {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
        }
        return false;
    }
    public static void popUpWindow(final Context context, final MyInterface.OnRetry listener  , String msg) {
        // custom dialog
        final Dialog dialog = new Dialog(context,R.style.MyTheme);
        dialog.setContentView(R.layout.custom_dialog);

        TextView text = (TextView) dialog.findViewById(R.id.customTextView);
        text.setText(msg);

        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);

        // if button is clicked, close the custom dialog
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                createRetryButton(context,listener);
            }
        });
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
    public static void createRetryButton(final Context context, final MyInterface.OnRetry listener) {
        // custom dialog
        final Dialog dialog = new Dialog(context,R.style.retryButtonTheme);
        dialog.setContentView(R.layout.retry_button);
        Button retryButton = (Button) dialog.findViewById(R.id.retryButton);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if(keyCode == KeyEvent.KEYCODE_BACK){
                    if(context.toString().contains(MainActivity.class.getSimpleName())){
                        System.exit(0);
                    }else if (context.toString().contains(QuestionActivity.class.getSimpleName()))
                        try {
                            Intent intentMain = new Intent(context, MainActivity.class);

                            context.startActivity(intentMain);
                        } catch (Exception e) {
                            Log.d("ListItem",e.getMessage());
                        }
                    System.exit(0);
                }
                return false;
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                listener.onRetry();
            }
        });
        // if button is clicked, close the custom dialog
        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

