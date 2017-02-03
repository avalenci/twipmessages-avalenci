package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Message {
    public Message(String n, String txt) {
        number = n;
        text = txt;
        timeReceived = new Date(System.currentTimeMillis());
    }
    public Date getTimeReceived(){
        return timeReceived;
    }

    public String getFormattedTimeReceived(){
        DateFormat form = new SimpleDateFormat("HH:mm");
        return form.format(timeReceived);
    }

    public void changeData(String n, String m){
        number = n;
        text = m;
    }
    public String getNumber(){
        return number;
    }

    public String getText(){
        return text;
    }
    public String number, text;
    private Date timeReceived;
}
