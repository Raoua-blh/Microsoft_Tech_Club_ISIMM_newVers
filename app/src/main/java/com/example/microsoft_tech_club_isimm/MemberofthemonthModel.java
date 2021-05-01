package com.example.microsoft_tech_club_isimm;

public class MemberofthemonthModel {
    private String MemberofthemonthName , month ;
    private int MemberImg ;


    public MemberofthemonthModel(String Mname, String monthh , int Mimg){
        this.MemberofthemonthName=Mname;
        this.month=monthh;
        this.MemberImg=Mimg;
    }

    public MemberofthemonthModel() {

    }

    public String getMemberofthemonthName() {
        return MemberofthemonthName;
    }

    public void setMemberofthemonthName(String memberofthemonthName) {
        MemberofthemonthName = memberofthemonthName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getMemberImg() {
        return MemberImg;
    }

    public void setMemberImg(int memberImg) {
        MemberImg = memberImg;
    }
}
