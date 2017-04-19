package com.gits.arafat.skilltest.NetworkManager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Arafat on 13/04/2017.
 */

public class NetworkUtil {
    public static String link="http://gits-bd.com/WebService/SkillTest3/apiParser.php";
    //public static String link = "http://192.168.1.4:8080/SkillTest/apiParser.php";
    public static boolean isConnectingToInternet(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (info != null)
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
        }
        return false;
    }

}
