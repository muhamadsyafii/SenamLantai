package com.upil.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listmenu);
    }

    public void Pindah(View view) {
        startActivity(new Intent(this, GulingDepan.class));
    }
    public void Pindah1(View view) {
        startActivity(new Intent(this, GulingBelakang.class));
    }
    public void Pindah2(View view) { startActivity(new Intent(this, LompatKangkang.class));}

    public void Pindah3(View view) {startActivity(new Intent(this, GulingLeting.class));}

    public void Pindah4(View view) {startActivity(new Intent(this, LompatJongkok.class));
    }

    public void Pindah5(View view) {startActivity(new Intent(this, LompatHarimau.class));
    }

    public void Pindah6(View view) {startActivity(new Intent(this, Handstand.class));
    }

    public void Pindah7(View view) {startActivity(new Intent(this, HeadStand.class));
    }

    public void Pindah8(View view) {startActivity(new Intent(this, SikapLilin.class));
    }

    public void Pindah9(View view) {startActivity(new Intent(this, RoundOff.class));
    }

    public void Pindah10(View view) {startActivity(new Intent(this, Kayang.class));
    }

    public void Pindah11(View view) {startActivity(new Intent(this, Meroda.class));
    }

    public void Pindah12(View view) {startActivity(new Intent(this, Salto.class));
    }
}
