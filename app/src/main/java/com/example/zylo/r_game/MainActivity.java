package com.example.zylo.r_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int Strength = 10;
    TextView tv1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Scene currentScene;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.desc);
        b1 = (Button)findViewById(R.id.c1);
        b2 = (Button)findViewById(R.id.c2);
        b3 = (Button)findViewById(R.id.c3);
        b4 = (Button)findViewById(R.id.c4);
        setStory();
    }



    public void setScene(Scene s)
    {
        setDesc(s);
        Choice c;
        setChoices(s.getC1().getName(), s.getC1().getNext(), s.getC2().getName(), s.getC2().getNext(), s.getC3().getName(), s.getC3().getNext(), s.getC4().getName(), s.getC4().getNext());
        if (s.getChange() != null) s.runChange();
    }

    public void setChoices(String c1, Scene s1, String c2, Scene s2,String c3, Scene s3,String c4, Scene s4)
    {
        // setting all the buttons texts to reflect the choices form the scene.
        b1.setText(c1);
        b2.setText(c2);
        b3.setText(c3);
        b4.setText(c4);
    }



    public void setDesc(Scene s)
    {
        tv1.setText(s.getDesc());
    }


    // button press commands, if there is no scene to go to they do nothing.
    public void pressb1(View view)
    {
        if (currentScene.getC1().getNext() != null) {
            currentScene.getC1().runTest();
           // currentScene.getC4().runChange();
            currentScene = currentScene.getC1().getNext();
            setScene(currentScene);
        }
    }

    public void pressb2(View view)
    {
        if (currentScene.getC2().getNext() != null) {
            currentScene.getC2().runTest();
           // currentScene.getC2().runChange();
            currentScene = currentScene.getC2().getNext();
            setScene(currentScene);
        }
    }

    public void pressb3(View view)
    {
        if (currentScene.getC3().getNext() != null) {
            currentScene.getC3().runTest();
            //currentScene.getC3().runChange();
            currentScene = currentScene.getC3().getNext();
            setScene(currentScene);
        }
    }

    public void pressb4(View view)
    {
        if (currentScene.getC4().getNext() != null) {
            currentScene.getC4().runTest();
            //currentScene.getC4().runChange();
            currentScene = currentScene.getC4().getNext();
            setScene(currentScene);
        }

    }





    public void setStory()
    {

        // The story should always start at a Scene called S1.

        Scene S1 = new Scene("What should you do?");
        Scene S2 = new Scene("You win the fight.");
        Scene S3 = new Scene("You train hard and get riiiiiped.");
        S3.setChange(Strength,"add",1);



        S1.createChoice("fight", S1);
        S1.createChoice("train", S3);
        S1.setChoicec1(Strength,"greater",11,S2);

        S3.createChoice("back", S1);



        // after initilizing the story scene we set the game to the first scene.
        setScene(S1);
        currentScene = S1;







    }



}
