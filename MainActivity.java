package com.uu.android7test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(android.R.color.holo_purple));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        findViewById(R.id.splash).postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_main);

            }
        }, 3000);

    }

    public void attention(View view) {
        Button b;
        EditText UserName =  (EditText) findViewById(R.id.Username);
        EditText Pass=(EditText) findViewById(R.id.Password);
        String username = UserName.getText().toString();
        String pass=Pass.getText().toString();
        String Message = "Your Button Is Active & Your Inputed User Name : " + username + " and Password is : " + pass + "";
//        Toast toast = Toast.makeText(this, Message, Toast.LENGTH_LONG);
//        toast.show();

        b=(Button) findViewById(R.id.buttonLogin);
        Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);

        b.startAnimation(animation);
        findViewById(R.id.buttonLogin).postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.afterlogin_screen);
                UserName.setText("");
                Pass.setText("");

            }
        }, 1000);



    }


    public void PlayGame(View view) {
        Intent i=new Intent(getApplicationContext(),PlayWithNumber.class);
        startActivity(i);
    }

    public void HitNumber(View view) {
        Intent i=new Intent(getApplicationContext(),CodeTest.class);
        startActivity(i);
    }


}