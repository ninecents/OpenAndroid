package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view)
    {
        TextView text=findViewById(R.id.text);

        text.setText("Click");
        Toast.makeText(MainActivity.this,"you clicked button 1",Toast.LENGTH_SHORT).show();
    }
}
