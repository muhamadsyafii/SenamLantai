package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;

public class HeadStand extends AppCompatActivity {

    WebView wbvw8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_stand);
        wbvw8 = (WebView) findViewById(R.id.webview8);

        String datas = "<p>Gerakan Head stand adalah sikap berdiri tegak yang bertumpu pada tangan." +
                "Gerakan ini adalah salah satu gerakan senam lantai tanpa alat. " +
                "Berikut cara melakukan gerakan head stand:  "+
                "<ol>"+
                "<li>Lakukan sikap awal berdiri kemudian kepala ditegakan agar dapat menumpu badan dengan bantuan kedua tangan.</li>"+
                "<li>Bungkukkan badan dengan menumpu pada tangan dan dahi sehingga membentuk segitiga sama sisi.</li>"+
                "<li>Kemudian angkat tungkai dan posisikan punggung membusur dan letakkan panggul kedepan agar badan tetap seimbang. </li>"+
                "<li>Gerakan terakhir ialah menegakkan badan dengan tungkai berada diatas dan rapat.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw8.loadData(String.format(files), "text/html", "utf-8");
    }
}

