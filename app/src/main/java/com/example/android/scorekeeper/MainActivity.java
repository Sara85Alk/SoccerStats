package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, int yellow, int red) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

        Button yellowButton = findViewById(R.id.team_a_yellow);
        yellowButton.setText(String.valueOf(yellow));

        Button redButton = findViewById(R.id.team_a_red);
        redButton.setText(String.valueOf(red));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score, int yellow, int red) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

        Button yellowButton = findViewById(R.id.team_b_yellow);
        yellowButton.setText(String.valueOf(yellow));

        Button redButton = findViewById(R.id.team_b_red);
        redButton.setText(String.valueOf(red));
    }

    /**
     * Add goals team A
     */
    public void addGoalTeamA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA, yellowTeamA, redTeamA);
    }

    /**
     * Add goals team B
     */
    public void addGoalTeamB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB, yellowTeamB, redTeamB);
    }

    /**
     * Add yellow team A
     */
    public void addYellowTeamA(View view) {
        yellowTeamA++;
        displayForTeamA(scoreTeamA, yellowTeamA, redTeamA);
    }

    /**
     * Add yellow team B
     */
    public void addYellowTeamB(View view) {
        yellowTeamB++;
        displayForTeamB(scoreTeamB, yellowTeamB, redTeamB);
    }

    /**
     * Add red team A
     */
    public void addRedTeamA(View view) {
        redTeamA++;
        displayForTeamA(scoreTeamA, yellowTeamA, redTeamA);
    }

    /**
     * Add red team B
     */
    public void addRedTeamB(View view) {
        redTeamB++;
        displayForTeamB(scoreTeamB, yellowTeamB, redTeamB);
    }


    /**
     * Reset scores
     */
    public void resetStats(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        displayForTeamA(scoreTeamA, yellowTeamA, redTeamA);
        displayForTeamB(scoreTeamB, yellowTeamB, redTeamB);
    }


}