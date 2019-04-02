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
        
//        File file = new File("1.txt");
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file);
//            writer.write("test");
//        } catch (IOException e) {
//            e.printStackTrace(); // I'd rather declare method with throws IOException and omit this catch.
//        } finally {
//            if (writer != null) try { writer.close(); } catch (IOException ignore) {}
//        }
//        System.out.printf("File is located at %s%n", file.getAbsolutePath());
        
        
        for (int i = 1; i <= 1; i++) {
            Question q = new OneChoiceQuestion();
            q.enterData(i);            
        }

//        Game game = new Game();
//        game.registerPlayer();
//        game.loadData();
//        game.play();
        
    }    
}
