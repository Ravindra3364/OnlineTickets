package com.example.theaters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class seating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seating);
    }

    public void sit(View view) {
        Intent intent=new Intent(seating.this,payment.class);
        startActivity(intent);
    }
}
