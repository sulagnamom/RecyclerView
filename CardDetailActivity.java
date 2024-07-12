package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class CardDetailActivity extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.card_detail);

        img=findViewById(R.id.img);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);


        Intent intent=getIntent();
        String name=intent.getExtras().getString("name");
        String movie=intent.getExtras().getString("movie");
        int movieImg=intent.getExtras().getInt("movieImg");

        tv1.setText(name);
        tv2.setText(movie);
        img.setImageResource(movieImg);


    }
}