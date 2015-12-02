package com.example.zylo.r_game;

/**
 * Created by Zylo on 12/2/2015.
 */
public class Test {

    int value1;
    int value2;
    String action;

     public void setTest(int a, String c, int b){

         //System.out.println("setting chouice " + a + c + b);

         value1 = a;
         value2 = b;
         action = c;

    }

    public boolean compare() {
        if (action.equals("lesser")) return (value1 < value2);
        if (action.equals("greater")) return (value1 > value2);
        if (action.equals("equall")) return (value1 == value2);
        else return false;

    }



}
