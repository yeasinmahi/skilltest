package com.example.arafat.skilltest;

/**
 * Created by Arafat on 11/03/2017.
 */

public interface MyInterface {
    public interface OnTaskCompleted{
        void onTaskCompleted(Utility.Error isSuccess);

    }
    public interface OnRetry{
        void onRetry();
    }
}
