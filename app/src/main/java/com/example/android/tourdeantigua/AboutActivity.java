package com.example.android.tourdeantigua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AboutFragment())
                .commit();
    }
}