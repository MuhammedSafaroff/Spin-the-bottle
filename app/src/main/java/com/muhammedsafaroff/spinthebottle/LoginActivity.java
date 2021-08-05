package com.muhammedsafaroff.spinthebottle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
        Spinner spinner_1;
        Context context = this;
        private InterstitialAd mInterstitialAd;
        ScrollView scrollView_1;
        Button Login_btn;
        Intent intent;
        int deyer;
        DataHelper data= new DataHelper(context);
        EditText editText;
        Typeface font;
        TextView ust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        spinner_1 = (Spinner) findViewById(R.id.spinner_1);
        scrollView_1 = (ScrollView) findViewById(R.id.scrollView_1);
        Login_btn= (Button) findViewById(R.id.Login_btn);
        intent = new Intent(context,MainActivity.class);
        font = Typeface.createFromAsset(getAssets(),"fonts/FredokaOneRegular.ttf");
        ust = (TextView) findViewById(R.id.ust);
        ust.setTypeface(font);

        final LinearLayout linearLayout = new LinearLayout(context);
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        layoutParams.setMargins(0, 20, 0, 0);
        linearLayout.setLayoutParams(layoutParams);

        scrollView_1.addView(linearLayout);

        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                linearLayout.removeAllViews();
                deyer = position+1;

                if (!(position==0)){

                    for (int i=0;i<=position;i++){

                        editText = new EditText (context);
                        editText .setTextSize(18);
                        editText.setId(i*15+23);
                        editText .setLayoutParams(layoutParams);
                        editText.setBackgroundResource(R.drawable.edtbg);
                        editText.setHint((i+1)+". Oyuncu");
                        editText.setTextColor(Color.WHITE);
                        editText.setHintTextColor(Color.WHITE);
                        linearLayout.setGravity(Gravity.CENTER);
                        linearLayout.addView(editText);






                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!((deyer-1) == 0)) {
                    if (editText.getText().toString().trim().equals("")) {
                        Toast.makeText(context, "Lütfen isminizi giriniz", Toast.LENGTH_LONG).show();

                    } else {
                        for (int j = 0; j < deyer; j++) {

//
                            editText = (EditText) findViewById(j * 15 + 23);
                            data.saveDataString("isim" + j, editText.getText().toString());


                        }
                        data.saveDataInt("number", deyer);
                        reklam();
                        startActivity(intent);
                    }
                }else{
                    Toast.makeText(context,"Lütfen Oyuncu sayısını belirleyin",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void reklam(){
        //reklam

        MobileAds.initialize(this,
                "ca-app-pub-4763830311171299~6124055803");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
                super.onAdLoaded();
            }
        });

        //reklam
    }
}
