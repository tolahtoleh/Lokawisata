package com.lokawisata;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends FragmentActivity {

    public final long delay = 250;
    private ScrollView scrollView;
    private TextView textDesk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Deklarasi id item
        ImageView back = findViewById(R.id.viewBack);
        TextView titleDesk = findViewById(R.id.titleDesc);
        Button btnDesk = findViewById(R.id.desk);
        Button btnMap = findViewById(R.id.map);
        Button btnPreview = findViewById(R.id.preview);
        LinearLayout bgGambar = findViewById(R.id.imageGambar);
        ImageView bgCard = findViewById(R.id.imageCard);
        scrollView = findViewById(R.id.scrollTextDesk);

        // Deklarasi ID deskripsi
        textDesk = findViewById(R.id.textDesk);
        TextView textMap = findViewById(R.id.textMap);
        ImageView imageMap = findViewById(R.id.imageMap);
        ImageView imagePreview = findViewById(R.id.previewPlay);

        Animator unSelectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.unselected_item);
        Animator selectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.selected_item);

        // Deklarasi Item Intent dari Activity sebelumnya
        String judul = getIntent().getStringExtra("judul");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String videoLink = getIntent().getStringExtra("videoLink");
        String lokasi = getIntent().getStringExtra("lokasi");
        int gambar = getIntent().getIntExtra("gambar",0);
        int background = getIntent().getIntExtra("background",0);
        String qrCode = getIntent().getStringExtra("qrCode");

        // SET Perubahan Item Sesuai dari Item yang didapat dari Intent dari Activity sebelumnya
        titleDesk.setText(judul);
        textDesk.setText(deskripsi);
        textMap.setText(lokasi);
        bgGambar.setBackgroundResource(gambar);
        bgCard.setImageResource(gambar);
        Glide.with(this)
                .load(qrCode).into(imageMap);

        View rootLayout = findViewById(R.id.root_detail);
        rootLayout.setBackgroundResource(background);


        // Back Listener
        back.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
                textDesk.setVisibility(View.VISIBLE);
            }
            else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
                textDesk.setVisibility(View.GONE);
            }
        });
        back.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                back.setForeground(getResources().getDrawable(R.color.white40));
                new Handler().postDelayed(() -> back.setForeground(null),delay);
            }

            Intent resultIntent = new Intent();
            setResult(RESULT_OK, resultIntent);
            finish();
        });

        // Desk Listener
        btnDesk.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                textDesk.setVisibility(View.VISIBLE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnDesk.setForeground(getResources().getDrawable(R.color.black40));
                }

            }
            else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnDesk.setForeground(null);
                }
                textDesk.setVisibility(View.GONE);
            }
        });
        btnDesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnDesk.setForeground(getResources().getDrawable(R.color.white40));
                    new Handler().postDelayed(() -> btnDesk.setForeground(null),delay);
                }
                scrollAuto();
            }
        });

        // Map Listener
        btnMap.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                textMap.setVisibility(View.VISIBLE);
                imageMap.setVisibility(View.VISIBLE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnMap.setForeground(getResources().getDrawable(R.color.black40));
                }
            }
            else {
                textMap.setVisibility(View.GONE);
                imageMap.setVisibility(View.GONE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnMap.setForeground(null);
                }
            }
        });

        // Preview Listener
        btnPreview.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                imagePreview.setVisibility(View.VISIBLE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnPreview.setForeground(getResources().getDrawable(R.color.black40));
                }
            }
            else {
                imagePreview.setVisibility(View.GONE);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    btnPreview.setForeground(null);
                }
            }
        });
        // Video Play Activity Listener
        btnPreview.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                imagePreview.setForeground(getResources().getDrawable(R.color.white40));
                new Handler().postDelayed(() -> imagePreview.setForeground(null),delay);
            }

            Intent intent = new Intent(this,VideoActivity.class);
            intent.putExtra("videoLink",videoLink);
            intent.putExtra("background",background);
            startActivity(intent);
        });
    }

    private void scrollAuto() {
        // Mendapatkan posisi awal ScrollView
        int startScrollY = scrollView.getScrollY();

        // Mendapatkan tinggi 3 baris teks
        int lineHeight = textDesk.getLineHeight();
        int threeLinesHeight = lineHeight * 3;

        // Mendapatkan posisi akhir untuk animasi scroll
        int endScrollY;
        boolean isScrollDown;

        // Cek apakah posisi awal berada di atas 3 baris
        if (startScrollY <= threeLinesHeight) {
            // Scroll ke bawah jika sudah di atas 3 baris
            endScrollY = textDesk.getBottom() - scrollView.getHeight();
            isScrollDown = true;
        } else {
            // Scroll ke atas jika sudah di bawah 3 baris
            endScrollY = textDesk.getTop();
            isScrollDown = false;
        }

        // Membuat animasi scroll
        Animation scrollAnimation = new TranslateAnimation(0, 0, 0, endScrollY - startScrollY);
        scrollAnimation.setDuration(500); // Durasi animasi dalam milidetik

        // Mulai animasi scroll
        scrollView.startAnimation(scrollAnimation);

        // Scroll ScrollView ke posisi akhir setelah animasi selesai
        scrollView.postDelayed(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0, endScrollY);
            }
        }, 500); // Delay 500ms sesuai dengan durasi animasi

        // Jika scroll ke bawah, beri fokus pada TextView setelah animasi selesai
        if (isScrollDown) {
            scrollView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textDesk.requestFocus();
                }
            }, 500);
        }
    }

}