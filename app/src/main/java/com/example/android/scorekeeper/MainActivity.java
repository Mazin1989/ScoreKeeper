package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int penaltyTeamA = 0;

    int scoreTeamB = 0;
    int foulTeamB = 0;
    int penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given fouls for Team A.
     */

    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalities for Team A.
     */

    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void addOneFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void addOnePenaltyTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltyForTeamA(penaltyTeamA);
    }


    /**
     * Displays the given score for Team B.
     */

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given penalities for Team B.
     */

    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }


    public void addOneFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void addOnePenaltyTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltyForTeamB(penaltyTeamB);
    }


    /**
     * Rest score, foul and penalty kicks for both teams
     */

    public void resetDetails(View v) {
        scoreTeamA = 0;
        foulTeamA = 0;
        penaltyTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        penaltyTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
        displayPenaltyForTeamA(penaltyTeamA);

        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);
        displayPenaltyForTeamB(penaltyTeamB);
    }


}
