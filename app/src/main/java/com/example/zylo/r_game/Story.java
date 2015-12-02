package com.example.zylo.r_game;

/**
 * Created by Zylo on 12/1/2015.
 */
public class Story {

    public  Story()
    {

        // The story should always start at a Scene called S1.

        Scene S1 = new Scene("The begening is here; where will you go now?");
        Scene S2 = new Scene("You are at the mall.");
        Scene S3 = new Scene("You are at the park.");


        S1.createChoice("mall", S2);
        S1.createChoice("park", S3);







    }

}
