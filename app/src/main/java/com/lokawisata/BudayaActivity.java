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

public class BudayaActivity extends FragmentActivity {

    public final long delay = 250;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvBudaya1);
        CardView cardView2 = findViewById(R.id.cvBudaya2);
        CardView cardView3 = findViewById(R.id.cvBudaya3);
        CardView cardView4 = findViewById(R.id.cvBudaya4);
        CardView cardView5 = findViewById(R.id.cvBudaya5);
        CardView cardView6 = findViewById(R.id.cvBudaya6);
        CardView cardView7 = findViewById(R.id.cvBudaya7);
        CardView cardView8 = findViewById(R.id.cvBudaya8);

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
            String judul = "taman ujung";
            String lokasi = "Taman Ujung, Tumbu, Kec. Karangasem, Kabupaten Karangasem, Bali 80811";
            String deskripsi = "Taman Ujung Karangasem Water Palace atau sering di sebut dengan nama Taman Sukasada, salah satu tempat wisata di Bali timur yang sangat jarang di kunjungi oleh wisatawan domestik, namun banyak di kunjungi wisatawan asing. Taman Ujung Karangasem, salah satu tempat favorit calon pengantin untuk melakukan foto pre wedding. Baik calon pengantin orang Bali atau dari daerah lain di Indonesia. Malahan Taman Ujung Karangasem Bali, lebih terkenal sebagai tempat pre wedding di bandingkan sebagai salah satu tempat wisata Bali.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FTaman_Ujung.mp4?alt=media&token=6c2f28fe-6a7b-4ee9-b137-53d0949dd36f";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Ftaman%20ujung.png?alt=media&token=c3e87fa0-6c32-4b8c-917a-d7e5756cda95";
            int gambar = R.drawable.img_taman_ujung;
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
            String judul = "candi borobudur";
            String lokasi = "Jl. Badrawati, Borobudur, Magelang, Jawa Tengah.";
            String deskripsi = "Candi Borobudur adalah sebuah candi yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi dengan banyak stupa ini didirikan oleh para penganut agama Budha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa syailendra";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FCandi_Borobudur.mp4?alt=media&token=1c3ecad6-5ffa-42f9-9960-39ea7f35e71c";
            String qrCode= "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fcandi%20borobudur.png?alt=media&token=d80fa681-de5b-4893-b854-3dca85f7c7e2";
            int gambar = R.drawable.img_candi_borobudur;
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
            String judul = "istana maimun";
            String lokasi = "Jl. Brigjend Katamso No.66, A U R, Kec. Medan Maimun, Kota Medan, Sumatera Utara 20151";
            String deskripsi = "Istana Maimun adalah istana Kesultanan Deli yang merupakan salah satu ikon Kota Medan, Sumatra Utara. Istana ini terletak di Jalan Brigadir Jenderal Katamso, Aur, Medan Maimun. Istana Maimun didesain oleh arsitek Capt. Istana Maimun menjadi tujuan wisata bukan hanya karena usianya yang tua, tetapi juga desain interiornya yang unik, memadukan unsur-unsur warisan kebudayaan Melayu Deli, dengan gaya Islam, Spanyol, India, Belanda dan Italia.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FIstana_Maimun.mp4?alt=media&token=241cd92b-54c9-417b-afcc-3c6ea2e676c1";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fistana%20maimun.png?alt=media&token=b98ad79e-2350-405c-9579-209a6909b04d";
            int gambar = R.drawable.img_istana_maimun;
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
            String judul = "ngarai sianok";
            String lokasi = "Taman Jl. Panorama, Kayu Kubu, Kec. Guguk Panjang, Kota Bukittinggi, Sumatera Barat 26136";
            String deskripsi = "Ngarai Sianok merupakan sebuah lembah yang memiliki panjang 15 kilometer dan lebar 200 meter. Lembah mengagumkan ini melintasi 3 kawasan di Bukittinggi yaitu Nagari Koto Gadang, Nagari Sianok Enam Suku, dan Palupuh. Selain itu, lembah yang satu ini juga menjadi habitat flora dan fauna.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FNgarai_Sianok.mp4?alt=media&token=f649bad4-3267-4b98-990e-6f0d85a4a317";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fngarai%20sianok.png?alt=media&token=7359a1a8-0f11-4b00-a5df-ac51474a7fd7";
            int gambar = R.drawable.img_ngarai_sianok;
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
            String judul = "kampung adat praijing";
            String lokasi = "Desa Tebara, Kecamatan Waikabubak, Kabupaten Sumba Barat, Provinsi Nusa Tenggara Timur (NTT)";
            String deskripsi = "Kampung ini dikenal sebagai kampung wisata yang memiliki 38 rumah tradisional Sumba. Sebelumnya, di kampung ini terdapat 42 rumah tradisional, tetapi kini hanya 38 yang tersisa akibat terjadinya kebakaran pada tahun 2000. Rumah-rumah ini merupakan rumah panggung dengan atap berundak yang menjulang ke atas seperti halnya menara. Rumah-rumah adat di kampung ini terdiri dari tiga bagian, yaitu Lei Bangun (bagian bawah) yang digunakan untuk memelihara hewan ternak, Rongu Uma (bagian tengah) yang ditinggali oleh penghuni, dan Uma Daluku (bagian atas atau menara) untuk menyimpan bahan makanan dan alat pusaka. Bagian atas juga memiliki fungsi keagamaan sebagai tempat tinggal arwah leluhur sesuai dengan agama tradisional masyarakat Sumba yang disebut Marapu.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FKampung_Adat_Praijing.mp4?alt=media&token=d8a708c4-a549-4d5d-9800-7eb409fdb675";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fkampung%20adat%20praijing.png?alt=media&token=d8126155-247b-4497-ad66-ba0cb81a1513";
            int gambar = R.drawable.img_kampung_adat_praijing;
            int background = R.drawable.bg_budaya;

            // Membawa Item dari Deskripsi di atas
            intent.putExtra("judul", judul);
            intent.putExtra("lokasi",lokasi);
            intent.putExtra("deskripsi", deskripsi);
            intent.putExtra("videoLink", videoLink);
            intent.putExtra("gambar", gambar);
            intent.putExtra("qrCode", qrCode);
            intent.putExtra("background", background);

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
            String judul = "wae rebo village";
            String lokasi = "Satar Lenda, Kec. Satar Mese Bar., Kabupaten Manggarai, Nusa Tenggara Timur.";
            String deskripsi = "Desa ini dikelilingi oleh pegunungan yang indah serta Hutan Todo yang rindang serta kaya akan vegetasi. Di hutan ini, Sobat Pesona dapat menemukan anggrek, berbagai jenis pakis, serta mendengar kicauan merdu dari beragam burung yang membuat suasana menjadi semakin ceria.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FWae_Rebo_Village.mp4?alt=media&token=1a2831ab-31e9-4e96-bee0-9d848d71749b";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Fwae%20rebo%20village.png?alt=media&token=f7adcb1d-2699-43cb-bf5c-6883d2f60dfb";
            int gambar = R.drawable.img_wae_rebo_village;
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
            String judul = "tirta gangga";
            String lokasi = "Jalan Raya Abang Desa Adat Jl. Raya Tirta Gangga, Ababi, Kec. Abang, Kabupaten Karangasem, Bali 80852";
            String deskripsi = "Objek wisata Tirta Gangga, dulunya sebuah taman air kerajaan Karangasem yang berada di Bali timur. Saat ini taman dan pemandian Tirta Gangga Karangasem berfungsi sebagai tempat wisata di Bali timur.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_budaya%2FTirta_Gangga.mp4?alt=media&token=c7a8c3d6-429e-4be9-9b41-f04fa653976f";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_budaya%2Ftirta%20gangga.png?alt=media&token=11deae1a-e4bf-4fcb-af3f-62915f72efea";
            int gambar = R.drawable.img_tirta_gangga;
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