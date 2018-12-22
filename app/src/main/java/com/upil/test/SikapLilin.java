package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SikapLilin extends AppCompatActivity {

    WebView wbvw9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikap_lilin);
        wbvw9 = (WebView) findViewById(R.id.webview9);

        String datas = "<p>Gerakan ini dapat dilakukan dengan memposisikan badan telentang dengan" +
                "mengangkat kedua kaki keatas dan rapat, kemudian topang pinggang" +
                "menggunakan kedua tangan namun bahu tetap menyentuh lantai. "+
                "Gerakan sikap lilin menggunakan otot perut yang kuat agar kedua tangan dapat menopang pinggul. "+
                "Berikut cara melakukan gerakan sikap lilin dalam senam lantai :  " +
                "<ol>" +
                "<li>Posisikan badan telentang dan letakkan kedua tangan disamping badan.</li>" +
                "<li>Arahkan pandangan anda keatas. Kemudian kedua kaki diangkat bersamaan dengan posisi kaki rapat.</li>" +
                "<li>Topang pinggul menggunakan kedua tangan namun bahu tetap menyentuh lantai.</li>" +
                "<li>Tahan posisi badan tersebut selama beberapa menit.</li>" +
                "</ol>" +
                "<p>" +
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">" + datas + "</body></html>";

        wbvw9.loadData(String.format(files), "text/html", "utf-8");
    }
}