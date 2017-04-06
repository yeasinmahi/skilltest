package com.gits.arafat.skilltest.Others;

import com.gits.arafat.skilltest.Others.Utility;

/**
 * Created by Arafat on 11/03/2017.
 */

public interface MyInterface {
    public interface OnTaskCompleted{
        void onTaskCompleted(Utility.Status isSuccess);

    }
    public interface OnRetry{
        void onRetry();
    }
}
