package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RoundOff extends AppCompatActivity {

    WebView wbvw10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_off);
        wbvw10 = (WebView) findViewById(R.id.webview10);

        String datas = "<p>Gerakan Round off merupakan gerakan senam lantai yang dapat dilakukan menggunakan beberapa cara" +
                "seperti menumpukan badan pada kedua tangan kemudian melakukan tolakan ketika kedua kaki mendarat kelantai dan " +
                "melakukan handstand dengan cara memutarkan badan dengan sumbu yang tegak."+
                "Gerakan round off dapat dilakukan dengan dua orang sehingga dapat saling membantu.  "+
                "Berikut cara melakukan gerakan round off :  " +
                "<ol>" +
                "<li>Lakukan gerakan dengan mengangkat salah satu tangan secara bergantian.</li>" +
                "<li>Ketika salah satu tangan diangkat, letakkan tangan tersebut didepan dan tangan " +
                "yang lainnya berada disamping tangan tersebut. Setelah itu badan diputar dengan sumbu yang tegak.</li>" +
                "<li>Setelah itu anda dapat melakukan gerakan handstand dengan menggunakan dua tangan " +
                "yang mengarah kedepan. Ketika tangan sudah menyentuh lantai kemudian diputar sampai mendapatkan posisi ke arah depan.</li>" +
                "<li>Posisi kedua kaki rapat dan tolakkan sampai tangan tidak menyentuh lantai. " +
                "Lakukan gerakan tersebut dengan lebih cepat.</li>" +
                "</ol>" +
                "<p>" +
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">" + datas + "</body></html>";

        wbvw10.loadData(String.format(files), "text/html", "utf-8");
    }
}
