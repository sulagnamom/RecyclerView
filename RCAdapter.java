package com.example.movieapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class RCAdapter extends RecyclerView.Adapter<RCAdapter.RCViewHolder> {

    Context context;
    ArrayList<RCModel>arrayList=new ArrayList<>();

    public RCAdapter(Context context, ArrayList<RCModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.card_bgk,parent,false);
        return new RCViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RCViewHolder holder, int position) {
        holder.textView.setText(arrayList.get(position).getName());
        holder.textView.setText(arrayList.get(position).getMovie());
        holder.imageView.setImageResource(arrayList.get(position).getMovieImg());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Enjoy", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(context,CardDetailActivity.class);
                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("movie",arrayList.get(position).getMovie());
                intent.putExtra("movieimg",arrayList.get(position).getMovieImg());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RCViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        CardView cardView;

        public RCViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
