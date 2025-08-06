package com.example.ngothemedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToForm(View view) {
        startActivity(new Intent(this, FormActivity.class));
    }

    public void goToAbout(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }
}
