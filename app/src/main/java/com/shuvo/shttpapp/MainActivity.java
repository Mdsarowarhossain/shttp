package com.shuvo.shttpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.shuvo.shrrp.shttp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        shttp.postRequest("https://jsonplaceholder.typicode.com/posts" ,"", "ii", new shttp.ShttpOnResponseListener() {
            @Override
            public void onApiResponse(String result, String key, int statusCpde, Boolean errorn, String errorMessage) {
                runOnUiThread((new Runnable() {
                    @Override
                    public void run() {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

                    }
                }));

            }
        });


    }
}