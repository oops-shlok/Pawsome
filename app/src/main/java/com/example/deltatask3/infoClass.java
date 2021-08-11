package com.example.deltatask3;

public class infoClass {
    private String imageurl;
    private String name;
    private String bred_for;
    private String temperament;
    private String metric;
    private String life_span;
    private String breed_group;





    infoClass(String imageurl, String name, String bred_for, String temperament, String life_span, String breed_group){
        this.imageurl = imageurl;
        this.name=name;
        this.bred_for = bred_for;
        this.temperament = temperament;
        this.life_span = life_span;
        this.breed_group = breed_group;

    }

    public void setImageurlUrl(String url){
        this.imageurl=imageurl;
    }


    public String getTextview() {
        return name;
    }

    public String getImageUrl() {
        return imageurl;
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

}
