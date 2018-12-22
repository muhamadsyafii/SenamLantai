package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Salto extends AppCompatActivity {

    WebView wbvw13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salto);
        wbvw13 = (WebView) findViewById(R.id.webview13);

        String datas = "<p>Salto adalah gerakan berguling di udara, salto bisa dilakukan kedepan ataupun kebelakang.  " +
                "Mungkin salto adalah gerakan senam lantai tersulit.  " +
                "Harus sering-sering latihan agar bisa melakukan gerakan ini, karena jika gagal dalam melakukan salto bisa fatal akibatnya.   " +
                "Dibawah ini terdapat cara melakukan gerakan salto :  " +
                "<ol>" +
                "<li>Langkah awal yang harus dilakukan adalah berdiri tegak dengan kedua tangan lurus di samping badan.</li>" +
                "<li>Kemudian melangkahlah beberapa kali atau jika perlu berlarilah, sebelum melakukan tolakan sekuat tenaga. " +
                "<li>Ayunkan tangan ke bawah saat melakukan tolakan untuk memberikan dorongan tambahan.</li>" +
                "<li>Saat badan melayang di udara, lipat tangan ke arah lutut dan tundukkan kepala.</li>" +
                "<li>Setelah badan berputar 360 derajat, luruskan tungkai untuk pendaratan.</li>" +
                "<li>Tangan diangkat ke atas.</li>" +
                "<li>Posisi akhir adalah berdiri tegak kembali. Gunakan tangan untuk keseimbangan.</li>" +
                "</ol>" +
                "<p>" +
                "<b>Selesai..</b>";


        String files = "<html><body style=\"text-align:justify\">" + datas + "</body></html>";

        wbvw13.loadData(String.format(files), "text/html", "utf-8");
    }
}
