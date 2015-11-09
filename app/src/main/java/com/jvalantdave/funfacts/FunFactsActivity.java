package com.jvalantdave.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;



public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);

        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();

                // the button was clicked, so update the fact label with a new fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);



            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

