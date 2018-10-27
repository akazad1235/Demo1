package com.example.akazad.mytextdemo;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.akazad.mytextdemo.R.id.LoginButtonId;

public class MainActivity extends AppCompatActivity {
    private TextView MyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyText= (TextView) findViewById(R.id.textViewid);
        MyText.setText("Dhaka International Universtiy");
    }

}
