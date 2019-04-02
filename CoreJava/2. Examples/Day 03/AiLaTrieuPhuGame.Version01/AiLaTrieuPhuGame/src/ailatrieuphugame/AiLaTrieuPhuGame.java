/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ailatrieuphugame;

/**
 *
 * @author softech
 */
public class AiLaTrieuPhuGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int score = 0;
        for(int i = 1; i<= 5; i++) {
            Question q = new Question();
            System.out.print("Cau " + i + ": ");
            
            q.setQuestionContent("3 x 5 = ?");
            q.setOption1("10");
            q.setOption2("15");
            q.setOption3("20");
            q.setOption4("25");
            q.setCorrectOption("B");

            boolean result = q.play();
            if (result == true) {
                score = score + 100;
            } else {
                break;
            }
        }
        
        System.out.println("Your score: " + score);
    }
    
}
