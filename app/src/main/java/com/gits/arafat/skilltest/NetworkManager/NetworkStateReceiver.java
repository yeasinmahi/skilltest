package com.gits.arafat.skilltest.NetworkManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.gits.arafat.skilltest.Api.ApiHelper;
import com.gits.arafat.skilltest.Database.DBUtility;

/**
 * Created by Arafat on 13/04/2017.
 */

public class NetworkStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("MyNetwork", "network receiver received");
        if (NetworkUtil.isConnectingToInternet(context)){
            Log.e("MyNetwork", "network connected");
            new ApiHelper(context).execute(DBUtility.CategoryTableName);
            new ApiHelper(context).execute(DBUtility.SubCategoryTableName);
            new ApiHelper(context).execute(DBUtility.QuestionTableName);
        }else {
            Log.e("MyNetwork", "network not connected");
        }
    }
}
