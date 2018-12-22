package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Kayang extends AppCompatActivity {

    WebView wbvw11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayang);
        wbvw11 = (WebView) findViewById(R.id.webview11);

        String datas = "<p>Gerakan kayang merupakan jenis gerakan senam lantai yang dilakukan dengan cara membalikkan badan sehingga kaki berada diatas. " +
                "Gerakan kayang dilakukan dengan mengangkat bagian panggul dan perut keatas. " +
                "Poin utama gerakan kayang adalah meletakkan kaki lebih tinggi dengan menumpukan badan kebagian pinggang dan bahu. "+
                "Gerakan kayang berguna untuk meningkatkan kelenturan bahu.  "+
                "Dibawah ini terdapat cara melakukan gerakan kayang :  " +
                "<ol>" +
                "<li>Lakukan sikap awal tubuh berdiri dan posisikan kedua tangan menumpu bagian pinggul.</li>" +
                "<li>Lutut dan siku ditekuk kemudian kepala dilipat kebelakang. " +
                "<li>Gunakan kedua tangan untuk menumpu. Setelah itu putar sampai tangan menyentuh matras.</li>" +
                "<li>Gerakan terakhir ialah memposisikan badan melengkung seperti busur.</li>" +
                "</ol>" +
                "<p>" +
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">" + datas + "</body></html>";

        wbvw11.loadData(String.format(files), "text/html", "utf-8");
    }
}
