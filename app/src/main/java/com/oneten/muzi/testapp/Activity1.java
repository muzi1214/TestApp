package com.oneten.muzi.testapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Ali Haider on 7/12/2016.
 */
public class Activity1 extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Display the fragment
        setContentView(R.layout.activity1);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        LoginFragment loginFragment=new LoginFragment();
        fragmentTransaction.add(R.id.fragment_container,loginFragment);
        fragmentTransaction.commit();

        textView=(TextView)findViewById(R.id.tvReg_user);

        textView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                RegisterFragment registerFragment=new RegisterFragment();
                fragmentTransaction.add(R.id.fragment_container,registerFragment);
                fragmentTransaction.commit();
                textView.setText("Back to login");


            }
        });
    }
}
