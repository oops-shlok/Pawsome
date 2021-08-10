package com.example.deltatask3;

public class infoClass {
    private int url;
    private String name;
    private String bred_for;
    private String temperament;
    private String metric;
    private String life_span;
    private String breed_group;





    infoClass(String name, int url, String bred_for, String temperament, String life_span, String breed_group){
        this.name=name;
        this.url=url;
        this.bred_for = bred_for;
        this.temperament = temperament;
        this.life_span = life_span;
        this.breed_group = breed_group;

    }


    public String getTextview() {
        return name;
    }

    public int getUrl() {
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

}
