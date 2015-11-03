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

                // the button was clicked, so update the fact label with a new fact
                String[] facts = {
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


                 */

                /*if (randomNumber == 0) {
                    fact = "Ants stretch when they wake up in the morning";
                }
                else if (randomNumber == 1) {
                    fact = "Ostriches can run faster than horses.";
                }
                else if (randomNumber == 2) {
                    fact = "Olympic gold medals are actually made mostly of silver.";
                }
                else if (randomNumber == 3) {
                    fact = "Banging your head against a wall burns 150 calories per hour.";
                }
                else if (randomNumber == 4) {
                    fact = "When hippos are upset, their sweat turns red.";
                }
                else if (randomNumber == 5) {
                    fact = "If you consistently fart for 6 years and 9 months, enough gas is produced to smell like Winthya";
                }
                else if (randomNumber == 6) {
                    fact = "You cannot snore and dream at the same time.";
                }
                else if (randomNumber == 7) {
                    fact = "Samiya is also a synonym for llama. ";
                }
                else if (randomNumber == 8) {
                    fact = "Jason is a pundai.";
                }
                else if (randomNumber == 9) {
                    fact = "Vithushan has never made fantasy playoffs.";
                }
                else if (randomNumber == 10) {
                    fact = "Sujee is the Los Angeles Clippers of our fantasy league.";
                }
                else if (randomNumber == 11) {
                    fact = "Prez is the Tupac of this generation.";
                }
                else if (randomNumber == 12) {
                    fact = "Glenn is just plain shit at fantasy.";
                }
                else if (randomNumber == 13) {
                    fact = "JV will win the 2015-2016 fantasy league. He's also an overall swell guy.";
                }
                else if (randomNumber == 14) {
                    fact = "Lucksson gonna take 3 D's when he faces JV in the playoffs. ";
                }
                else if (randomNumber == 15) {
                    fact = "Sneha is a dingus";
                }
                else {

                }
                */
                //update the label with our dynamic fact
                factLabel.setText(facts);
            }
        };
        showFactButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
