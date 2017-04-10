package com.gits.arafat.skilltest.Model;

/**
 * Created by Arafat on 06/04/2017.
 */

public class Category {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHasSubcategory() {
        return hasSubcategory;
    }

    public void setHasSubcategory(int hasSubcategory) {
        this.hasSubcategory = hasSubcategory;
    }

    private String category;
    private int hasSubcategory;
}
