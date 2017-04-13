package com.gits.arafat.skilltest.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.gits.arafat.skilltest.Model.Category;
import com.gits.arafat.skilltest.Model.Question;
import com.gits.arafat.skilltest.Model.SubCategory;

import java.util.ArrayList;
import java.util.StringTokenizer;

import static com.gits.arafat.skilltest.Database.DBUtility.DbName;
import static com.gits.arafat.skilltest.Database.DBUtility.DbVersion;


public class DbHelper extends SQLiteOpenHelper {
	private static DbHelper instance;
	private DbHelper(Context context) {
		super(context, DbName, null, DbVersion);
		// TODO Auto-generated constructor stub
	}
	public static DbHelper getInstance(Context context){
		if (instance!=null) return instance;
		return new DbHelper(context);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Category> getAllCategory() {
		ArrayList<Category> categories = new ArrayList<Category>();
		// Rest Index Of Spinner from database
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor;
		cursor = db.query(DBUtility.CategoryTableName, null, null, null, null, null, null);
		if (cursor != null && cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				Category category = new Category();
				category.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("id"))));
				category.setCategory(cursor.getString(cursor.getColumnIndex("category")));
				category.setHasSubcategory(Integer.parseInt(cursor.getString(cursor.getColumnIndex("hasSubcategory"))));
				categories.add(category);
			}
		}
		if (cursor != null) {
			cursor.close();
		}
		db.close();
		return categories;
	}
	public ArrayList<SubCategory> getSubCategory(int categoryId) {
		ArrayList<SubCategory> subCategories = new ArrayList<SubCategory>();
		// Rest Index Of Spinner from database
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor;
		cursor = db.rawQuery("select * from "+DBUtility.SubCategoryTableName+" where categoryId = "+categoryId,null);
		if (cursor != null && cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				SubCategory subCategory = new SubCategory();
				subCategory.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("id"))));
				subCategory.setSubCategoryName(cursor.getString(cursor.getColumnIndex("subCategoryName")));
				subCategory.setCategoryId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("categoryId"))));
				subCategories.add(subCategory);
			}
		}
		if (cursor != null) {
			cursor.close();
		}
		db.close();
		return subCategories;
	}
	public ArrayList<Question> getQuestion(int categoryId, int subCategoryId) {
		ArrayList<Question> questions = new ArrayList<Question>();
		// Rest Index Of Spinner from database
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor;
		cursor = db.rawQuery("select * from "+DBUtility.QuestionTableName+" where categoryId = "+categoryId+" and subCategoryId="+subCategoryId,null);
		if (cursor != null && cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				Question question = new Question();
				question.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("id"))));
				question.setQuestion(cursor.getString(cursor.getColumnIndex("question")));
				question.setOptionA(cursor.getString(cursor.getColumnIndex("optionA")));
				question.setOptionB(cursor.getString(cursor.getColumnIndex("optionB")));
				question.setOptionC(cursor.getString(cursor.getColumnIndex("optionC")));
				question.setOptionD(cursor.getString(cursor.getColumnIndex("optionD")));
				question.setCorrectAns(cursor.getString(cursor.getColumnIndex("correctAns")));
				question.setCategoryId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("categoryId"))));
				question.setSubCategoryId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("subCategoryId"))));
				questions.add(question);
			}
		}
		if (cursor != null) {
			cursor.close();
		}
		db.close();
		return questions;
	}
	public boolean insertCategory(ArrayList<Category> categories) {
		long row=0;
		SQLiteDatabase db = getReadableDatabase();
		for (Category category:categories) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("id", category.getId());
			contentValues.put("category", String.valueOf(category.getCategory()));
			contentValues.put("hasSubcategory", category.getHasSubcategory());
			row = db.insert(DBUtility.CategoryTableName,null,contentValues);
			if (row<=0){
				db.close();
				return false;
			}
		}

		db.close();
		return row>0;
	}
	public boolean insertSubCategory(ArrayList<SubCategory> subCategories) {
		long row=0;
		SQLiteDatabase db = getReadableDatabase();
		for (SubCategory subCategory:subCategories) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("id", subCategory.getId());
			contentValues.put("subCategory", String.valueOf(subCategory.getSubCategoryName()));
			contentValues.put("categoryId", subCategory.getCategoryId());
			row = db.insert(DBUtility.SubCategoryTableName,null,contentValues);
			if (row<=0){
				db.close();
				return false;
			}
		}

		db.close();
		return row>0;
	}
	public boolean insertQuestion(ArrayList<Question> questions) {
		long row=0;
		SQLiteDatabase db = getReadableDatabase();
		for (Question question:questions) {
			ContentValues contentValues = new ContentValues();
			contentValues.put("id", question.getId());
			contentValues.put("question", String.valueOf(question.getQuestion()));
			contentValues.put("optionA", String.valueOf(question.getOptionA()));
			contentValues.put("optionB", String.valueOf(question.getOptionB()));
			contentValues.put("optionC", String.valueOf(question.getOptionC()));
			contentValues.put("optionD", String.valueOf(question.getOptionD()));
			contentValues.put("categoryId", String.valueOf(question.getCategoryId()));
			contentValues.put("subCategoryId", String.valueOf(question.getSubCategoryId()));
			row = db.insert(DBUtility.QuestionTableName,null,contentValues);
			if (row<=0){
				db.close();
				return false;
			}
		}

		db.close();
		return row>0;
	}
	public int getLastId(String tableName){
		String sql="SELECT ROWID from "+tableName+" order by ROWID DESC limit 1";
		int rowId=0;
		SQLiteDatabase db = getReadableDatabase();
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null && cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				rowId = Integer.parseInt(cursor.getString(cursor.getColumnIndex("id")));
			}
		}
		if (cursor != null) {
			cursor.close();
		}
		db.close();
		return rowId;
	}

}
