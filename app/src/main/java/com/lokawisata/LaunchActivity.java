package com.lokawisata;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        LaunchAnimation();
    }

    private void LaunchAnimation() {
        // Ambil referensi ke elemen yang akan dianimasikan
        View circleView = findViewById(R.id.startup_logo);

        // Atur skala awal dan akhir dari animasi
        float startScale = 0.0f;
        float endScale = 1.0f;

        // Atur durasi animasi dalam milidetik
        long duration = 2000;

        // Buat animator untuk mengubah skala elemen dari 0 menjadi 1 (memperbesar)
        ValueAnimator scaleAnimator = ValueAnimator.ofFloat(startScale, endScale);
        scaleAnimator.setDuration(duration);

        // Atur interpolator untuk efek animasi yang lebih halus
        scaleAnimator.setInterpolator(new AccelerateDecelerateInterpolator());

        // Tambahkan pembaruan nilai skala ke listener animator
        scaleAnimator.addUpdateListener(animation -> {
            float scale = (float) animation.getAnimatedValue();
            circleView.setScaleX(scale);
            circleView.setScaleY(scale);
        });

        // Buat animator untuk mengubah tingkat alpha elemen dari 0 menjadi 1 (muncul secara bertahap)
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(circleView, "alpha", 0f, 1f);
        alphaAnimator.setDuration(duration);

        // Buat animator set untuk menggabungkan kedua animator
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(scaleAnimator, alphaAnimator);

        // Mulai animasi
        animatorSet.start();

        // Menambahkan Listener ke Animasi - pindah Activity
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(LaunchActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}