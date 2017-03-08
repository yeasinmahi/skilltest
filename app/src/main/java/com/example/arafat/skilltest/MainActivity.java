package com.example.arafat.skilltest;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity implements Utility.OnTaskCompleted {
    public ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new SimpleAdapter(this, list, R.layout.custom_row_view, new String[]{"category"}, new int[]{R.id.text1});
        new ApiHelper(this,this,list).execute("getCategory");

    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        try {
            Intent intentMain = new Intent(MainActivity.this, QuestionActivity.class);
            int categoryId=Integer.parseInt(list.get(position).get("id"));
            intentMain.putExtra("categoryId", categoryId);
            startActivity(intentMain);
        } catch (Exception e) {
            Log.d("ListItem",e.getMessage());
        }
    }

    @Override
    public void onTaskCompleted(boolean isSuccess) {
        if (isSuccess){
            setListAdapter(adapter);

        }else{
            // TODO: 03/03/2017   check network error msg

        }

    }
   /* public void login(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Get Method");
        new SigninActivity(this,status,role,0).execute(username,password);

    }*/


}
