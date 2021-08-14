package com.example.deltatask3;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<infoClass> userList;
    private Activity activity;


    public Adapter(Activity activity, List<infoClass> userList){
        this.activity= activity;
        this.userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.breeds_file,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        infoClass infoClass = userList.get(position);
        String url =infoClass.getImage().getUrl();

        holder.name.setText(infoClass.getTextview());
        Picasso.with(activity).load(url).fit().centerInside().into(holder.imageView);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity.getApplicationContext(),breedDetails.class);
                intent.putExtra("DogName: ",infoClass.getTextview());
                intent.putExtra("Temp: ",infoClass.getTemperament());
                intent.putExtra("Bred_for: ",infoClass.getBred_for());
                intent.putExtra("Group: ",infoClass.getBreed_group());
                intent.putExtra("Height: ",infoClass.getHeight().getMetric());
                intent.putExtra("Weight: ",infoClass.getWeight().getMetric());
                intent.putExtra("Life: ",infoClass.getLife_span());
                intent.putExtra("Image: ",infoClass.getImage().getUrl());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView name;
        private RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.dog_breed);
            name = itemView.findViewById(R.id.breed_names);
            relativeLayout = itemView.findViewById(R.id.layout);

        }

    }
}
