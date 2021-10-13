package com.company;

public class YoutubeNews extends News1 implements Speciality{
    private int vies;
    public YoutubeNews(vies){
        this.vies = vies;
    }
    public int getVies() {
        return vies;
    }

    @Override
    public void speciall() {
        System.out.println("Учитывает просмотры");
    }
}
