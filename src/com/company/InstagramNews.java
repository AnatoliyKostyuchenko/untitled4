package com.company;

public class InstagramNews extends News1 implements Speciality{
    private String popularity;
    public InstagramNews(popularity){
        this.popularity = popularity;
    }
    public String getPopularity(){
        return popularity;
    }

    @Override
    public void speciall() {
        System.out.println("Учитывается популярность");
    }
}
