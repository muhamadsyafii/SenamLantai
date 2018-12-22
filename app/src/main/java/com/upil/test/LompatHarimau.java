package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LompatHarimau extends AppCompatActivity {

    WebView wbvw3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lompat_harimau);

        wbvw3 = (WebView) findViewById(R.id.webview3);

        String datas = "<p>Gerakan senam ini berbeda dengan jenis gerakan guling depan ataupun belakang. " +
                "Jenis gerakan ini menggunakan langkah yang membusur. " +
                "Ketika posisi badan melayang, kedua tangan diluruskan dan diakhiri "+
                "dengan gulingan kedepan. Berikut cara melakukan gerakan lompat harimau secara rinci: "+
                "<ol>"+
                "<li>Sikap badan berdiri dengan kedua tangan berada disamping badan.</li>"+
                "<li>Arahkan pandangan anda kedepan.</li>"+
                "<li>Selanjutnya lakukan tolakan dengan menggunaan matras disertai ayunan kedua lengan keatas.</li>"+
                "<li>Tumpukan badan ketangan anda ketika badan sedang melayang, namun pandangan anda mengarah kepada tangan tersebut.</li>"+
                "<li>Lakukan tolakan dengan kuat. Posisikan lutut tetap melipat kedada dengan bagian tungkai anda lurus.</li>"+
                "<li>Lakukan gerakan akhir dengan posisi badan jongkok. Setelah tu badan kembali berdiri seperti semula.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw3.loadData(String.format(files), "text/html", "utf-8");
    }
}