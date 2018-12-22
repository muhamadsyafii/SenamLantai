package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LompatJongkok extends AppCompatActivity {

    WebView wbvw6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lompat_jongkok);

        wbvw6 = (WebView) findViewById(R.id.webview6);

        String datas = "<p>Jenis Gerakan senam ini dilakukan dengan posisi badan yang jongkok. " +
                "Berikut cara melakukan gerakan lompat jongkok : "+
                "<ol>"+
                "<li>Lakukan sikap awal dengan berlari secepat mungkin dengan posisi badan dicondongkan kedepan.</li>"+
                "<li>Lakukan tolakan diatas papan menggunakan kedua tangan. </li>"+
                "<li>Kedua tangan diayunkan dari belakang kedepan bawah agar posisi tungkai dan badan tetap lurus.</li>"+
                "<li>Arahkan pandangan anda kedepan. </li>"+
                "<li>Lakukan pendaratan dengan cara mengeper menggunakan ujung kaki dan posisi kedua tangan direntangkan kearah atas.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw6.loadData(String.format(files), "text/html", "utf-8");
    }
}