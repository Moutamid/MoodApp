package com.moutamid.moodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.moutamid.moodapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        Compliments compliments = new Compliments();

        b.donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DonateActivity.class));
            }
        });

        b.privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://app.getterms.io/view/SPfNE/privacy/en-us"));
                startActivity(browserIntent);
            }
        });

        b.carViewHappyCard.setOnClickListener(v -> {
            toast(compliments.getHappyCompliments().get(0));
        });

        b.cardViewSadCard.setOnClickListener(v -> {
            toast(compliments.getSadCompliments().get(0));

        });

        b.cardViewSleepyCard.setOnClickListener(v -> {
            toast(compliments.getSleepyCompliments().get(0));
        });

        b.cardViewNervousCard.setOnClickListener(v -> {
            toast(compliments.getNervousCompliments().get(0));
        });

        b.cardViewCalmCard.setOnClickListener(v -> {
            toast(compliments.getCalmCompliments().get(0));
        });

        b.cardViewSickCard.setOnClickListener(v -> {
            toast(compliments.getSickCompliments().get(0));
        });

        b.cardViewAnnoyedCard.setOnClickListener(v -> {
            toast(compliments.getAnnoyedCompliments().get(0));
        });

        b.cardViewAngryCard.setOnClickListener(v -> {
            toast(compliments.getAngryCompliments().get(0));
        });

        b.cardViewHungryCard.setOnClickListener(v -> {
            toast(compliments.getHungryCompliments().get(0));
        });
    }

    private void toast(String mcg) {
        Toast.makeText(this, mcg, Toast.LENGTH_SHORT).show();
    }

}