/*
 ********************************
 * Hunter Ylescupidez
 * AP CS A
 * Period 1
 * December 6th, 2018
 * Project #4 - Roll Dice
 ********************************
 */
import java.util.Scanner;
import java.util.Random;
public class RolldDice {
    private static final int DICENUM = 1;
    public static void main (String [] args){
        Scanner user = new Scanner(System.in);
        int playagain = 1;

        while(playagain == 1){
            defineDice();
            rollDice();
            printDice();
            drawLine();

            System.out.println("Would you like to play again? Yes(1) or No(0)?");
            playagain = user.nextInt();
        }

        System.out.println("Thank you for playing");

    }
    //so this is where dice are printed
    public static void defineDice(){
        System.out.println("This is the defineDice method");
        String dice [][] = new String [6][5];
        String gameDice[][] = new String [DICENUM][5];

        for(int i = 0; i < 6; i++){
            dice [i][0] = " ------- ";
            dice [i][4] = " ------- ";
        }
        for(int j = 3; j < 6; j++){
            dice [j][1] = "|  * *  |";
            dice [j][3] = "|  * *  |";
        }
        for(int k = 0; k < 2; k++){
            dice [k][1] = "|  * *  |";
            dice [k][3] = "|  * *  |";
        }
        dice[2][1] =      "| *     |";
        dice[2][3] =      "|     * |";
        for (int i = 0; i < 6; i += 2){
            dice[i][2] =  "|   *   |";
        }
        dice[1][2] = "|  * *  |";
        dice[1][2] = "|  * *  |";
        dice[3][2] = "|       |";

        for (int i =0; i < 5; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(dice[i][j]);
            }
        }

    }
    //this is where you roll the dice
    public static void rollDice(){
        System.out.println("This is the rollDice");
        //Random number = new Random();



    }
    //this is where the dice should be printed
    public static void printDice(){
        //return

    }
    //this is where the line is drawn. and you crossed it.
    public static void drawLine(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

}
