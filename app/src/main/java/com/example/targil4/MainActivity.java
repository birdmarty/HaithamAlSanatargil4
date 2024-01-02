package com.example.targil4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
    }
    private int count = 0;
    public void go(View view) {
        count = count+1;
        b1.setText("This is a click number: " + count);
        if (count%7==0){
            b1.setText("BOOM!");
        }
    }
}