package com.example.android.pacmanscoringapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pacman_score = 0;
    int ghosts_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Pac-Man by 10 points.
     */
    public void addTenForPacman(View v) {
        pacman_score = pacman_score + 10;
        displayForPacman(pacman_score);
    }




    /**
     * Increase the score for Pac-Man by 200 points.
     */
    public void addGhostPoints(View v) {
        pacman_score = pacman_score + 200;
        displayForPacman(pacman_score);
    }

    /**
     * Increase the score for Pac-Man by 100 points.
     */
    public void addCherryPoints(View v) {
        pacman_score = pacman_score + 100;
        displayForPacman(pacman_score);
    }

    /**
     * Increase the score for Ghosts by 100 points on first hit.
     */
    public void addFirstHit(View v) {
        ghosts_score = ghosts_score + 100;
        displayForGhosts(ghosts_score);
    }

    /**
     * Increase the score for Ghosts by 200 points on second hit.
     */
    public void addSecondHit(View v) {
        ghosts_score = ghosts_score + 200;
        displayForGhosts(ghosts_score);
    }

    /**
     * Increase the score for Ghosts by 300 points.
     */
    public void addThirdHit(View v) {
        ghosts_score = ghosts_score + 300;
        displayForGhosts(ghosts_score);
    }

    /**
     * Resets scores for Pac-Man and Ghosts to 0.
     */
    public void reset(View v) {
        pacman_score = 0;
        ghosts_score = 0;
        displayForPacman(pacman_score);
        displayForGhosts(ghosts_score);
    }

    /**
     * Displays the given score for Pac-Man.
     */
    public void displayForPacman(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pacman_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Ghosts.
     */
    public void displayForGhosts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ghosts_score);
        scoreView.setText(String.valueOf(score));
    }
}
