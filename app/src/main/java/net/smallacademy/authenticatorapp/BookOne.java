package net.smallacademy.authenticatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BookOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_book_one);
    }

    public void books(View view) {
        Intent i = new Intent(this, MotelPay.class);
        startActivity(i);

    }



}
