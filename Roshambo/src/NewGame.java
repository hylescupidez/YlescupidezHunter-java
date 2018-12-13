/*
 ********************************
 * Hunter Ylescupidez
 * AP CS A
 * Period 1
 * November 16th, 2018
 * Project #3 - Roshambo
 ********************************
 */
import java.util.Scanner;
import java.util.Random;

public class NewGame {
    //Here is the main method. First, you choose the number of rounds. You enter your name and choose rock, paper, or scissors. Then it will display score.
    public static void main(String args[]) {
        int playerwins = 0;
        int computerwins = 0;
        int tiegame = 0;
        int userchoice;
        int computerchoice;
        int playagain = 1;
        int numberofplays;

        String name;
        int input;
        Scanner user = new Scanner(System.in);
        //main game loop
        while (playagain == 1){
            System.out.println("Enter your name");
            name = user.next();
            System.out.println("Would you Like to play 3 rounds or 5 rounds?");
            numberofplays = user.nextInt();
            //Determines what is chosen and states the winner of the round
            while(numberofplays > 0) {
                System.out.println("Rock(1), Paper(2), Scissors(3)");
                System.out.println("Rock(1) beats Scissors(3), Paper(2) beats Rock(1), and Scissors(3) beats Paper(2)");
                userchoice = user.nextInt();
                computerchoice = compChoice();
                System.out.println(name + " chooses: " + userchoice);
                System.out.println("Computer chooses: " + computerchoice);

                int winner = playGame(userchoice, computerchoice);
                if (winner == 0) {
                    ++computerwins;
                    System.out.println("Computer wins");
                } else if (winner == 1) {
                    ++playerwins;
                    System.out.println("You win");
                } else {
                    ++tiegame;
                    System.out.println("Tie game");
                }
                System.out.println();
                System.out.println("Player score: " + playerwins);
                System.out.println("Computer score: " + computerwins);
                System.out.println("Tie games: " + tiegame);
                --numberofplays;
                System.out.println();
            }
            System.out.println("Play again? Yes(1) or No(0)");
            playagain = user.nextInt();

        }
        System.out.println("Thank you for playing");
    }
    //Here are all the possible outcomes
    public static int playGame(int player, int computer){
        if ((player == 1 && computer == 1) || (player == 2 && computer == 2) ||  (player == 3 && computer == 3)) {
            return 2;
        }else if((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)){
            return 1;
        }else{
            return 0;
        }
    }
    //Here is where the computer chooses
    public static int compChoice () {
        Random computer = new Random();
        return computer.nextInt(2) + 1;


    }

}





