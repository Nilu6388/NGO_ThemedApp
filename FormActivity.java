package com.example.ngothemedapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    public void submitForm(android.view.View view) {
        Toast.makeText(this, "Form submitted!", Toast.LENGTH_SHORT).show();
    }
}
