package com.lokawisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class AgroActivity extends FragmentActivity {

    public final long delay = 250;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agro);

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvAgro1);
        CardView cardView2 = findViewById(R.id.cvAgro2);
        CardView cardView3 = findViewById(R.id.cvAgro3);
        CardView cardView4 = findViewById(R.id.cvAgro4);
        CardView cardView5 = findViewById(R.id.cvAgro5);
        CardView cardView6 = findViewById(R.id.cvAgro6);
        CardView cardView7 = findViewById(R.id.cvAgro7);
        CardView cardView8 = findViewById(R.id.cvAgro8);

        // Deklarasi Animasi Dipilih/Tidak
        Animator unSelectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.unselected_item);
        Animator selectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.selected_item);

        // Silahkan ke KulinerActivity untuk Penjelasan Lengkap

        // Back Listener
        back.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            }
            else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        back.setOnClickListener(v -> {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                back.setForeground(getResources().getDrawable(R.color.white40));
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                new Handler().postDelayed(() -> back.setForeground(null),delay);
            }

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        // Card View 1 Listener
        cardView1.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            }
            else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
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

        // Card View 2 Listener
        cardView2.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView2.setOnClickListener(v -> {
            cardView2.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView2.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "kopeng gunungsari";
            String lokasi = "Jl. Umbul Songo, Kopeng, Kec. Getasan, Semarang, Jawa Tengah 50774";
            String deskripsi = "Agrowisata Kopeng Gunungsari menyajikan perpaduan keindahan taman bunga yang berpadu dengan kebun buah jambu.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FKopeng_Gunungsari.mp4?alt=media&token=7fcf57ca-0ab8-440a-8393-84425dff6b7a";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fkopeng_gunung_sari.png?alt=media&token=e7c97018-d621-479f-9979-9d442eb16685";
            int gambar = R.drawable.img_kopeng_gunungsari;
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

        // Card View 3 Listener
        cardView3.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView3.setOnClickListener(v -> {
            cardView3.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView3.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "kebun raya bogor";
            String lokasi = "Jl. Ir. H. Juanda No.13, Paledang, Kecamatan Bogor Tengah, Kota Bogor, Jawa Barat 16122";
            String deskripsi = "Kebun raya luas dan indah yang memamerkan beragam bunga & tanaman tropis.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FKebon_Raya_Bogor.mp4?alt=media&token=e5708661-6d02-441d-a453-3ab4725aa21e";
            String qrCode ="https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fkebun_raya_bogor.png?alt=media&token=31a05d5a-d040-4a5d-94d2-1d3561c99236";
            int gambar = R.drawable.img_kebun_raya_bogor;
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

        // Card View 4 Listener
        cardView4.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView4.setOnClickListener(v -> {
            cardView4.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView4.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "merapi farma herbal";
            String lokasi = "Jl. Manunggal Bakti No.9, RW.11, Kalisari, Kec. Ps. Rebo, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13790";
            String deskripsi = "Tempat ini tepat untuk berwisata sambil belajar aneka tanaman herbal. Selain sebagai kawasan agrowisata, tempat ini juga sebagai tempat produksi jamu godhog, mulai dari produksi sampai penbibitan dan penanaman bahan baku semuanya dilakukan di tempat ini.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FMerapi_Farma_Herbal.mp4?alt=media&token=3d480b31-16a3-4709-afa4-0ac189d1cb6b";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fmerapi_farma_herbal.png?alt=media&token=b792e576-474e-4d94-b39a-69db71fdc203";
            int gambar = R.drawable.img_merapi_farma_herbal;
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

        // Card View 5 Listener
        cardView5.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView5.setOnClickListener(v -> {
            cardView5.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView5.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "taman buah mekarsari";
            String lokasi = "Jalan Raya Cileungsi -Jonggol KM.3, Mekarsari, Cileungsi, Kabupaten Bogor, Jawa Barat 16820";
            String deskripsi = "Taman Rekreasi dan Buah Mekarsari atau Taman Wisata Mekarsari adalah pusat konservasi keanekaragaman hayati buah-buahan tropis, dari seluruh wilayah di Indonesia dan belahan dunia lainnya.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FTaman_Buah_Mekarsari.mp4?alt=media&token=53c829d5-d185-45a1-a0ab-c593a828973a";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Ftaman_buah_mekarsari.png?alt=media&token=51344f90-9e8a-417d-8c52-04f18b26ff64";
            int gambar = R.drawable.img_taman_buah_mekarsari;
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

        // Card View 6 Listener
        cardView6.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView6.setOnClickListener(v -> {
            cardView6.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView6.setForeground(null),delay);

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

        // Card View 7 Listener
        cardView7.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView7.setOnClickListener(v -> {
            cardView7.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView7.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "milkindo green farm";
            String lokasi = "Ngempit, Tegalsari, Kec. Kepanjen, Kabupaten Malang, Jawa Timur 65163";
            String deskripsi = "Wisata edukasi sapi perah Milkindo Berka Abadi di Desa Tegalsari Kepanjen kabupaten malang. terdapat playground dan spot berfoto selfie yang instagramable.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FMilkindo_Green_Farm.mp4?alt=media&token=c4fcc80b-9fa6-41b2-bc33-f1a53e56da52";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fmilkindo_green_farm.png?alt=media&token=7dc9794e-3a55-40b6-b571-18740b320c59";
            int gambar = R.drawable.img_milkindo_green_farm;
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

        // Card View 8 Listener
        cardView8.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView8.setOnClickListener(v -> {
            cardView8.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView8.setForeground(null),delay);

            // Pindah Activity
            Intent intent = new Intent(this,DetailActivity.class);

            // Deskripsi Input ke Activity tujuan
            String judul = "narmada botanic green";
            String lokasi = "Jl. Wirabakti, Gandari, Narmada, Lembuak, Kec. Narmada, Kabupaten Lombok Barat, Nusa Tenggara Bar. 83371";
            String deskripsi = "Narmada Botanic Garden merupakan wisata berupa taman bunga, dimana taman binga yang indah ini berada di Dusun Narmada. Wisatawan yang berkunjung akan disuguhi aneka jenis bunga yang sedang bermekaran, selain itu ada juga jenis buah dan sayur yang di tanam disini. Wisata yang indah dan menarik in memiliki berbagai daya tarik dan fasilitas unik lainnya, keindahan bunga yang bermekaran warna warni tentunya spot instagramable yang indah akan tercipta di berbagai sudut tempat wisata ini";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fagrowisata%2FNarmada_Botanic_Garden.mp4?alt=media&token=3bbf9c66-20c0-4346-bfec-b2a47ee1ac37";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fagrowisata%2Fnarmada_botanic_garden.png?alt=media&token=e2d8a1d1-9c87-4fa0-926f-762bbb490b50";
            int gambar = R.drawable.img_narmada_botanic_green;
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