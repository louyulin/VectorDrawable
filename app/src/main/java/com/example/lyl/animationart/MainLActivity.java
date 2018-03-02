package com.example.lyl.animationart;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainLActivity extends AppCompatActivity {

    private ImageView fivestart;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l);
        initView();

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView() {
        fivestart = (ImageView) findViewById(R.id.fivestart);
        AnimatedVectorDrawable drawable= (AnimatedVectorDrawable) getDrawable(R.drawable.fivestart_anim);
        fivestart.setImageDrawable(drawable);
        if (drawable != null){
            drawable.start();
        }
    }
}
