package com.oneten.muzi.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button new1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code to make it fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new1=(Button) findViewById(R.id.bNewActivity1);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bNewActivity1:
                Intent i=new Intent(this,NewActivity1.class);
                startActivity(i);
                break;
        }
    }
}
