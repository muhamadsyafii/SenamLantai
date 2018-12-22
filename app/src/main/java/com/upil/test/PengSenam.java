package com.upil.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PengSenam extends AppCompatActivity {

    WebView wbvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng_senam);

        wbvw = (WebView) findViewById(R.id.webview);

        String datas = "<p>Senam lantai (bahasa Inggris: floor exercise) adalah salah satu " +
                "bagian dari rumpun senam. Sesuai dengan istilahnya, maka gerakan-gerakan senam dilakukan " +
                "di atas lantai yang beralaskan matras atau permadani. Senam lantai sering juga di sebut " +
                "dengan senam bebas, sebab pada waktu melakukan gerakan tidak membawa alat atau menggunakan " +
                "alat. Senam lantai menggunakan area yang berukuran 12 X 12 m dan dapat ditambahkan matras " +
                "sekeliling area selebar 1 meter untuk menjaga keamanan pesenam yang baru melakukan latihan " +
                "atau rangkaian gerakan. Unsur-unsur gerakannya terdiri mengguling, melompat berputar di udara, " +
                "menumpu dengan dua tangan atau kaki untuk mempertahankan sikap seimbang pada waktu melompat " +
                "ke depan atau ke belakang. Bentuk gerakannya merupakan gerakan dasar senam perkakas, " +
                "bentuk latihannya pada putera maupun puteri pada dasarnya adalah sama, " +
                "hanya untuk puteri dimasukkan unsur-unsur gerakan balet.";

        String files = "<html><body style=\"text-align:justify\">"+datas+"</body></html>";

        wbvw.loadData(String.format(files), "text/html", "utf-8");

    }
}