package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LompatKangkang extends AppCompatActivity {

    WebView wbvw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lompat_kangkang);


        wbvw4 = (WebView) findViewById(R.id.webview4);

        String datas = "<p>Gerakan lompat kangkang merupakan jenis gerakan senam lantai yang" +
                "dilakukan dengan cara menyudutkan panggul dan sedikit ditekuk. " +
                "Jenis gerakan ini badan tidak diluruskan terlebih dahulu. "+
                "Berikut cara melakukan gerakan lompat kangkang : "+
                "<ol>"+
                "<li>Lakukan gerakan lompatan dengan mengangkat bagian panggul setinggi mungkin.</li>"+
                "<li>Ketika tangan menyentuh peti lompat kemudian arahkan tangan kesamping dengan panggul yang ditekuk.</li>"+
                "<li>Lakukan tolakan menggunakan tangan lebih kuat kearah dada dan kepala dapat diangkat keatas.</li>"+
                "<li>Sikap tungkai rapat dan badan diluruskan.</li>"+
                "<li>Lakukan pendaratan menggunakan kedua kaki dan tekuk lutut.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw4.loadData(String.format(files), "text/html", "utf-8");
    }
}
