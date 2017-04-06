package com.gits.arafat.skilltest.Model;

/**
 * Created by Arafat on 06/04/2017.
 */

public class SubCategory {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    private String subCategoryName;
    private int category;
}
