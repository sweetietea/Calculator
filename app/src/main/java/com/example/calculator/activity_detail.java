package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class activity_detail extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("text");
        String bmi = intent.getStringExtra("nInput");

        String str2 = intent.getStringExtra("text");
        String resource = intent.getStringExtra("nInput");


        TextView text = (TextView) findViewById(R.id.textView_11);
        text.setText(str);
        TextView text2 = (TextView) findViewById(R.id.textView_22);
        text2.setText(bmi);

        TextView text3 = (TextView) findViewById(R.id.textView_33);
        text3.setText(str2);
        TextView text4 = (TextView) findViewById(R.id.textView_44);
        text4.setText(resource);
    }

}
