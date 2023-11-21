package com.example.hananandnatnael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void upbtn(View view) {
        Toast.makeText(this, "Upper Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void downbtn(View view) {
        Toast.makeText(this, "Bottom Button Clicked", Toast.LENGTH_SHORT).show();
    }
}