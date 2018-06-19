package com.capgemini.soccergame;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //create 4 amateur teams
        SoccerTeam team1 = new AmateurSoccerTeam("Team 1");
        SoccerTeam team2 = new AmateurSoccerTeam("Team 2");
        SoccerTeam team3 = new AmateurSoccerTeam("Team 3");
        SoccerTeam team4 = new AmateurSoccerTeam("Team 4");

        //create 4 professional teams
        SoccerTeam team5 = new ProfessionalSoccerTeam("Team 5");
        SoccerTeam team6 = new ProfessionalSoccerTeam("Team 6");
        SoccerTeam team7 = new ProfessionalSoccerTeam("Team 7");
        SoccerTeam team8 = new ProfessionalSoccerTeam("Team 8");

        //add all teams to a list for round 1
        LinkedList<SoccerTeam> listOfTeamsForRound1 = new LinkedList<>();
        listOfTeamsForRound1.add(team1);
        listOfTeamsForRound1.add(team2);
        listOfTeamsForRound1.add(team3);
        listOfTeamsForRound1.add(team4);
        listOfTeamsForRound1.add(team5);
        listOfTeamsForRound1.add(team6);
        listOfTeamsForRound1.add(team7);
        listOfTeamsForRound1.add(team8);


        //create list for round 2
        ArrayList<SoccerTeam> listOfTeamsForRound2 = new ArrayList<>();

        //create a random score for round 1 by calling the play method
        int scoreTeam1Round1 = team1.play();
        int scoreTeam2Round1 = team2.play();
        int scoreTeam3Round1 = team3.play();
        int scoreTeam4Round1 = team4.play();
        int scoreTeam5Round1 = team5.play();
        int scoreTeam6Round1 = team6.play();
        int scoreTeam7Round1 = team7.play();
        int scoreTeam8Round1 = team8.play();

   // TODO make sure we don't have to write if else statements for every game. The code should be written more efficient.

        //determine which team has won
        //the winning team needs to be added to the listOfTeamsForRound2 so the steps can be repeated in round 2
        if (scoreTeam1Round1 > scoreTeam5Round1) {
            listOfTeamsForRound2.add(team1);
            System.out.println(team1 + " has scored " + scoreTeam1Round1 + " goal(s)!");
            System.out.println(team5 + " has scored " + scoreTeam5Round1 + " goal(s)!");
            System.out.println(team1 + " won!");
        }
        else if (scoreTeam1Round1 == scoreTeam5Round1) {
            System.out.println(team1 + " has scored " + scoreTeam1Round1 + " goal(s)!");
            System.out.println(team5 + " has scored " + scoreTeam5Round1 + " goal(s)!");
            System.out.println("It is a tie!");
            //TODO create method for penalties
        }
        else if (scoreTeam1Round1 < scoreTeam5Round1){
            listOfTeamsForRound2.add(team5);
            System.out.println(team1 + " has scored " + scoreTeam1Round1 + " goals(!)");
            System.out.println(team5 + " has scored " + scoreTeam5Round1 + " goals(!)");
            System.out.println(team5 + " won!");
        }







    }


}
