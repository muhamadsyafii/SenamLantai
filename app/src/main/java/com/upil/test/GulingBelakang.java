package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GulingBelakang extends AppCompatActivity {

    WebView wbvw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guling_belakang);

        wbvw2 = (WebView) findViewById(R.id.webview2);

        String datas = "<p>Gerakan guling belakang merupakan sebuah gerakan senam lantai yang " +
                "diakukan dengan cara berguling kearah belakang. Jenis senam lantai guling belakang berbeda dengan guling depan." +
                "Perbedaannya terletak pada teknik dan arah bergulingnya. Berikut cara melakukan gerakan guling belakang : "+
                "<ol>"+
                "<li>Posisi awal tubuh jongkok dengan letak kedua kaki lebih rapat dan bagian tumit sedikit diangkat.</li>"+
                "<li>Posisi kepala menunduk agar dagu dengan dada lebih rapat.</li>"+
                "<li>Letakkan kedua tangan disamping telinga dan posisikan telapak tangan agar menghadap keatas.</li>"+
                "<li>Selanjutnya anda dapat menjatuhkan badan kearah belakang dengan posisi badan tetap membulat.</li>"+
                "<li>Tarik kedua kaki kebelakang dengan cepat ketika bagian punggung telah menyentuh matras. </li>"+
                "<li>Selanjutnya sentuhkan ujung kaki kematras yang terletak dibelakang kepala. Lakukan penekanan ke " +
                "matras agar kepala dapat diangkat dengan posisi telapak tangan lurus.</li>"+
                "<li>Gerakan akhir ialah kembali keposisi awal jongkok.</li>"+
                "</ol>"+
                "<p>"+
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw2.loadData(String.format(files), "text/html", "utf-8");
    }
}