
package com.example.microsoft_tech_club_isimm;
public class TrainingModel {
    private String TrainingTitle , TriningDescription , dateTraining  ;
    private int TrainingImg ;
    
    public TrainingModel (String TrainingTitle ,String TriningDescription ,int TrainingImg ,String dateTraining ){
        this.TrainingTitle=TrainingTitle ; 
        this.TriningDescription = TriningDescription ;
        this.TrainingImg = TrainingImg ;
        this.dateTraining=dateTraining ;
    }

    public TrainingModel() {

    }

    public String getDateTraining() {
        return dateTraining;
    }

    public void setDateTraining(String dateTraining) {
        this.dateTraining = dateTraining;
    }

    public String getTrainingTitle() {
        return TrainingTitle;
    }

    public void setTrainingTitle(String trainingTitle) {
        TrainingTitle = trainingTitle;
    }

    public String getTriningDescription() {
        return TriningDescription;
    }

    public void setTriningDescription(String triningDescription) {
        TriningDescription = triningDescription;
    }

    public int getTrainingImg() {
        return TrainingImg;
    }

    public void setTrainingImg(int trainingImg) {
        TrainingImg = trainingImg;
    }
}

