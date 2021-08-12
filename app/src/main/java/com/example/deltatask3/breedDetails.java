package com.example.deltatask3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class breedDetails extends AppCompatActivity {
    private TextView DogName;
    private TextView life_span;
    private TextView breed_group;
    private TextView bred_for;
    private TextView height;
    private TextView temperament;
    private ImageView dogImage;
    private TextView weight;
    private String dogname1,life_span1,group1,for1,temperament1,url1,height1,weight1;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed_details);
        DogName= findViewById(R.id.detailname);
        life_span = findViewById(R.id.life_span);
        breed_group = findViewById(R.id.bred_group);
        bred_for=findViewById(R.id.bred_for);
        height=findViewById(R.id.height);
        temperament=findViewById(R.id.temperament);
        weight=findViewById(R.id.weight);
        dogImage = findViewById(R.id.dogImage);
        getdogName();
        getnameAgain();
        getLifeSpan();
        getLifeAgain();
        getBreedGroup();
        getGroupAgain();
        getFor();
        getForAgain();
        getHeight();
        getHeightAgain();
        getWeight();
        getWeightAgain();
        getTemp();
        getTempAgain();
        getdogImage();
        getImageAgain();
    }

    private void getdogName(){
        if(getIntent().hasExtra("DogName: ")){
            dogname1=getIntent().getStringExtra("DogName: ");
        }else{

        }
    }
    private void getnameAgain(){
        DogName.setText(dogname1);
    }

    private void getLifeSpan(){
        if(getIntent().hasExtra("Life: ")){
            life_span1=getIntent().getStringExtra("Life: ");
        }else{

        }
    }
    private void getLifeAgain(){
        life_span.setText("Life Span: " + life_span1);
    }

    private void getBreedGroup(){
        if(getIntent().hasExtra("Group: ")){
            group1=getIntent().getStringExtra("Group: ");
        }
    }
    private void getGroupAgain(){
        breed_group.setText("Breed Group: "+group1);
    }

    private void getFor(){
        if(getIntent().hasExtra("Bred_for: ")){
            for1=getIntent().getStringExtra("Bred_for: ");
        }
    }
    private void getForAgain(){
        bred_for.setText("Bred For: "+for1);
    }

    private void getHeight(){
        if(getIntent().hasExtra("Height: ")){
            height1=getIntent().getStringExtra("Height: ");
        }
    }
    private void getHeightAgain(){
        height.setText("Height: "+height1);
    }

    private void getWeight(){
        if(getIntent().hasExtra("Weight: ")){
            weight1=getIntent().getStringExtra("Weight: ");
        }
    }
    private void getWeightAgain(){
        weight.setText("Weight: "+weight1+" kgs");
    }

    private void getTemp(){
        if(getIntent().hasExtra("Temp: ")){
            temperament1=getIntent().getStringExtra("Temp: ");
        }
    }
    private void getTempAgain(){
        temperament.setText("Temperament: "+temperament1);
    }

    private void getdogImage(){
        if(getIntent().hasExtra("Image: ")){
            url1=getIntent().getStringExtra("Image: ");
        }
    }
    private void getImageAgain(){
        Picasso.with(context).load(url1).into(dogImage);
    }

}