package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Handstand extends AppCompatActivity {

    WebView wbvw7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handstand);
        wbvw7 = (WebView) findViewById(R.id.webview7);

        String datas = "<p>Gerakan Handstand adalah suatu gerak senam lantai dimana posisi kaki berada di atas dan " +
                "tangan berada posisi di bawah. " +
                "Berikut cara melakukan gerakan handstand:  "+
                "<ol>"+
                "<li>Posisikan badan berdiri dengan salah satu kaki berada didepan.</li>"+
                "<li>Posisikan badan membungkuk kedepan.</li>"+
                "<li>Letakkan kedua tangan diatas matras selebar bahu agar dapat digunakan untuk menumpu badan.</li>"+
                "<li>Arahkan pandangan anda kedepan kemudian dorong pantat setinggi mungkin.</li>"+
                "<li>Setelah itu bengkokkan tungkai kedepan kemudian luruskan tungkai kebelakang.</li>"+
                "<li>Proses pemindahan tungkai ini dengan cara menganyunnya keatas agar bagian otot perut lebih kencang.</li>"+
                "<li>Posisikan kedua tungkai lurus dan rapat.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw7.loadData(String.format(files), "text/html", "utf-8");
    }
}
