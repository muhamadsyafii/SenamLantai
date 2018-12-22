package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GulingDepan extends AppCompatActivity {

    WebView wbvw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guling_depan);

        wbvw1 = (WebView) findViewById(R.id.webview1);

        String datas = "<p>Gerakan guling depan merupakan sebuah gerakan senam lantai yang " +
                "diakukan dengan cara berguling kearah depan. Berikut cara melakukan gerakan guling " +
                "depan: "+
                "<ol>"+
                "<li>Sikap awal badan berdiri dengan posisi tangan diluruskan kesamping badan.</li>"+
                "<li>Angkat kedua tangan kearah depan kemudian badan dibungkukkan kedepan.</li>"+
                "<li>Posisikan kedua telapak tangan diatas matras.</li>"+
                "<li>Letakkan siku disamping badan dan kepala masuk diantara kedua tangan tersebut.</li>"+
                "<li>Sentuhkan bagian bahu anda kematras.</li>"+
                "<li>Lakukan gerakan berguling ke arah depan.</li>"+
                "<li>Selanjutnya kedua lutut ditekuk dan rangkul menggunakan tangan. Posisi dagu dan lutut ditarik kedalam dada.</li>"+
                "<li>Lakukan gerakan akhir dengan menggulingkan badan kedepan dengan posisi akhir badan jongkok kemudian kembali berdiri.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw1.loadData(String.format(files), "text/html", "utf-8");
    }
}