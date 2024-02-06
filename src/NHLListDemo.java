import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

import static javax.print.attribute.standard.MediaSizeName.C;

public class NHLListDemo {
    public static void main(String[] args) {

        String filePath = "src/nhlstats.txt"; // Replace with your file path
        String name;
        String position;
        String teamName;
        int gamePlayed;
        int goalScored;
        int assist;
        int penaltyMin;
        int shotGoals;
        int gameWinGoal;
        NHLStats nhlStats = new NHLStats();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "\t"); // Assuming comma as a delimiter

                    name = st.nextToken().trim();


                    position = st.nextToken().trim();

                    teamName = st.nextToken().trim();

                    gamePlayed = Integer.parseInt(st.nextToken().trim());

                    goalScored = Integer.parseInt(st.nextToken().trim());


                    assist = Integer.parseInt(st.nextToken().trim());


                    penaltyMin = Integer.parseInt(st.nextToken().trim());


                    shotGoals = Integer.parseInt(st.nextToken().trim());


                    gameWinGoal = Integer.parseInt(st.nextToken().trim());



                PlayerRecord p = new PlayerRecord(name,position,teamName,gamePlayed,goalScored,assist,penaltyMin,shotGoals,gameWinGoal);
                nhlStats.addPlayer(p);
//                System.out.println(p.toString());


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Players with highest points and their teams:");
        nhlStats.displayPlayerNameAndTeam();
        System.out.println();
        System.out.println("Most aggressive players, their teams and their positions:");
        nhlStats.displayMostAgressivePlayer();
        System.out.println();
        System.out.println("Most valuable players and their teams:");
        nhlStats.displayMvp();
        System.out.println();
        System.out.println("Most promising players and their teams: ");
        nhlStats.displayPromisingPlayer();
        System.out.println();
        System.out.println("Teams that had the most number of penalty minutes:");
        nhlStats.displayBestpenaltyTeam();
        System.out.println();
        System.out.println("Teams that had the most number of game winning goals:");
        nhlStats.displayGameWinGoals();

    }
}
