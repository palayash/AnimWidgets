package com.example.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/**
 * Created by y on 4/10/2018.
 */

public class Anim  {

    public void setScaleAnimation(View view,int dureation) {


        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(dureation);
        view.startAnimation(anim);
    }



}
