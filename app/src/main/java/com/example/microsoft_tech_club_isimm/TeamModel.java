package com.example.microsoft_tech_club_isimm;

public class TeamModel {

    private String MemberName , MemeberDescription ;
    private int MemberImg ;
    public TeamModel(String Mname , String Mdesc,int Mimg){
        this.MemberName=Mname;
        this.MemeberDescription=Mdesc;
        this.MemberImg=Mimg;
    }

    public TeamModel() {

    }

    public String getMemberName (){
        return MemberName ;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getMemeberDescription() {
        return MemeberDescription;
    }

    public void setMemeberDescription(String memeberDescription) {
        MemeberDescription = memeberDescription;
    }

    public int getMemberImg() {
        return MemberImg;
    }

    public void setMemberImg(int memberImg) {
        MemberImg = memberImg;
    }
}