package com.example.y.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.animation.Anim;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imageView=findViewById( R.id.imageview );

        Anim anim = new Anim();

        anim.setScaleAnimation(imageView,2000);

    }
}
