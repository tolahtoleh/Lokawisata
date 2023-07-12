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

public class CagarAlamActivity extends FragmentActivity {

    public final long delay = 250;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cagar_alam);

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvAlam1);
        CardView cardView2 = findViewById(R.id.cvAlam2);
        CardView cardView3 = findViewById(R.id.cvAlam3);
        CardView cardView4 = findViewById(R.id.cvAlam4);
        CardView cardView5 = findViewById(R.id.cvAlam5);
        CardView cardView6 = findViewById(R.id.cvAlam6);
        CardView cardView7 = findViewById(R.id.cvAlam7);
        CardView cardView8 = findViewById(R.id.cvAlam8);

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
            String judul = "taman nasional gunung leuser";
            String lokasi = "Barisan mountain range, Aceh 24653";
            String deskripsi = "Taman Nasional Gunung Leuser merupakan kawasan konservasi yang juga menjadi destinasi pariwisata di Sumatera Utara. Bukit Lawang dan Tangkahan merupakan dua tempat yang menjadi primadona pariwisata wilayah yang ditunjuk oleh UNESCO sebagai Tropical Rainforest Heritage of Sumatera (TRHS). Tangkahan berada di Kecamatan Batang Serangan, Kabupaten Langkat, Prov.Sumatera Utara memiliki daya tarik utama gajah sumatera.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FGunung_Leuser.mp4?alt=media&token=06a825c4-cd8a-4b5e-bcf7-8c87c67e0824";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20gunung%20leuseur.png?alt=media&token=4ee6e707-66f8-4d2e-b42b-0aacfb7f904e";
            int gambar = R.drawable.img_gunung_leuseur;
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
            String judul = "green canyon cukang taneuh";
            String lokasi = "Desa Kertayasa Kecamatan Cijulang, Kabupaten Pangandaran";
            String deskripsi = "Objek Wisata Green Canyon atau Cukang Taneuh menyajikan panorama dua tebing hasil pahatan alam dengan rerimbunan pohon yang tumbuh diatasnya mengapit kokoh sungai Cijulang. Sinar matahari yang jatuh ke permukaan sungai dengan air berkelir hijau lumut terbelah bebatuan raksasa yang menyembul, membentuk garis-garis cahaya indah.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FCukang_Taneuh.mp4?alt=media&token=6ac05666-eded-4c4f-a126-7cea29ffed64";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Fcukang%20taneuh.png?alt=media&token=0b333cdf-f240-4c54-8636-d2aa8ea4b1d8";
            int gambar = R.drawable.img_green_canyon_cukang_taneuh;
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
            String judul = "taman nasional ujung kulon";
            String lokasi = "Jl. Perintis Kemerdekaan No.51 Kec. Labuan, Kab. Pandeglang, Provinsi Banten. 42264";
            String deskripsi = "Selain pesona lanskap alam yang memukau mata, Sobat Pesona juga bakal dimanjakan pesisir pantai dan suasana sejuknya bukit hijau di sekitar Taman Nasional Ujung Kulon. Beberapa destinasi unggulan di Taman Nasional ini antara lain, Pulau Peucang, sebuah pulau dengan pantai jernih berpasir putih, yang biasa dijadikan lokasi ideal untuk snorkeling, diving, serta berjelajah menyaksikan kehidupan satwa liar seperti rusa, banteng, dan monyet ekor panjang.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FUjung_Kulon.mp4?alt=media&token=b39f0c15-913b-43fa-b48d-883e75a40c49";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20ujung%20kulon.png?alt=media&token=c76ffd11-fa72-429c-9b50-837a86bf7467";
            int gambar = R.drawable.img_ujung_kulon;
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
            String judul = "taman nasional kerinci seblat";
            String lokasi = "Taman Nasional Kerinci Seblat, Lubuk Gadang Selatan, Kabupaten Solok Selatan, Sumatra Barat";
            String deskripsi = "Lanskap Taman Nasional Kerinci Seblat (TNKS) merupakan kawasan hutan tropis penting dunia yang terletakdi rangkaian pegunungan bukit barisan selatan bagian tengah pada koordinat 100o31'18”-102o44' BT dan 17'13” - 326'14”LS. Kawasan hutan TNKS menjadi habitat bagi sejumlah populasi satwa langka seperti Harimau Sumatera, Gajah Sumatera, Badak Sumatra, Kijang Sumatera (yang baru diketahui 2007) dan lebih dari 372 jenis burung termasuk 16 jenis burung endemik.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FKerinci_Seblat.mp4?alt=media&token=1f6aa7da-48a9-4252-90fe-3b0fa3d998ca";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20kerinci%20seblat.png?alt=media&token=854541a2-27fe-4e76-9002-39639a3da7ff";
            int gambar = R.drawable.img_kerinci_seblat;
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
            String judul = "taman nasional way kambas";
            String lokasi = "Kabupaten Lampung Timur, Lampung";
            String deskripsi = "Taman Nasional Way Kambas (TNWK) adalah taman nasional perlindungan gajah yang terletak di daerah Lampung tepatnya di Kecamatan Labuhan Ratu, Lampung Timur, Indonesia. Selain di Way Kambas, sekolah gajah (Pusat Latihan Gajah) juga bisa ditemui di Minas, Riau. Gajah Sumatra (Elephas maximus sumatranus) yang hidup di kawasan ini semakin berkurang jumlahnya.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FWay_Kambas.mp4?alt=media&token=89c448bb-52dd-461e-b573-2a5076f75462";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20way%20kambas.png?alt=media&token=5f61e674-5361-46a3-82ab-a4fe8769191f";
            int gambar = R.drawable.img_way_kambas;
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
            String judul = "taman nasional bukit dua belas";
            String lokasi = "Batu Sawar, Kec. Maro Sebo Ulu, Kabupaten Batang Hari, Jambi 36654";
            String deskripsi = "Kawasan seluas 54.780,41 hektar ini termasuk ke dalam taman nasional dengan ukuran yang relatif sempit dibandingkan yang lainnya. Meskipun begitu pesona alam yang dimiliki kawasan ini tidak kalah dengan taman nasional lain. Sebab disini terdapat ekosistem yang sangat langka, berbagai jenis flora dan fauna membentuk habitat di TNBD. Bahkan pesona dan kekayaan alamnya menjadikan kawasan ini sebagai destinasi wisata yang patut dikunjungi.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FBukit_Dua_Belas.mp4?alt=media&token=c6b3ec06-e4bb-4915-a672-5f0ee4682098";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20bukit%20dua%20belas.png?alt=media&token=13c7053e-0aed-4814-a195-3699e06335b5";
            int gambar = R.drawable.img_bukit_dua_belas;
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
            String judul = "bantimurung bulusaraung";
            String lokasi = "Kabupaten Maros, Kabupaten Pangkep, dan Kabupaten Bone di Sulawesi Selatan";
            String deskripsi = "Setelah populer melalui buku “The Malay Archipelago” lewat ekplorasi seorang naturalis Inggris bernama Alfred Russel Wallace pada 1857. Kelompok Hutan Bantimurung-Bulusaraung seluas 43.750 ha (terdiri dari cagar alam, taman wisata alam, hutan lindung, hutan produksi terbatas, hutan produksi tetap) ditetapkan sebagai Taman Nasional Bantimurung-Bulusaraung oleh Kementerian Kehutanan Republik Indonesia.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_cagar_alam%2FBantimurung_Bulusaraung.mp4?alt=media&token=eb4f2789-96a1-434f-813c-31c539bb7a50";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_cagar_alam%2Ftaman%20nasional%20bantimurung%20bulusaraung.png?alt=media&token=5e92d856-b7d9-4fe4-bb18-f1441b2fcc42";
            int gambar = R.drawable.img_bantimurung_bulusaraung;
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