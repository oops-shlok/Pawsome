package com.example.deltatask3;

public class infoClass {
    public Image image;
    public Height height;
    public Weight weight;
    private String url,name,bred_for,breed_group,temperament,life_span,metric;


    infoClass(Image image, Height height, Weight weight, String url, String name, String bred_for, String temperament, String life_span, String breed_group, String metric){
        this.image=image;
        this.height=height;
        this.weight=weight;
        this.url = url;
        this.name=name;
        this.bred_for = bred_for;
        this.temperament = temperament;
        this.life_span = life_span;
        this.breed_group = breed_group;
        this.metric = metric;
    }

    public Image getImage(){
        return image;
    }

    public Height getHeight(){
        return height;
    }

    public Weight getWeight(){
        return weight;
    }

    public String getTextview() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getLife_span(){
        return life_span;
    }

    public String getBreed_group(){
        return breed_group;
    }

    public String getBred_for() {
        return bred_for;
    }


    public String getTemperament() {
        return temperament;
    }


    public String getMetric() {
        return metric;
    }
}
