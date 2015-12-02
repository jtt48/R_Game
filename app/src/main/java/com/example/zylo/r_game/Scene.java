package com.example.zylo.r_game;

/**
 * Created by Zylo on 12/1/2015.
 */
public class Scene {

    private String desc;
    private int picture;
    private Choice c1 = new Choice();
    private Choice c2 = new Choice();
    private Choice c3 = new Choice();
    private Choice c4 = new Choice();
    private Change change = null;
    private int cc = 1;


    public Scene(String d)
    {
        desc = d;
    }

    // choice creation function
    public void createChoice(String n, Scene s)
    {
        // iv set up if statments so that I can call the same function to set each choice linearly
        // it will only ever accept 4 choices as is.
        if (cc == 1) {
            c1.create(n, s);

        }
        if (cc == 2) {
            c2.create(n,s);

        }

        if (cc == 3) {
            c3.create(n,s);

        }

        if (cc == 4) {
            c4.create(n,s);

        }
        else
        {

        }
        cc++;


    }

    public void setChange(int a, String c, int b)
    {
        //System.out.println("setting chouice " + a + c + b + s);
        change = new Change();
        change.setChange(a,c,b);
    }

    public void runChange()
    {
        if (change == null) return;
        else change.runChange();
    }





    //getters.
    public Choice getC1() {
        return c1;
    }

    public Choice getC2() {
        return c2;
    }

    public Choice getC3() {
        return c3;
    }

    public Choice getC4() {
        return c4;
    }
    public Change getChange(){return change;}

    public String getDesc() {
        return desc;
    }

    public void setChoicec1(int a, String c, int b, Scene s){c1.setChoice(a,c,b,s);}
    public void setChoicec2(int a, String c, int b, Scene s){c2.setChoice(a,c,b,s);}
    public void setChoicec3(int a, String c, int b, Scene s){c3.setChoice(a,c,b,s);}
    public void setChoicec4(int a, String c, int b, Scene s){c4.setChoice(a,c,b,s);}


}
