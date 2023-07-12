package com.lokawisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class KulinerActivity extends FragmentActivity {

    // Deklarasi Waktu Click Listener
    public final long delay = 250;

    // Deklarasi untuk Pengenal Activity
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        // TODO: Tambahkan: android:clickable="true"
        //                  android:focusable="true"
        //                  android:focusableInTouchMode="true"
        //       pada Layout XML untuk Setiap Item
        //       Supaya item nya bisa Di Click, Fokus/Terpilih, dan Fokus saat di Sentuh/Pointing
        //       Bisa menggunakan metode lain dengan Menggunakan:
        //       1. Deklarasikan ID Itemnya
        //       2. Item yang sudah terdeklarasi bisa tambahkan:
        //          contoh: cardView1.setClickable(true);   //Default: false
        //       Bisa tambahkan "set" lain, jika diperlukan

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvKuliner1);
        CardView cardView2 = findViewById(R.id.cvKuliner2);
        CardView cardView3 = findViewById(R.id.cvKuliner3);
        CardView cardView4 = findViewById(R.id.cvKuliner4);
        CardView cardView5 = findViewById(R.id.cvKuliner5);
        CardView cardView6 = findViewById(R.id.cvKuliner6);
        CardView cardView7 = findViewById(R.id.cvKuliner7);
        CardView cardView8 = findViewById(R.id.cvKuliner8);

        // Deklarasi Animasi jika Dipilih/Tidak terpilih
        Animator unSelectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.unselected_item);
        Animator selectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.selected_item);

        // Back Listener
        back.setOnFocusChangeListener((v, hasFocus) -> {    // Listener untuk Animasi saat di fokuskan
            if (hasFocus){
                selectedAnimator.setTarget(v);  // Jika Item terpilih, Gambar akan Membesar
                selectedAnimator.start();
            }
            else {
                unSelectedAnimator.setTarget(v);    // Jika Item tidak terpilih, akan kembali ke semula
                unSelectedAnimator.start();
            }
        });

        // Listener Jika di Click
        back.setOnClickListener(v -> {

            // Set Animasi jika di Click di API khusus v23 keatas untuk ImageView
            // Berganti Warna Foreground saat di Click
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                back.setForeground(getResources().getDrawable(R.color.white40));
            }

            // Waktu Delay Animasi Click untuk menghilang
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                new Handler().postDelayed(() -> back.setForeground(null),delay);
            }

            // Ganti Activity
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        // Untuk Kebawahnya kode nya mirip seperti diatas untuk Listener" lain
        // Dengan perbedaan tidak ada khusus API v23 Keatas

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
            String judul = "kampung wijilan";
            String lokasi = "Jl. Wijilan, Yogyakarta";
            String deskripsi = "Surga masakan khas dan masakan yang menjadi icon kota Yogyakarta” Gudeg Jogja”. Gudeg Jogja ini bisa anda nikmati dengan berbagai lauk, mulai dari daging ayam dan telur yang direbus dan dipindang hingga berwarna coklat,dipadu dengan rasa pedas yang didapat dari perpaduan tempe dan sambel krecek menjadikan gudeg ini mempunyai cita rasa pedas manis yang bisa membuat lidah anda bergoyang.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FWijilan.mp4?alt=media&token=12c6c34f-4885-4fec-9a83-75f904d9ba63";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fkampung%20wijilian%20yogyakarta.png?alt=media&token=8c160ba0-0960-460b-8c0d-a2deea4558c0";
            int gambar = R.drawable.img_kampung_wijilan;
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
            String judul = "pasar lama";
            String lokasi = "Pasar Lama, Jl. Kisamaun, Sukasari, Tangerang, Tangerang City, Banten 15118";
            String deskripsi = "Area ramai dengan kios pasar yang menjual kuliner kaki lima lokal hingga larut malam.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FPasar_Lama.mp4?alt=media&token=7c450a27-a114-402b-880f-84bb31decbea";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fpasar%20lama%20tanggerang.png?alt=media&token=4316b9d1-3ebc-4940-9f47-0981ca3aaf60";
            int gambar = R.drawable.img_pasar_lama;
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
            String judul = "kya - kya";
            String lokasi = "Jl. Kembang Jepun, Bongkaran, Kec. Pabean Cantikan, Kota Surabaya, Jawa Timur 60161";
            String deskripsi = "Kya-Kya Surabaya adalah tempat yang dulunya ramai sebagai pasar malam di kawasan pecinan kota Surabaya. Di sepanjang jalan Kembang Jepun didirikan kios-kios yang menjual berbagai macam makanan baik masakan Tionghoa, makanan khas Surabaya maupun makanan lainnya.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FKyaKya.mp4?alt=media&token=e7b08d3e-9e72-4c2d-8caf-3a7e8bc12067";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fkya%20kya%20surabaya.png?alt=media&token=9e4b562c-694f-442e-9d2d-b2f48b7ffd24";
            int gambar = R.drawable.img_kyakya;
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
            String judul = "surya kencana";
            String lokasi = "Jl. Surya Kencana, Bogor";
            String deskripsi = "Jalan Surya Kencana yang membentang sepanjang kurang lebih 1 km ini dipenuhi dengan jenis kuliner yang sudah berusia puluhan tahun. Kebanyakan pedagang di jalan tersebut juga sudah berjualan selama puluhan tahun dan sangat jarang ditemukan ada pedagang baru disana.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FSurya_Kencana.mp4?alt=media&token=dc12d08d-6a9b-4acf-9cc1-ebfa10bdcf7a";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fsurya%20kencana%20bogor.png?alt=media&token=db0a3f89-d191-405d-9fbd-a05afa309c1b";
            int gambar = R.drawable.img_surga_kencana;
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
            String judul = "braga";
            String lokasi = "Kota Bandung";
            String deskripsi = "Nama jalan ini cukup dikenal sejak masa pemerintahan Hindia Belanda. Sampai saat ini nama jalan tersebut tetap dipertahankan sebagai salah satu maskot dan objek wisata kota Bandung yang dahulu dikenal sebagai Parijs van Java.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FBraga.mp4?alt=media&token=f67d36e4-a477-440c-9b5d-38b173682c01";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fbraga%20bandung.png?alt=media&token=4c1d96c5-1a9a-475d-b525-254fefe0a3ae";
            int gambar = R.drawable.img_braga;
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
            String judul = "Jalan Sabang";
            String lokasi = "Jl. H. Agus Salim Jl. Kebon Sirih, RT.1/RW.1, Kb. Sirih, Kec. Menteng, Jakarta Pusat, 10340";
            String deskripsi = "Kawasan Pecenongan pada malam hari dikenal jadi pusat kuliner sejak tahun 1970-an. Para pedagang di sini mulai ramai membuka tempat dagangannya sejak pukul 17.00 WIB hingga dini hari. Traveler bisa menemukan banyak sekali jenis makanan di sini. Beberapa yang paling populer adalah Bubur Kwang Tung yang buka 24 jam. Ada bubur kepiting dan ayam hainan yang nikmat. Bila ingin yang manis-manis, kamu bisa mencoba Martabak Pecenongan yang juga legendaris. Serta banyak warung tenda seafood yang menawarkan aneka hidangan laut segar.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FSabang.mp4?alt=media&token=461b949c-a618-43aa-8ba3-ebe9b46d0aae";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fjalan%20sabang%20jakarta.png?alt=media&token=3383232a-c26a-4b5c-ae3a-68aa1524a463";
            int gambar = R.drawable.img_jalan_sabang;
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
            String judul = "pencenongan";
            String lokasi = "Jl. Pecenongan, Kelurahan Kebun Kelapa, Kecamatan Gambir, Jakarta Pusat";
            String deskripsi = "Wisata Pecenongan di Gambir DKI Jakarta Pusat Jakarta itu layaknya surga kuliner di Jakarta Pusat. Deretan restoran enak di Pecenongan bisa membuat perut dan hati kamu bergejolak senang karena makanan yang akan di temukan di sana nggak ada duanya. Mulai dari Chinese food, Martabak, Bubur, sampai seafood ternama ada di area ini. Daerah ini cocok banget dijadiin tempat kuliner malam, soalnya banyak restoran yang buka sampai tengah malam bahkan ada yang buka 24 jam juga. Jadi nggak heran deh kenapa Pecenongan selalu rame di malam hari. Sejak puluhan tahun lalu, Jalan Pecenongan, Jakarta Pusat, sudah menjadi pusat wisata kuliner malam.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_kuliner%2FPencenongan.mp4?alt=media&token=623d1a3f-e4d9-42d1-8bfc-016ed9e11afe";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_kuliner%2Fpecenongan%20jakarta.png?alt=media&token=a559e62c-0d8d-4378-bed9-caa3c00aa7f6";
            int gambar = R.drawable.img_pencenongan;
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