package com.example.deltatask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class breedDetails extends AppCompatActivity {
    private TextView DogName;
    private TextView life_span;
    private TextView breed_group;
    private TextView bred_for;
    private TextView height;
    private TextView temperament;
    private TextView weight;
    private String dogname1;
    private String life_span1;
    private String group1;
    private String for1;
    private String temperament1;

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
        getdogName();
        getnameAgain();
        getLifeSpan();
        getLifeAgain();
        getBreedGroup();
        getGroupAgain();
        getFor();
        getForAgain();
        getTemp();
        getTempAgain();
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
        life_span.setText(life_span1);
    }

    private void getBreedGroup(){
        if(getIntent().hasExtra("Group: ")){
            group1=getIntent().getStringExtra("Group: ");
        }
    }
    private void getGroupAgain(){
        breed_group.setText(group1);
    }

    private void getFor(){
        if(getIntent().hasExtra("Bred_for: ")){
            for1=getIntent().getStringExtra("Bred_for: ");
        }
    }
    private void getForAgain(){
        bred_for.setText(for1);
    }

    private void getTemp(){
        if(getIntent().hasExtra("Temp: ")){
            temperament1=getIntent().getStringExtra("Temp: ");
        }
    }
    private void getTempAgain(){
        temperament.setText(temperament1);
    }

}