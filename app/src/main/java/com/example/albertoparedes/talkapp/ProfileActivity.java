package com.example.albertoparedes.talkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {

    TextView nameEdad;
    TextView descripcion;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String nameEdad = getIntent().getExtras().getString("name");
        String descripcion = getIntent().getExtras().getString("descriptcion");
        String imagen = getIntent().getExtras().getString("imagen");

        this.nameEdad = findViewById(R.id.tvNombreEdad);
        this.descripcion = findViewById(R.id.tvDescrip);
        this.imagen = findViewById(R.id.ivPhoto);

        this.nameEdad.setText(nameEdad);
        this.descripcion.setText(descripcion);

        Picasso.with(getApplicationContext()).load(imagen).into(this.imagen);

    }

    public void goToChat(View view){
        Intent i = new Intent(ProfileActivity.this, ConversacionActivity.class);
        startActivity(i);
    }
}
