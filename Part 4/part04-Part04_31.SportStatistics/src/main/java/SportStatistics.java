import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int gameCount = 0;
        int teamWins = 0;
        int teamLosses = 0;
 
        //ArrayList<Team> teams = new ArrayList<>();
 
        try(Scanner scanner = new Scanner(Paths.get(file))){
 
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
 
                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
 
                if(team1.equals(team) || team2.equals(team)){
                    gameCount++;
                    if(team1.equals(team) && score1 > score2){
                        teamWins++;
                    }else if(team2.equals(team) && score1 < score2){
                        teamWins++;
                    }else{
                        teamLosses++;
                    }
                }
 
            }
        } catch(Exception e){
            System.out.println("File not found.");
        }
 
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }
}