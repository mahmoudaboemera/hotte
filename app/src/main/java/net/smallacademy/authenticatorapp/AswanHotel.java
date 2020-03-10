package net.smallacademy.authenticatorapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


public class AswanHotel extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aswn);

    }
    public void pay(View view) {
        Intent i = new Intent(this, AswanRooms.class);
        startActivity(i);

    }

}

