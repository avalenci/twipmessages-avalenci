package com.company;

import java.util.ArrayList;
public class MessageList {
    public ArrayList texts = new ArrayList();
    public String name = "";

    public class textList(String n) {
        name = n;
    }

    public void add(Message m){
        int count = 0;
        long time = m.getTimeReceived().getTime();
        for(m: texts){
            if(time > m.getTimeReceived().getTime()){
                count++;
            }
        }
        texts.add(count, m);
    }

    public void remove(int position){
        texts.remove(position);
    }

    public void clear(){
        texts.clear();
    }

    public Message get(int position){
        return (Message)texts.get(position);
    }

    public void move(int position, MessageList ml1, MessageList ml2){
        if(ml1 == null){
            System.out.println("The message list you specified does not exist.");
        }
        else{
            ml1.add(ml2.get(position));
            ml2.remove(position);
        }
    }

    public void displayMsgs(Message m){
        System.out.println("From: " + name);
        for(m: texts){
            System.out.println("\t" + m.getText() + "   Recieved: " + m.getFormattedTimeReceived() + "\n");
        }
    }

    public String getNum(){
        return texts;
    }
}
