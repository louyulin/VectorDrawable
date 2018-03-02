package com.example.lyl.animationart;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
/**c'le
 * 1.VectorDrawable 很适应icon和小图标等~
 * 2.svg加载速度快但是渲染比png慢
 */
public class VectorDemo extends AppCompatActivity implements View.OnClickListener {

    static {

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    private ImageView imageView;
    private ImageView bianse;
    private ImageView searchbar;
    private Button toLbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vectordemo);
        initView();
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.anim);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();

                }
            }
        });
        bianse = (ImageView) findViewById(R.id.bianse);
        bianse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = bianse.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();

                }
            }
        });
        searchbar = (ImageView) findViewById(R.id.searchbar);
        searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = searchbar.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });


        toLbtn = (Button) findViewById(R.id.toLbtn);
        toLbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toLbtn:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    startActivity(new Intent(VectorDemo.this,MainLActivity.class));
                }else {
                    Toast.makeText(this, "系统不支持,请适宜用5.0以上", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
