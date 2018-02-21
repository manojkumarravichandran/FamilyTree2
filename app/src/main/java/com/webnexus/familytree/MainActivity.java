package com.webnexus.familytree;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button add;
    CoordinatorLayout cl;
    static int id=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl=(CoordinatorLayout)findViewById(R.id.cl);
        add =(Button)findViewById(R.id.add);
        Button mb=new Button(this);
        mb.setText("new Button");
        cl.addView(mb);
        add.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v==add){
            startActivity(new Intent(MainActivity.this,.class));
        }
    }



}
