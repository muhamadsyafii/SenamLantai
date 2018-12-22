package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Meroda extends AppCompatActivity {

    WebView wbvw12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meroda);
        wbvw12 = (WebView) findViewById(R.id.webview12);

        String datas = "<p>Meroda adalah suatu gerakan ke samping, pada saat bertumpu atas kedua tangan dengan kaki terbuka lebar.  " +
                "Meroda dapat dilakukan dengan awalan ke kiri atau ke kanan, terserah bagaimana posisi yang enak.  " +
                "Gerakan meroda memerlukan koordinasi gerak yang baik.   "+
                "Dibawah ini terdapat cara melakukan gerakan meroda dengan benar :  " +
                "<ol>" +
                "<li>Sikap awal badan berdiri kearah samping. Kemudian kaki dibuka selebar bahu dan " +
                "tangan berada lurus kearah serong atas samping.</li>" +
                "<li>Arahkan pandangan anda kedepan. " +
                "<li>Jatuhkan badan kearah samping dengan telapak tangan berada disamping kiri badan. " +
                "Kemudian angkat kaki kanan dengan lurus kearah atas. Kemudian diikuti dengan gerakan telapak tangan lainnya.</li>" +
                "<li>Posisi badan serong ke arah samping dengan posisi kaki terbuka. Ketika kaki kanan " +
                "diayunkan kemudian kaki kiri melakukan tolakan kelantai.</li>" +
                "<li>Lakukan gerakan selanjutnya dengan meletakkan kaki kanan disamping tangan kanan " +
                "dan diikuti dengan tangan kiri.</li>" +
                "<li>Luruskan kedua tangan kemudian kembali keposisi semula dengan cara mengangkat badan.</li>" +
                "</ol>" +
                "<p>" +
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">" + datas + "</body></html>";

        wbvw12.loadData(String.format(files), "text/html", "utf-8");
    }
}
