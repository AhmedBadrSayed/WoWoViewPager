package com.nightonke.wowoviewpagerexample;

import android.os.Bundle;

import com.nightonke.wowoviewpager.Animation.ViewAnimation;
import com.nightonke.wowoviewpager.Animation.WoWoScaleAnimation;

public class WoWoScaleAnimationActivity extends WoWoActivity {

    @Override
    protected int contentViewRes() {
        return R.layout.activity_wowo_scale_animation;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewAnimation animation = new ViewAnimation(findViewById(R.id.test));
        animation.add(WoWoScaleAnimation.builder().page(0).start(0).end(1).fromXY(1).toXY(0.5).build());
        animation.add(WoWoScaleAnimation.builder().page(1).start(0).end(1).fromXY(0.5).toXY(4).build());
        animation.add(WoWoScaleAnimation.builder().page(2).start(0).end(0.5).fromX(4).toX(1).keepY(4).build());
        animation.add(WoWoScaleAnimation.builder().page(2).start(0.5).end(1).keepX(1).fromY(4).toY(1).build());
        animation.add(WoWoScaleAnimation.builder().page(3).start(0).end(0.5).keepX(1).fromY(1).toY(3).build());
        animation.add(WoWoScaleAnimation.builder().page(3).start(0.5).end(1).fromX(1).toX(3).keepY(3).build());
        wowo.addAnimation(animation);

        wowo.setEase(ease);
        wowo.setUseSameEaseBack(useSameEaseTypeBack);
        wowo.ready();
    }
}
