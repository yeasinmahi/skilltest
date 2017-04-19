package com.gits.arafat.skilltest.Database;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Arafat on 10/04/2017.
 */

public class Table {
    SQLiteDatabase database;
    private static Table instance=null;

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
        insertIntoCategory();
        insertIntoSubCategory();
        insertIntoQuestion();
    }
    private void createCategoryTable(){
        String sql="CREATE TABLE IF NOT EXISTS `category` (\n" +
                "  `id` INTEGER PRIMARY KEY  NOT NULL,\n" +
                "  `category` varchar(20) NOT NULL,\n" +
                "  `hasSubcategory` int(1) DEFAULT '0'\n" +
                ");";
        executeQuery(sql);
    }
    private void createSubCategoryTable(){
        String sql="CREATE TABLE IF NOT EXISTS `subcategory` (\n" +
                "  `id` INTEGER PRIMARY KEY  NOT NULL,\n" +
                "  `subCategoryName` varchar(50) NOT NULL,\n" +
                "  `categoryId` int(11) NOT NULL DEFAULT '0'\n" +
                ");";
        executeQuery(sql);
    }
    private void createQuestionTable(){
        String sql="CREATE TABLE IF NOT EXISTS `question` (\n" +
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
    private void insertIntoCategory(){
        String sql="INSERT INTO `category` (`id`, `category`, `hasSubcategory`) VALUES\n" +
                "(1, 'IQ', 0),\n" +
                "(2, 'General Knowledge', 0),\n" +
                "(3, 'English', 0),\n" +
                "(4, 'Programming Skils', 0),\n" +
                "(5, 'BCS', 1);";
        executeQuery(sql);
    }
    private void insertIntoSubCategory(){
        String sql="INSERT INTO `subcategory` (`id`, `subCategoryName`, `categoryId`) VALUES\n" +
                "(1, 'Practice Bangla', 5),\n" +
                "(2, 'Practice English', 5),\n" +
                "(3, 'Practice Mathematics ', 5),\n" +
                "(4, 'Practice General Knowledge', 5),\n" +
                "(5, '24th BCS', 5),\n" +
                "(6, '25th BCS', 5),\n" +
                "(7, '26th BCS', 5),\n" +
                "(8, '28th BCS', 5),\n" +
                "(9, '29th BCS', 5);";
        executeQuery(sql);
    }
    private void insertIntoQuestion(){
        PreQuestionData preQuestionData = new PreQuestionData();
        String[] sql=preQuestionData.getQuestionInsertText();
        executeQuery(sql);
    }
    private void executeQuery(String sql){

        database.execSQL(sql);
        Log.d("Table:","table created successfully");
    }
    private void executeQuery(String[] sql){
        for (int i=0;i<sql.length;i++) {
            database.execSQL(sql[i]);
            Log.d("Question:",sql.length +" row inserting");
        }
    }

}
