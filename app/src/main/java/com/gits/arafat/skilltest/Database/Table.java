package com.gits.arafat.skilltest.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Arafat on 10/04/2017.
 */

public class Table {
    SQLiteDatabase database;
    private static Table instance=null;
    private String preSql="BEGIN TRANSACTION;";
    private String postSql="COMMIT;";
    public Table(SQLiteDatabase database){
        this.database=database;
    }
    public static Table getInstance(SQLiteDatabase database){
        if (instance!=null) return instance;
        return new Table(database);
    }
    public void createAllTable(){
        createCategoryTable();
        createSubCategoryTable();
        createQuestionTable();
    }
    private void createCategoryTable(){
        String sql="CREATE TABLE `category` (\n" +
                "  `id` INTEGER PRIMARY KEY  NOT NULL,\n" +
                "  `category` varchar(20) NOT NULL,\n" +
                "  `hasSubcategory` int(1) DEFAULT '0'\n" +
                ");";
        executeQuery(sql);
    }
    private void createSubCategoryTable(){
        String sql="CREATE TABLE `subcategory` (\n" +
                "  `id` INTEGER PRIMARY KEY  NOT NULL,\n" +
                "  `subCategoryName` varchar(50) NOT NULL,\n" +
                "  `categoryId` int(11) NOT NULL DEFAULT '0'\n" +
                ");";
        executeQuery(sql);
    }
    private void createQuestionTable(){
        String sql="CREATE TABLE `question` (\n" +
                "  `id` INTEGER PRIMARY KEY  NOT NULL,\n" +
                "  `question` varchar(500) NOT NULL,\n" +
                "  `optionA` varchar(50) NOT NULL,\n" +
                "  `optionB` varchar(50) NOT NULL,\n" +
                "  `optionC` varchar(50) NOT NULL,\n" +
                "  `optionD` varchar(50) NOT NULL,\n" +
                "  `correctAns` varchar(1) NOT NULL,\n" +
                "  `categoryId` int(11) NOT NULL,\n" +
                "  `subCategoryId` int(11) NOT NULL DEFAULT '0'\n" +
                ");";
        executeQuery(sql);
    }
    private void executeQuery(String sql){
        database.execSQL(sql);
        Log.d("Table:","table created successfully");
    }

}
