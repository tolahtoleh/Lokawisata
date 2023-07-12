package com.lokawisata;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import org.w3c.dom.Text;

public class MainActivity extends Activity{

    public final long delay = 250;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deklarasi ID
        ImageView homeSearch = findViewById(R.id.viewSearch);
        TextView homeBahari = findViewById(R.id.homeKategori1);
        TextView homeBudaya = findViewById(R.id.homeKategori2);
        TextView homeAgro = findViewById(R.id.homeKategori3);
        TextView homeKuliner = findViewById(R.id.homeKategori4);
        TextView homeAlam = findViewById(R.id.homeKategori5);

        Animator selected = AnimatorInflater.loadAnimator(this,R.animator.selected_item);
        Animator unSelected = AnimatorInflater.loadAnimator(this,R.animator.unselected_item);

        homeSearch.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeSearch.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeSearch.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeSearch.setForeground(null),delay);
            }
        });

        // Click Listener - Pindah Activity Button 1 - 5
        homeBahari.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeBahari.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeBahari.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeBahari.setForeground(null),delay);
            }

            Intent intent = new Intent(this,BahariActivity.class);
            startActivity(intent);
        });

        homeBudaya.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeBudaya.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeBudaya.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeBudaya.setForeground(null),delay);
            }

            Intent intent = new Intent(this,BudayaActivity.class);
            startActivity(intent);
        });

        homeAgro.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeAgro.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeAgro.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeAgro.setForeground(null),delay);
            }

            Intent intent = new Intent(this,AgroActivity.class);
            startActivity(intent);
        });

        homeKuliner.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeKuliner.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeKuliner.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeKuliner.setForeground(null),delay);
            }

            Intent intent = new Intent(this,KulinerActivity.class);
            startActivity(intent);
        });

        homeAlam.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        homeAlam.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                homeAlam.setForeground(getResources().getDrawable(R.color.white40));

                new Handler().postDelayed(() -> homeAlam.setForeground(null),delay);
            }

            Intent intent = new Intent(this,CagarAlamActivity.class);
            startActivity(intent);
        });

        CardView cardView2 =findViewById(R.id.cvAlam1);
        cardView2.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                unSelected.start();
            }
            else {
                selected.setTarget(v);
                unSelected.start();
            }
        });
        cardView2.setOnClickListener(v -> {
            cardView2.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView2.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "gunung ijen";
            String lokasi = "Desa Tamansari, Kecamatan Licin, Kabupaten Banyuwangi, Jawa Timur";
            String deskripsi = "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.386 mdpl. Gunung Ijen terakhir meletus pada tahun 1999. Salah satu fenomena alam yang paling terkenal dari Gunung Ijen adalah blue fire (api biru) di dalam kawah yang terletak di puncak gunung tersebut. Pendakian gunung ini bisa dimulai dari dua tempat, yakni dari Banyuwangi atau dari Bondowoso.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FGunung_Ijen.mp4?alt=media&token=8371a478-ceb3-481f-a34d-e81d92ea2fbc";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Fgunung%20ijen.png?alt=media&token=23a05989-1b7d-4fd1-b4d6-9207cefd281f";
            int gambar = R.drawable.img_gunung_ijen;
            int background = R.drawable.bg_alam;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });

        CardView cardView5 = findViewById(R.id.cvKuliner5);
        cardView5.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
              selected.setTarget(v);
              selected.start();
            } else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        cardView5.setOnClickListener(v -> {
            cardView5.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView5.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "galabo";
            String lokasi = "Jalan Kapten Mulyadi, Desa Kedung Lumbu, Kec. Pasar Kliwon, Kota Surakata.";
            String deskripsi = "Galabo adalah singkatan dari Gladag Langen Bogan, sebuah tempat wisata kuliner malam di kota Solo. Sebelum bergeser, lokasinya berada di sebelah timur bundaran Gladag, tepatnya di Jalan Mayor Sunaryo depan Beteng Trade Center dan Pusat Grosir Solo. Lantaran berada di area jalan, Galabo tutup pada siang hari dan hanya buka saat malam. Setelah Juni 2018, Galabo ditempatkan di kawasan parkir sebelah selatan Benteng Vastenburg atau tepat di depan Pusat Grosir Solo (PGS). Lokasi baru ini dinilai lebih representatif karena tak perlu menutup jalan.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FGalabo.mp4?alt=media&token=7e875493-0bf2-4a4e-8ab8-10709c381aa5";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fgalabo%20solo.png?alt=media&token=f202cf54-09b9-46f9-99f1-6b2edb772990";
            int gambar = R.drawable.img_galabo;
            int background = R.drawable.bg_kuliner;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });

        CardView cardView6 = findViewById(R.id.cvBahari6);
        cardView6.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
              selected.setTarget(v);
              selected.start();
            } else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        cardView6.setOnClickListener(v -> {
            cardView6.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView6.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "kabupaten raja ampat";
            String lokasi = "Kabupaten Raja Ampat, Provinsi Papua Barat";
            String deskripsi = "Nama Raja Ampat sendiri diyakini berasal dari legenda masyarakat setempat yang percaya bahwa zaman dahulu kala ada seorang wanita yang menemukan tujuh telur, empat telur tersebut menetas menjadi raja-raja yang berkuasa di empat pulau utama. Tersisa tiga lainnya, satu menjadi batu, satu menjadi wanita, dan satu lagi menjadi makhluk gaib atau hantu.Terlepas legenda yang dipercayai masyarakat setempat, keindahan yang disuguhkan oleh Raja Ampat merupakan fakta yang tak bisa diganggu gugat. Wilayah perairan Raja Ampat adalah salah satu destinasi diving terbaik di dunia. Destinasi ini memiliki kekayaan dan keunikan spesies yang tinggi dengan ditemukannya 1.318 jenis ikan, 699 jenis moluska (hewan lunak), dan 537 jenis terumbu karang. Rasakan sendiri sensasi menyelam dan bertemu dengan ragam jenis biota laut yang unik, seperti kuda laut kerdil (pygmy seahorse), ikan kelelawar, hingga dugong bisa kamu temukan di wilayah perairan Raja Ampat.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FKepulauan_Raja_Ampat.mp4?alt=media&token=e876faba-624d-42f7-9c71-d8694cf6cc63";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fkabupaten%20raja%20ampat.png?alt=media&token=6ea8bb94-c41c-428e-8506-ca4520940f3e";
            int gambar = R.drawable.img_kabupaten_raja_ampat;
            int background = R.drawable.bg_bahari;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });

        CardView cardView4 = findViewById(R.id.cvAgro6);
        cardView4.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selected.setTarget(v);
                unSelected.start();
            } else {
                selected.setTarget(v);
                unSelected.start();
            }
        });
        cardView4.setOnClickListener(v -> {
            cardView4.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView4.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "bagus agro pelaga";
            String lokasi = "Jl. Raya Pura Pucak Mangu, Pelaga, Kec. Petang, Kabupaten Badung, Bali 80353";
            String deskripsi = "Rumah bergaya Bali yang elegan dilengkapi beranda berfurnitur lengkap dengan pemandangan taman tropis, fasilitas pembuat teh dan kopi, serta sajian buah tropis segar setiap harinya. Fasilitas eco-resor ini meliputi 2 restoran, taman, kolam renang outdoor, dan pertunjukan pembuatan produk tradisional.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FBagus_Agro_Pelaga.mp4?alt=media&token=28c2a50a-8368-49c0-9498-297038750dae";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fbagus_argo_pelaga.png?alt=media&token=e1a99f40-5ef5-4999-9f1b-e0ede575fe9f";
            int gambar = R.drawable.img_bagus_agro_pelaga;
            int background = R.drawable.bg_agro;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });

        CardView cardView7 = findViewById(R.id.cvBudaya6);
        cardView7.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
              selected.setTarget(v);
              selected.start();
            } else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        cardView7.setOnClickListener(v -> {
            cardView7.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView7.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "museum ullen sentalu";
            String lokasi = "Jl. Boyong No.KM 25, Kaliurang, Hargobinangun, Kec. Pakem, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55582";
            String deskripsi = "Museum ini merupakan salah satu museum yang mengenalkan kebudayaan para bangsawan Mataram. Selain menampilkan kebudayaan masa Kerajaan Mataram Islam, Museum Ullen Sentalu juga menampilkan kehidupan para bangsawan di masa Kasunanan Surakarta, Kasultanan Yogyakarta, Praja Mangkunegaran, dan Kadipaten Pakualaman.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FUllen_Sentalu.mp4?alt=media&token=5ea3ff9e-c013-40d6-80b9-77bb9203d9bb";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fmuseum%20ullen%20sentalu.png?alt=media&token=7c617628-8146-47e7-a105-2b8adca07183";
            int gambar = R.drawable.img_museum_ullen_sentalu;
            int background = R.drawable.bg_budaya;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });

        CardView cardView1 = findViewById(R.id.cvAgro1);
        cardView1.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
              selected.setTarget(v);
              selected.start();
            }
            else {
                unSelected.setTarget(v);
                unSelected.start();
            }
        });
        cardView1.setOnClickListener(v -> {
            cardView1.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView1.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "bhumi merapi";
            String lokasi = "Jl. Kaliurang No.Km.20, Sawungan, Hargobinangun, Kec. Pakem, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55582";
            String deskripsi = "Taman pertanian tempat pengunjung bisa memerah susu kambing, memberi makan kelinci & selfie di Santorini mini.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FBhumi_Merapi.mp4?alt=media&token=57b35ae1-6a5e-497c-aec6-792babfb9da4";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fbhumi_merapi.png?alt=media&token=b0610456-8f44-4fcc-963e-6b8e108989b8";
            int gambar = R.drawable.img_bhumi_merapi;
            int background = R.drawable.bg_agro;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("background", background);
            intent.putExtra("qrCode", qrCode);

            // Mulai pindah
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // Aksi yang diambil setelah kembali dari TujuanActivity
            }
        }
    }
}
