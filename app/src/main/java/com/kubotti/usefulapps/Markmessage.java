package com.kubotti.usefulapps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.*;

public class Markmessage extends AppCompatActivity {
    ImageView[] nikoniko = new ImageView[15];
    TextView version = new TextView(this);
    private LinearLayout.LayoutParams layoutParams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Layoutの横・縦幅の指定
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                layoutParams.MATCH_PARENT,
                layoutParams.MATCH_PARENT));
        layoutParams = new LinearLayout.LayoutParams(300, 300);
        layout.setBackgroundColor(Color.argb(0xff, 0xaa, 0xcc, 0xff));
        setContentView(layout);
        //version.setText("");
        /*for(int i = 0;i<15;i++) {
            nikoniko[i].setLayoutParams(layoutParams);
            nikoniko[i] = new ImageView(this);
            nikoniko[i].setImageResource(R.drawable.nikoniko);
            layout.addView(nikoniko[i]);
        }*/


    }
}
