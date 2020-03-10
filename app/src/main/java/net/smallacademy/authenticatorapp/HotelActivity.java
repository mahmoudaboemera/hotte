package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class HotelActivity extends AppCompatActivity {
    TextView fullName, email, phone;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


    }


    public void aswn(View view) {
        Intent i = new Intent(this, AswanHotel.class);
        startActivity(i);

    }


    public void sharm(View view) {
        Intent i = new Intent(this, SharmHotel.class);
        startActivity(i);

    }



    public void gona(View view) {
        Intent i = new Intent(this, GounnaHotel.class);
        startActivity(i);

    }
    //mr bean

    public void sokhna(View view) {
        Intent i = new Intent(this, ElsokhnaHotel.class);
        startActivity(i);

    }



}
