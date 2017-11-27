package com.example.cipowela.skos.subactivity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import com.example.cipowela.skos.R;

public class DetailKosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);

        String text = "S KOS";
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#000000"))
                , 0, text.length(), 0);
        getSupportActionBar().setTitle(spannableString);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}