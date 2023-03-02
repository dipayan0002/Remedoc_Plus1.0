package com.example.myapplication102;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity2(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openActivity3(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity4(View v) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void openActivity5(View v) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}