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
    private static final String KEY_FACT = "KEY_FACT" ;
    private static final String KEY_COLOR = "KEY_COLOR";

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private String mFact = mFactBook.mFacts[0];
    private int mColor = Color.parseColor(mColorWheel.mColors[8]);

    private TextView mFactLabel;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        
        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mFact = savedInstanceState.getString(KEY_FACT);
        mFactLabel.setText(mFact);

        mColor = savedInstanceState.getInt(KEY_COLOR);
        mRelativeLayout.setBackgroundColor(mColor);
        mShowFactButton.setTextColor(mColor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // declare our view variables
        mFactLabel = (TextView) findViewById(R.id.factTextView);

        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mFact = mFactBook.getFact();

                // the button was clicked, so update the fact label with a new fact
                mFactLabel.setText(mFact);

                mColor = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(mColor);
                mShowFactButton.setTextColor(mColor);



            }
        };
        mShowFactButton.setOnClickListener(listener);

        //String message = "Sick! Our activity got created yo";
        //Toast welcomeToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        //welcomeToast.show();

        //above three lines do same as below
        //Toast.makeText(this,"Sick! Our activity was created yo", Toast.LENGTH_LONG).show();

        Log.d(TAG,"We're logging from the onCreate() method!");
    }
}

