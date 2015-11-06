package com.jvalantdave.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;


public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

<<<<<<< HEAD
                // the button was clicked, so update the fact label with a new fact
                String fact = "";
                //randomly select a fact
                Random randomGenerator = new Random(); // construct a new Random number generator
                int randomNumber = randomGenerator.nextInt(16);

                /* Convert the randomNumber to a text fact
                 0 = Ants stretch when they wake up in the morning
                 1 = Ostriches can run faster than horses.
                 2 = Olympic gold medals are actually made mostly of silver.
                 3 = Banging your head against a wall burns 150 calories per hour.
                 4 = When hippos are upset, their sweat turns red.
                 5 = If you consistently fart for 6 years and 9 months, enough gas is produced to create the energy of an atomic bomb.
                 6 = You cannot snore and dream at the same time.
                 7 = A toaster uses almost half as much energy as a full-sized over.
                 8 = Jason is a pundai.
                 9 = Vithushan has never made fantasy playoffs.
                 10 = Sujee is the Los Angeles Clippers of our fantasy league.
                 11 = Prez is the Tupac of this generation.
                 12 = Glenn is just plain shit at fantasy.
                 13 = JV will win the 2015-2016 fantasy league.
                 14 = Lucksson thinks he ripped off JV with that Howard trade last year but he doesn't know it's all part of the plan.
                 15 = Sneha is a dingus

=======
                String fact = mFactBook.getFact();
>>>>>>> origin/master

                // the button was clicked, so update the fact label with a new fact
                factLabel.setText(fact);

                mFactBook.mFacts[0] = "Pigs are cool";
            }
        };
        showFactButton.setOnClickListener(listener);
    }


}
