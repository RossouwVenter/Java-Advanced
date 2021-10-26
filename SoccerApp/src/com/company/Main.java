package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\rosso\\OneDrive\\Desktop\\Java Advanced\\Work\\SoccerApp\\data.txt");
        Scanner sc = null;

        String[] team1, team2, score1, score2;


        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String match = sc.nextLine();
                String[] split1 = match.trim().split(",");

                String[] teamArray1 = split1[0].trim().split(" ");
                String[] teamArray2 = split1[1].trim().split(" ");

                team1 = teamArray1[0].split(" ");
                team2 = teamArray2[0].split( " ");

                score1 = teamArray1[1].split(" ");
                score2 = teamArray2[1].split(" ");
                for (String string : team1){
                    System.out.println("Team1: " + string);
                }
                for (String string : team2){
                    System.out.println("Team2: " + string);
                }
                for (String string : score1){
                    System.out.println("Score1: " + string);
                }
                for (String string : score2){
                    System.out.println("Score2: " + string);
                }

            }
        } catch (FileNotFoundException var9) {
            var9.printStackTrace();
        }

        while (sc.hasNextLine()){

        }

    }
}

