package com.example.owner.resultstable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "main";

    // textview variables
    TextView RestaurantWinner;
    TextView rest1;
    TextView rest2;
    TextView rest3;
    TextView vote1;
    TextView vote2;
    TextView vote3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // references the text view from the layout
        RestaurantWinner = (TextView) findViewById(R.id.restaurant_winner);
        rest1 = (TextView) findViewById(R.id.restaurant1);
        rest2 = (TextView) findViewById(R.id.restaurant2);
        rest3 = (TextView) findViewById(R.id.restaurant3);
        vote1 = (TextView) findViewById(R.id.vote1);
        vote2 = (TextView) findViewById(R.id.vote2);
        vote3 = (TextView) findViewById(R.id.vote3);

        String Rest = Restaurant.getRest();
        String Rest1 = Restaurant.getRest1();
        String Rest2 = Restaurant.getRest2();
        String Vote1 = Restaurant.getVote();
        String Vote2 = Restaurant.getVote1();
        String Vote3 = Restaurant.getVote2();

        //Display the restaurants
        RestaurantWinner.append(Rest);
        rest1.append(Rest);
        rest2.append(Rest1);
        rest3.append(Rest2);
        vote1.append(Vote1);
        vote2.append(Vote2);
        vote3.append(Vote3);

    }




}
