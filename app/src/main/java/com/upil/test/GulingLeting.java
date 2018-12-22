package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GulingLeting extends AppCompatActivity {

    WebView wbvw5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guling_leting);

        wbvw5 = (WebView) findViewById(R.id.webview5);

        String datas = "<p>Guling lenting adalah suatu gerak senam lantai dengan melentingkan badan " +
                "ke depan atas dengan lemparan kedua kaki dan tolakan kedua tangan. " +
                "Gerakan ini dapat diawali dengan gerak guling depan atau gerak mengayun guling belakang sebelumnya. " +
                "Berikut cara melakukan gerakan guling lenting :  "+
                "<ol>"+
                "<li>Sikap badan berdiri dengan kedua kaki dirapatkan. Letakkan kedua tangan keatas " +
                "dengan lurus. Posisi badan sedikit membungkuk kemudian tangan diletakkan diatas matras. " +
                "Lakukan posisi badan seperti mengguling kedepan namun sikap kaki tetap lurus.</li>"+
                "<li>Lakukan gerakan guling depan namun ketika badan berada diatas kepala, kedua kaki " +
                "dilecutkan lurus kedepan dengan cepat menggunakan bantuan kedua tangan. Gerakan ini" +
                " akan membuat badan agar lebih melenting kedepan.</li>"+
                "<li>Posisikan kedua kaki mendatar namun sikap kedua tangan tetap lurus. Gerakan terakhir " +
                "ialah kembali keposisi awal badan berdiri</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw5.loadData(String.format(files), "text/html", "utf-8");
    }
}