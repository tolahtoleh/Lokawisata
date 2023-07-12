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

public class BahariActivity extends FragmentActivity {

    public final long delay = 250;
    private static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahari);

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvBahari1);
        CardView cardView2 = findViewById(R.id.cvBahari2);
        CardView cardView3 = findViewById(R.id.cvBahari3);
        CardView cardView4 = findViewById(R.id.cvBahari4);
        CardView cardView5 = findViewById(R.id.cvBahari5);
        CardView cardView6 = findViewById(R.id.cvBahari6);
        CardView cardView7 = findViewById(R.id.cvBahari7);
        CardView cardView8 = findViewById(R.id.cvBahari8);

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
            // Khusus API v23 Keatas untuk ImageView
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
            String judul = "pantai tureloto";
            String lokasi = "Desa Balefadorotuho, Kecamatan Lahewa, Kabupaten Nias Utara";
            String deskripsi = "Keindahannya terletak pada batu karang raksasa yang berbentuk bundar di bibir pantai. Wisatawan kerap mendokumentasikan diri di batu karang tersebut. Batunya keras dan tidak tajam, persis seperti batu raksasa yang berserakan di pinggir pantai, jika dipandang dari jauh. Batuan karang yang terhampar itu memiliki bentuk unik, ada yang menyerupai bentuk otak manusia sehingga beberapa masyarakat sekitar menyebutnya dengan Batu Otak.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FPantai_Tureloto.mp4?alt=media&token=9526eadb-cba9-4633-a084-4c8cfba6c8f6";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fpantai%20tureloto.png?alt=media&token=2ebd8c25-54ef-406d-96a3-014691af4baf";
            int gambar = R.drawable.img_pantai_tureloto;
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
            String judul = "danau biru kaloka";
            String lokasi = "Walasiho, Kec. Wawo, Kabupaten Kolaka Utara, Sulawesi Tenggara 93552";
            String deskripsi = "Danau Biru Kaloka memiliki kedalaman mencapai 7 meter dengan air yang jernih kebiruan. Danau ini diperkirakan memiliki tiga mata air dalam skala besar dari bebatuan bukit dan juga beberapa mata air dari dalam danau itu sendiri. Karena letaknya yang berada di kaki bukit dengan dinding batu menjulang membuat danau ini terlihat teduh.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FDanau_Biru_Kaloka.mp4?alt=media&token=22330f8e-94fd-4114-8620-d03a7e91fd01";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fdanau%20biru%20kaloka.png?alt=media&token=65203e24-5fb1-4687-bfbc-b763f361eb25";
            int gambar = R.drawable.img_danau_biru_kaloka;
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
            String judul = "kepulauan derawan";
            String lokasi = "Kabupaten Berau, Kalimantan Timur";
            String deskripsi = "Kepulauan Derawan adalah sebuah kepulauan yang berada di Kabupaten Berau, Kalimantan Timur. Di kepulauan ini terdapat sejumlah objek wisata bahari menawan, salah satunya Taman Bawah Laut yang diminati wisatawan mancanegara terutama para penyelam kelas dunia.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FKepulauan_Derawan.mp4?alt=media&token=f3e22a53-5de7-4a46-843b-a6a90d59782f";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fkepulauan%20derawan.png?alt=media&token=1badd2cb-4819-42c5-8c67-1f40b72467d0";
            int gambar = R.drawable.img_kepulauan_derewan;
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
            String judul = "pantai ora";
            String lokasi = "Pulau Seram, kecamatan Seram Utara, Maluku Tengah, Maluku";
            String deskripsi = "Pantai Ora merupakan pantai alami dengan kejernihan airnya dan kebersihan pasirnya. Kawasan ini juga memiliki keindahan bawah laut yang sangat memesona. Pantai Ora memiliki daratan yang tidak terlalu luas, karena wilayahnya sebagian besar berupa tebing, hutan tropis, dan barisan pegunungan.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FPantai_Ora.mp4?alt=media&token=2b15ee1c-4f32-4754-9700-07d71c09a4f3";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fpantai%20ora.png?alt=media&token=21dfe30a-f641-4c1d-9587-882ea1115df9";
            int gambar = R.drawable.img_pantai_ora;
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
            String judul = "pantai parai tenggiri";
            String lokasi = "Kecamatan Sungai Liat, Kabupaten Bangka, Kepulauan Bangka Belitung.";
            String deskripsi = "Disebut Pantai Parai atau Pantai Parai Tenggiri karena dahulu banyak nelayan yang mendatangkan ikan tenggiri dari pesisir pantai ini. Tetapi, wajah Pantai Parai Tenggiri telah berubah. Tidak ada lagi nelayan yang bisa dilihat di tepian pantai. Di sekitar pantai ini, terdapat berbagai penginapan yang bisa dijadikan pilihan bagi pengunjung yang ingin berlama-lama menikmati Pantai Parai Tenggiri. Soal keindahan, Pantai Parai Tenggiri memiliki pasir putih dengan kelembutan yang menyerupai tepung. Bebatuan granit yang tersebar juga menjadi hiasan yang indah untuk dipandang. Belum lagi air laut yang bewarna biru kehijauan menambah sensasi saatberkunjung ke Pantai Parai Tenggiri.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FPantai_Parai_Tenggiri.mp4?alt=media&token=abed9557-ce54-4bc6-83ea-40f6e5c05d8b";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fpantai%20parai%20tenggiri.png?alt=media&token=6a6b39fc-1046-4e16-b349-3ec6cb75c25d";
            int gambar = R.drawable.img_pantai_parai_tenggiri;
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
            String judul = "pantai nirwana";
            String lokasi = "Jl. Raya Padang-Painan, Teluk Bayur, Padang Selatan, Kota Padang, Sumatera Barat.";
            String deskripsi = "Pantai Nirwana ialah sebuah pantai di Padang, tepatnya di Padang Selatan, yang memiliki batu karang dan koral yang bertebaran di sepanjang pantai. Selain itu, deretan pohon kelapa pun ikut menghiasi Pantai Nirwana.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FPantai_Nirwana.mp4?alt=media&token=22ff94c1-4573-4fe4-9e92-3db198c85669";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Fpantai%20nirwana.png?alt=media&token=cfea95b2-090d-4f2e-9b27-f50a30cdd520";
            int gambar = R.drawable.img_pantai_nirwana;
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
            String judul = "taman nasional bunaken";
            String lokasi = "Jalan Bunaken, Kepulauan Bunaken, Kota Manado, Sulawesi Utara";
            String deskripsi = "Taman Nasional Bunaken merupakan kawasan pelestarian ekosistem tropis perairan yang berada di pusat segitiga terumbu karang dunia.";
            String videoLink = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/video%2Fwisata_bahari%2FTaman_Nasional_Bunaken.mp4?alt=media&token=282d74cc-6f0b-499a-9abb-58334b939ff2";
            String qrCode = "https://firebasestorage.googleapis.com/v0/b/lokawisata-app.appspot.com/o/qrcode%2Fwisata_bahari%2Ftaman%20nasional%20bunaken.png?alt=media&token=28123ed4-f824-45a5-ba6a-78c5cc224b00";
            int gambar = R.drawable.img_taman_nasional_bunaken;
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