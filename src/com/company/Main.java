package com.company;

import java.text.*;
import java.util.*;
public class Main {

    public static ArrayList<MessageList> aryLst = new ArrayList<MessageList>();
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int option = 0;
        Message m;
        MessageList ml;

        while(true){
            System.out.println("Press: (1)Send Text (2)Show Texts");
            option = input.nextInt();
            input.nextLine();

            if(option == 1){
                String txt = "";
                String num = "";
                System.out.println("Enter phone number to send to:");
                num = input.nextLine();
                System.out.println("Type a message to send:");
                txt = input.nextLine();
                m = new Message(num, txt);
                addToList(m);
                System.out.println("Message sent.");
            }
            else if(option == 4){
                String numb = "";
                System.out.println("Display messages from which number?");
                numb = input.next();
                findList(numb).displayMsgs();
            }

        }
    }

    public static void addToList(Message msg){
        if(aryLst.isEmpty()){
            aryLst.add(new MessageList());
            aryLst.get(0).add(msg);
        }
        else{
            boolean flag = false;
            for(MessageList ml: aryLst){
                if(ml.getNum().equals(msg.getNumber())){
                    ml.add(msg);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                aryLst.add(new MessageList(msg.getNumber()));
                aryLst.get(aryLst.size() - 1).add(msg);
            }
        }
    }

    public static MessageList findList(String pNum){
        for(MessageList ml: aryLst){
            if(ml.getNum().equals(pNum)){
                return ml;
            }
        }
        return null;
    }
    }
}
