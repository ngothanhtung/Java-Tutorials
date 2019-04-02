/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.io.IOException;

/**
 *
 * @author user
 */
public class Quiz {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        /*
        // NHAP LIEU
        Question q;
        for (int i = 1; i <= 4; i++) {
           if (i % 2 == 0) {
                q = new FillInBlankQuestion();                 
           } else {
                q = new OneChoiceQuestion();
           }
           
           q.enterData(i);
        }
        */
        
        // PLAY
        int score = 0;
        Question q;
        for (int i = 1; i <= 4; i++) {
           if (i % 2 == 0) {
                q = new FillInBlankQuestion();                   
           } else {
                q = new OneChoiceQuestion();               
           }
           
           q.loadFromFile(i);
           boolean result = q.play();
           if (result ==  true ) {
               score++;
           }
        }
        
        System.out.println("Game over! Your score: " + score);
    }    
}
