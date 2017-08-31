package com.imron.chickenrlibs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class login_display extends AppCompatActivity {
final static String Tag = "Librarry 1"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_display);
    }

    public static void d (String message ){
        Log.d(Tag,message);
    }
}
