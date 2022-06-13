package com.uu.android7test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class CodeTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_test);
        RelativeLayout lt;
        lt=findViewById(R.id.codeLayout);

        lt.animate().rotation(360f).setDuration(7000);
    }

    public void count(View view) {
        EditText Num1 = (EditText) findViewById(R.id.txt1st);
        String num1 = Num1.getText().toString();
        EditText Num2 = (EditText) findViewById(R.id.txt2d);
        String num2 = Num2.getText().toString();
        if(TextUtils.isEmpty(num1)) {
            Toast t=Toast.makeText(this,"Plase Input Numbers carefully",Toast.LENGTH_LONG);
            t.show();
            Num1.setError("1st Number required");
            return;
        }
        if(TextUtils.isEmpty(num2)) {
            Toast t=Toast.makeText(this,"Plase Input Numbers carefully",Toast.LENGTH_LONG);
            t.show();
            Num2.setError("2nd Number required");
            return;
        }
        else{


        TextView tv=(TextView) findViewById(R.id.tv1);
        tv.setVisibility(View.GONE);
        List<Integer> list=new ArrayList<>();
        EditText in1 =  (EditText) findViewById(R.id.txt1st);
        EditText in2 =  (EditText) findViewById(R.id.txt2d);
        int val1 = Integer.parseInt(in1.getText().toString());
        int val2 = Integer.parseInt(in2.getText().toString());

       for(int i=val1;i<=val2;i++){
           list.add(i);
        }



        Button b;
        b=(Button) findViewById(R.id.button);
        Animation animation= AnimationUtils.loadAnimation(CodeTest.this,R.anim.bounce);


        b.startAnimation(animation);
        findViewById(R.id.button).postDelayed(new Runnable() {
            @Override
            public void run() {

                TextView tv=(TextView) findViewById(R.id.tv1);
                tv.setVisibility(View.VISIBLE);
                TextView b;
                b=(TextView) findViewById(R.id.tv1);
                Animation animation= AnimationUtils.loadAnimation(CodeTest.this,R.anim.sample_anim);

                b.startAnimation(animation);
                String te=list.toString().trim();
                tv.setText(te);

            }
        }, 1000);



    }
}
}