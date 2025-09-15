/*9.Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
 */
import java.util.Scanner;

public class rockPaperScissors {

    static String getComputerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        else if (r == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Tie";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();

        int userWins = 0, compWins = 0;
        String[] userChoice = new String[n];
        String[] compChoice = new String[n];
        String[] winner = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String win = findWinner(user, comp);

            userChoice[i] = user;
            compChoice[i] = comp;
            winner[i] = win;

            if (win.equals("User")) userWins++;
            else if (win.equals("Computer")) compWins++;
        }

        System.out.println("\nGame  User  Computer  Winner");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " " + userChoice[i] + " " + compChoice[i] + " " + winner[i]);
        }

        System.out.println("\nTotal Wins:");
        System.out.println("User: " + userWins + " (" + (userWins * 100.0 / n) + "%)");
        System.out.println("Computer: " + compWins + " (" + (compWins * 100.0 / n) + "%)");
    }
}

