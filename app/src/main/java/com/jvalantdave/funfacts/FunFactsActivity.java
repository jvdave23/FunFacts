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

                String fact = mFactBook.getFact();

                // the button was clicked, so update the fact label with a new fact
                factLabel.setText(fact);

                mFactBook.mFacts[0] = "Pigs are cool";
            }
        };
        showFactButton.setOnClickListener(listener);
    }


}
