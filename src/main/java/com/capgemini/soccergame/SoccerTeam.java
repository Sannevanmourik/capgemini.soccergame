package com.capgemini.soccergame;

import java.util.Random;

public class SoccerTeam implements Playable{

    private String teamname;
    private int score;

    //constructor SoccerTeam
    public SoccerTeam(String teamname) {
        this.teamname = teamname;
    }

    //get + set teamname
    public String getTeamname() {
        return this.teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

   //get score
    public int getScore() {
        Random random = new Random();
        this.score = random.nextInt(10);
        return this.score;
    }

    //override toString so it always prints the name of the team
    @Override
    public String toString(){
        return teamname;
    }


    //implement Playable
    @Override
    public int play() {
        Random random = new Random();
        this.score = random.nextInt(11);

        return this.score;
    }
}

