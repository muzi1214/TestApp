package com.oneten.muzi.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button new1,new2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code to make it fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new1=(Button) findViewById(R.id.bActivity1);
        new1.setOnClickListener(this);
        new2=(Button) findViewById(R.id.bActivity2);
        new2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bActivity1:
                Intent a=new Intent(this,Activity1.class);
                startActivity(a);
                break;
            case R.id.bActivity2:
                Intent b=new Intent(this,Activity2.class);
                startActivity(b);
                break;
        }
    }
}
