package com.example.tugas3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickRS(View view) {
        //gambar Rs di Qlik

        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }

}

