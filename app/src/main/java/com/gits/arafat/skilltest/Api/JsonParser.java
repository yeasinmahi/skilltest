package com.gits.arafat.skilltest.Api;

import com.gits.arafat.skilltest.Others.Utility;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Arafat on 10/04/2017.
 */

public class JsonParser {
    public static JSONArray convertStringToJson(String s){
        try {
            return new JSONArray(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void populateCategory(Object result, ArrayList<HashMap<String, String>> list) {
        JSONArray jsonArray = convertStringToJson((String) result);
        list.clear();
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
                        String hasSubcategory = jsonObject.getString("hasSubcategory");

                        temp.put("id", id);
                        temp.put("category", category);
                        temp.put("hasSubcategory", hasSubcategory);

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
    public static void populateSubCategory(Object result, ArrayList<HashMap<String, String>> list) {
        JSONArray jsonArray = convertStringToJson((String) result);
        list.clear();
        if (jsonArray!=null){
            //list.clear();
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        HashMap<String, String> temp = new HashMap<String, String>();
                        String id = jsonObject.getString("id");
                        String subCategoryName = jsonObject.getString("subCategoryName");
                        String categoryId = jsonObject.getString("categoryId");

                        temp.put("id", id);
                        temp.put("category", subCategoryName);
                        temp.put("categoryId", categoryId);

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
        JSONArray jsonArray = convertStringToJson((String) result);
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
                        String subCategoryId = jsonObject.getString("subCategoryId");

                        temp.put("id", id);
                        temp.put("question", question);
                        temp.put("optionA", optionA);
                        temp.put("optionB", optionB);
                        temp.put("optionC", optionC);
                        temp.put("optionD", optionD);
                        temp.put("correctAns", correctAns);
                        temp.put("categoryId", categoryId);
                        temp.put("subCategoryId", subCategoryId);
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
}
