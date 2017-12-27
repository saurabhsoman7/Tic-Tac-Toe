/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;
import java.util.Scanner;
/**
 *
 * @author Saurabh
 */
public class TicTacToeApplication {

    public static void main(String[] args) {
        
        int diff;
        // Getting inputs
        Scanner sc = new Scanner(System.in);
        //Allows for cont. games
        boolean doYouWantToPlay = true;
        
        while (doYouWantToPlay){
            System.out.println("Welcome to Tic Tac Toe. ");
            System.out.println();
            System.out.println("Please select you r dificulty level. "
                    +"If you are a NOOBIE press 1 or if you are a PRO press 2.");
            diff = sc.nextInt();
            System.out.println("Your Symbol will be 'X' ");
            char playerToken = 'X';
            
            System.out.println("I will be 'O'");
            char opponentToken = 'O';
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI(diff);
            
            //set up the game 
            System.out.println();
            System.out.println("Now you can start the game. To play, enter a number and your token shall be put" 
                    + " in its place. The numbers go from 1 to 9, left to right. lets see who wins this round.");
            TicTacToe.printIndexBoard();
            System.out.println();
            
            while(game.gameOver().equals("Not over")) {
                if(game.currentMarker == game.userMarker) {
                    System.out.println("It's your turn! Enter a spot for your turn");
                    int spot = sc.nextInt();
                    while(!game.playTurn(spot)) {
                        System.out.println("Try again! This spot is already"
                                +" taken or it is out of range. ");
                        spot = sc.nextInt();
                    }
                    System.out.println("you picked " + spot + "!");
                    
                } else {
                    System.out.println("It's my turn!");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked " + aiSpot + "!");
                }
                game.printBoard();
            
            }
            System.out.println(game.gameOver());
            System.out.println();
            
            System.out.println("Do you want to play again. Enter Y for YES and N for NO");
            
            char response = sc.next().charAt(0);
            doYouWantToPlay = (response == 'Y' || response == 'y');
            System.out.println();
        }
    }
    
}
