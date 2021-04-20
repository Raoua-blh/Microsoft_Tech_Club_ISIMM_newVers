package com.example.microsoft_tech_club_isimm;

public class EventModel {
    private String EventName , EventDescription  ;
    public  EventModel( String EventName  , String EventDescription ){
        this.EventName=EventName;
        this.EventDescription=EventDescription;

    }

    public EventModel() {

    }


    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDescription() {
        return EventDescription;
    }

    public void setEventDescription(String eventDescription) {
        EventDescription = eventDescription;
    }
}
