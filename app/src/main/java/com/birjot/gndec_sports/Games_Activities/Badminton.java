package com.birjot.gndec_sports.Games_Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.birjot.gndec_sports.R;

public class Badminton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        setContentView(R.layout.activity_badminton);
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
