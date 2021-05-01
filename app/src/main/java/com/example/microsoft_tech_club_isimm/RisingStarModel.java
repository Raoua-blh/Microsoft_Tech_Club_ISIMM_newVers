package com.example.microsoft_tech_club_isimm;

public class RisingStarModel  {
    private String RisingStarName , RSmonth ;
    private int rsImg ;


    public RisingStarModel(String Mname, String monthh , int Mimg){
        this.RisingStarName=Mname;
        this.RSmonth=monthh;
        this.rsImg=Mimg;
    }

    public RisingStarModel() {

    }

    public String getRisingStarName() {
        return RisingStarName;
    }

    public void setRisingStarName(String risingStarName) {
        RisingStarName = risingStarName;
    }

    public String getRSmonth() {
        return RSmonth;
    }

    public void setRSmonth(String RSmonth) {
        this.RSmonth = RSmonth;
    }

    public int getRsImg() {
        return rsImg;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }
}
