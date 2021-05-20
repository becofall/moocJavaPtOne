
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {
                String line = scanFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitTeamPoints = Integer.valueOf(parts[3]);
                //System.out.println(homeTeam + visitTeam + homeTeamPoints + visitTeamPoints);
                if (homeTeam.equals(team) || visitTeam.equals(team)) {
                    gamesPlayed++;
                }
                if (homeTeam.equals(team)) {
                    if (homeTeamPoints > visitTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (visitTeam.equals(team)) {
                    if (visitTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
