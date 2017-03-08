package com.example.arafat.skilltest;

import android.widget.SimpleAdapter;

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
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Arafat on 03/03/2017.
 */

public class Utility {
    public static String link="http://192.168.0.100:8080/SkillTest/apiParser.php";
    public static JSONArray convertStringToJson(String s){
        try {
            return new JSONArray(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public interface OnTaskCompleted{
        void onTaskCompleted(boolean isSuccess);
    }
    public static String getResponceFromUrl(String link){
        try{

            URL url = new URL(link);
            HttpClient client = new DefaultHttpClient();
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
    public static ArrayList getRandomizationList(ArrayList list){
        Collections.shuffle(list, new Random(System.nanoTime()));
        return list;
    }
    public static int setQuestionSize(int size){
        if(size>=20){
            size=20;
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
}

