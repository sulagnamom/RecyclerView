package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RCModel>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        arrayList.add(new RCModel("Batman","Batman Movie",R.drawable.batman));
        arrayList.add(new RCModel("Superman","Superman Movie",R.drawable.superman));
        arrayList.add(new RCModel("Venom","Venom Movie",R.drawable.venom));
        arrayList.add(new RCModel("SpiderMan","SpiderMan Movie",R.drawable.spiderman));
        arrayList.add(new RCModel("HitMan","HitMan Movie",R.drawable.hitman));
        arrayList.add(new RCModel("IronMan","IronMan Movie",R.drawable.ironman));
        arrayList.add(new RCModel("Thor","Thor Movie",R.drawable.thor));


        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RCAdapter rcAdapter=new RCAdapter(this,arrayList);
        recyclerView.setAdapter(rcAdapter);

    }
}