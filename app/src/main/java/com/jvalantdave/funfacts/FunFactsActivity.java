package com.jvalantdave.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

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

        //String message = "Sick! Our activity got created yo";
        //Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        //welcomeToast.show();

        //above three lines do same as below
        //Toast.makeText(this,"Sick! Our activity was created yo", Toast.LENGTH_LONG).show();

        Log.d(TAG,"We're logging from the onCreate() method!");
    }
}

