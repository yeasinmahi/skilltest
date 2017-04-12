package com.gits.arafat.skilltest.Api;

import android.widget.ArrayAdapter;

import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.Question;
import com.gits.arafat.skilltest.Model.SubCategory;
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
    private static JSONArray convertStringToJson(String s){
        try {
            return new JSONArray(s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Category> getCategories(Object result) {
        JSONArray jsonArray = convertStringToJson((String) result);
        ArrayList<Category> categories = new ArrayList<Category>();
        if (jsonArray!=null){
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String id = jsonObject.getString("id");
                        String categoryName = jsonObject.getString("category");
                        String hasSubcategory = jsonObject.getString("hasSubcategory");

                        Category category = new Category();
                        category.setId(Integer.parseInt(id));
                        category.setCategory(categoryName);
                        category.setHasSubcategory(Integer.parseInt(hasSubcategory));

                        categories.add(category);
                    } catch (JSONException e) {
                        // Oops
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return categories;
    }
    public static ArrayList<SubCategory> getSubCategories(Object result) {
        JSONArray jsonArray = convertStringToJson((String) result);
        ArrayList<SubCategory> subCategories = new ArrayList<SubCategory>();
        if (jsonArray!=null){
            //list.clear();
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String id = jsonObject.getString("id");
                        String subCategoryName = jsonObject.getString("subCategoryName");
                        String categoryId = jsonObject.getString("categoryId");

                        SubCategory subCategory = new SubCategory();
                        subCategory.setId(Integer.parseInt(id));
                        subCategory.setSubCategoryName(subCategoryName);
                        subCategory.setCategoryId(Integer.parseInt(categoryId));

                        subCategories.add(subCategory);
                    } catch (JSONException e) {
                        // Oops
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }return subCategories;
    }
    public static ArrayList<Question> getQuestions(Object result) {
        JSONArray jsonArray = convertStringToJson((String) result);
        ArrayList<Question> questions = new ArrayList<Question>();
        if (!jsonArray.equals(null)){
            //list.clear();
            try {
                for (int i=0; i < jsonArray.length(); i++)
                {
                    try {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        HashMap<String, String> temp = new HashMap<String, String>();
                        String id = jsonObject.getString("id");
                        String ques = jsonObject.getString("question");
                        String optionA = jsonObject.getString("optionA");
                        String optionB = jsonObject.getString("optionB");
                        String optionC = jsonObject.getString("optionC");
                        String optionD = jsonObject.getString("optionD");
                        String correctAns = jsonObject.getString("correctAns");
                        String categoryId = jsonObject.getString("categoryId");
                        String subCategoryId = jsonObject.getString("subCategoryId");

                        Question question = new Question();
                        question.setId(Integer.parseInt(id));
                        question.setQuestion(ques);
                        question.setOptionA(optionA);
                        question.setOptionB(optionB);
                        question.setOptionC(optionC);
                        question.setOptionD(optionD);
                        question.setCorrectAns(correctAns);
                        question.setCategoryId(Integer.parseInt(categoryId));
                        question.setSubCategoryId(Integer.parseInt(subCategoryId));

                        questions.add(question);
                    } catch (JSONException e) {
                        // Oops
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return questions;
    }
}
