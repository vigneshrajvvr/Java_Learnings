package com.java.learn;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(-1, 1);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(6, -10);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters =  feet * 30.48 + inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }

        System.out.println("Invalid feet or inches parameters");
        return -1;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0) {

            double feet = inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        return -1;
    }
}
