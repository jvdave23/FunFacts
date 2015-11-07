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
            "If you consistently fart for 6 years and 9 months, enough gas is produced to smell like Winthya",
            "You cannot snore and dream at the same time.",
            "Samiya is also a synonym for llama. ",
            "Jason is a pundai.",
            "Vithushan has never made fantasy playoffs.",
            "Sujee is the Los Angeles Clippers of our fantasy league.",
            "Prez is the Meek Mill of this generation.",
            "Glenn is just plain shit at fantasy.",
            "JV will win the 2015-2016 fantasy league. He's also an overall swell guy.",
            "Lucksson gonna take 3 D's when he faces JV in the playoffs. ",
            "Sneha is a dingus"

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