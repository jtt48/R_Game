package com.example.zylo.r_game;

/**
 * Created by Zylo on 12/1/2015.
 */
public class Choice {

    private String name = "";

    // the next scene
    private Scene next = null;
    // the default scene.
    private Scene next1 = null;
    // the scene if a test suceededs.
    private Scene next2 = null;
    // a test
    private Test challenge = null;

    private Change change = null;

    public void create(String n, Scene s)
    {
            name = n;
            next1 = s;
            next = s;
    }

    // the current plan is that when a button is pressed it will first check if the choice has a test.
    // if the choice has a test it will run it and change the connecting scene if it passes/fails
    // if there is no test it just moves to the next scene.
    public void setChoice(int a, String c, int b, Scene s)
    {
        //System.out.println("setting chouice " + a + c + b + s);
        challenge = new Test();
        challenge.setTest(a,c,b);
        next2 = s;
    }

    // originaly changes were inside choices but it make more sense for them to be in scenes. So they were
    // moved there.
   /* public void setChange(int a, String c, int b)
    {
        //System.out.println("setting chouice " + a + c + b + s);
        change = new Change();
        change.setChange(a,c,b);
    }*/

    // check to make sure we actually have a test, if we do we ask it to compare its values and give us
    //an anwser, if its true then we set the next scene the to next 2.
    public void runTest()
    {
        if (challenge == null) return;
        else if (challenge.compare()) next = next2;
        else return;
    }

    /*public void runChange()
    {
        if (change == null) return;
        else change.runChange();
    }*/

    public String getName()
    {
        return name;
    }

    public Scene getNext()
    {
        return next;
    }




}
