package net.smallacademy.authenticatorapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class ElsokhnaHotel extends AppCompatActivity {
    RecyclerView recyclerView;


      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elsokhna);
    }
    public void pay(View view) {
            Intent i = new Intent(this, BookOne.class);
        startActivity(i);

    }
}

