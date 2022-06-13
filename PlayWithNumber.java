package com.uu.android7test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PlayWithNumber extends AppCompatActivity {
    Random rand = new Random();
    int n = (rand.nextInt(10))+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);
    }


    public void checkResult(View view) {

        EditText userInput =  (EditText) findViewById(R.id.UserInput);
        int foo = Integer.parseInt(userInput.getText().toString());
        if(n==foo){
            String Message = "You won in predic Game";
            TextView tv=(TextView) findViewById(R.id.ResultView);
            tv.setText(Message);

            userInput.setText("");
            findViewById(R.id.ResultView).postDelayed(new Runnable() {
                @Override
                public void run() {
                    tv.setText("");

                }
            }, 3000);
            int n = (rand.nextInt(10))+1;

        }
        else{
            String Message = "You Loss in predic Game"+n;
            TextView tv=(TextView) findViewById(R.id.ResultView);
            tv.setText(Message);  findViewById(R.id.ResultView).postDelayed(new Runnable() {
                @Override
                public void run() {
                    tv.setText("");

                }
            }, 3000);

        }
    }
}