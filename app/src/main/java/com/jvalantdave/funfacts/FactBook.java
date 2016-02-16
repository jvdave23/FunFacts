package com.jvalantdave.funfacts;

import java.util.Random;

/**
 * Created by JvalantDave on 2015-11-04.
 */
public class FactBook {

    public String[] mFacts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "Banging your head against a wall burns 150 calories per hour.",
            "When hippos are upset, their sweat turns red.",
            "A car that shifts manually gets 2 miles more per gallon of gas than a car with automatic shift.",
            "You cannot snore and dream at the same time.",
            "In ancient Rome, it was considered a sign of leadership to be born with a crooked nose.",
            "A lion's roar can be heard from five miles away.",
            "When snakes are born with two heads, they fight each other for food.",
            "Every year about 98% of the atoms in your body are replaced.",
            "The king of hearts is the only king without a moustache.",
            "Southern California has about 10,000 earthquakes each year, though most are so small that they are never felt.\n",
            "An apple, potato, and onion all taste the same if you eat them with your nose plugged.",
            "A small child could swim through the veins of a blue whale. ",
            "The Bible is the most shoplifted book in the world."

    };

    public String getFact() {



        String fact = "";

        //randomly select a fact
        Random randomGenerator = new Random(); // construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}