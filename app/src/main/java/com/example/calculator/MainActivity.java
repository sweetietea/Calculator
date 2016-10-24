package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculator.model.BMI;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private BMI nInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nInput = new BMI();

        Button cal = (Button) findViewById(R.id.button_1);
        cal.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this,activity_detail.class);
                intent.putExtra("text","ค่าดัชนีมวลกาย (BMI) :");
                intent.putExtra("text3","อยู่ในเกณฑ์ :");
                startActivity(intent);
            }

        });



    }



}
