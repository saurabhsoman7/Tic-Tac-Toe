/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Saurabh
 */
public class AI {
    
    protected int difficulty;
    
    public AI (int diff) {
        this.difficulty = diff;
    }
    public int pickSpot(TicTacToe game) {
        
        ArrayList<Integer> choices = new ArrayList();
        for(int i = 0; i < 9; i++) {
            if (game.board[i] == '-'){
                choices.add(i + 1);
            }
        }
        
        int choice = 1;
    
        switch(difficulty){
            case 1: Random rand = new Random();
                    choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
                    break;
            case 2: //Position 1 
                    if(game.board[0] == 'X' && game.board[1] == 'X' && game.board[2] == '-'){
                    return 3;
                    } else if (game.board[0] == 'X' && game.board[3] == 'X' && game.board[6] == '-'){
                        return 7;
                    } else if (game.board[0] == 'X' && game.board[4] == 'X' && game.board[8] == '-'){
                        return 9;
             
                    //Position 2
                    } else if (game.board[1] == 'X' && game.board[4] == 'X' && game.board[7] == '-'){
                        return 8;
        
                    //Position 3
                    } else if (game.board[2] == 'X' && game.board[1] == 'X' && game.board[0] == '-'){
                        return 1;
                    } else if (game.board[2] == 'X' && game.board[4] == 'X' && game.board[6] == '-'){
                        return 7;
                    } else if (game.board[2] == 'X' && game.board[5] == 'X' && game.board[8] == '-'){
                        return 9;
        
                    //Position 4
                    } else if (game.board[3] == 'X' && game.board[6] == 'X' && game.board[0] == '-'){
                        return 1;
                    } else if (game.board[3] == 'X' && game.board[4] == 'X' && game.board[5] == '-'){
                        return 6;
                                
                    //Position 5
                    } else if (game.board[4] == 'X' && game.board[5] == 'X' && game.board[3] == '-'){
                        return 4;
                    } else if (game.board[4] == 'X' && game.board[7] == 'X' && game.board[1] == '-'){
                        return 2;
                                
                    //Position 6
                    } else if (game.board[5] == 'X' && game.board[8] == 'X' && game.board[2] == '-'){
                        return 3;
                    } else if (game.board[5] == 'X' && game.board[4] == 'X' && game.board[3] == '-'){
                        return 4;
                              
                    //Position 7
                    } else if (game.board[6] == 'X' && game.board[4] == 'X' && game.board[2] == '-'){
                        return 3;
                    } else if (game.board[6] == 'X' && game.board[7] == 'X' && game.board[8] == '-'){
                        return 9;
                    } 
                            
                    // Position 8
                      else if (game.board[7] == 'X' && game.board[4] == 'X' && game.board[1] == '-'){
                        return 2;
                    }       
                            
                    //Position 9
                      else if (game.board[8] == 'X' && game.board[5] == 'X' && game.board[2] == '-'){
                        return 3;
                    } else if (game.board[8] == 'X' && game.board[4] == 'X' && game.board[0] == '-'){
                        return 1;
                    } else if (game.board[8] == 'X' && game.board[7] == 'X' && game.board[6] == '-'){
                        return 7;
                    } 
                            
                     else { 
                        Random ran = new Random();
                        choice = choices.get(Math.abs(ran.nextInt() % choices.size()));
                    }   
            break;
        }
        return choice;
    }
    
}
