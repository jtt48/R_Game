package com.example.zylo.r_game;

/**
 * Created by Zylo on 12/2/2015.
 */
public class Change {

    int value1;
    int value2;
    String action;

    public void setChange(int a, String c, int b){

        //System.out.println("setting chouice " + a + c + b);

        value1 = a;
        value2 = b;
        action = c;

    }

    public void runChange() {
        System.out.println("setting chouice " + value1);
        if (action.equals("add"))  {value1 = value1 + value2;}
        if (action.equals("subtract"))  value1 = value1 - value2;
        if (action.equals("set"))  value1 =  value2;
        else return;

    }



}

