import java.util.*;
public class HighScoreWins {
    public static void main(){System.out.println("Please enter the game score in the following format");
    System.out.println("Home:Visitor|21:9");
    Scanner scanner = new Scanner(System.in);
    String Input1 = scanner.nextLine();
    String[] gamearray = Input1.split("\\|");
    //System.out.println(gamearray[0]);
    //System.out.println(gamearray[1]);
    String[] team_names = gamearray[0].split("\\:");
    String[] scores = gamearray[1].split("\\:");

    int score0 = Integer.parseInt(scores[0]);
    int score1 = Integer.parseInt(scores[1]);

    if ( score0 >  score1 )
        { System.out.println("Winner: " + team_names[0]); }
    else
        { System.out.println("Winner: " + team_names[1]); }

        }


}

