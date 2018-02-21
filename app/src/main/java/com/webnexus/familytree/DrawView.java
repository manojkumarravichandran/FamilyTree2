package com.webnexus.familytree;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.Button;

/**
 * Created by mkm97 on 21/02/2018.
 */

public class DrawView extends View implements View.OnClickListener{
    Paint paint = new Paint();
    Canvas canvas;
    View a,b,c;
    public DrawView(Context context,View a_,View b_,View c_) {
        super(context);
        paint.setColor(Color.BLACK);
        a=a_;
        b=b_;
        c=c_;

    }

    @SuppressLint("NewApi")
    public void onDraw(Canvas canvas) {
       // canvas.drawLine(startView.getX()+25, startView.getY()+50, endView.getX()+25, endView.getY(), paint);
    }
    public void onClick(View v){
        if(v==a){
            canvas.drawLine(a.getX(),a.getY(),b.getX(),b.getY(),paint);
        }

    }


}
