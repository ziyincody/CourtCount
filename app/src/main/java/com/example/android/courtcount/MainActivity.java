package com.example.android.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int score_a = 0;
    int score_b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void add3(View v) {
        score_a = score_a + 3;
        displayForTeamA(score_a);
    }

    public void add2(View v){
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }

    public void add1(View v){
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }

    public void add3b(View v) {
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }

    public void add2b(View v){
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }

    public void add1b (View v){
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }

    public void reset(View v){
        score_b = 0;
        score_a = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }
}
