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
public interface IQuestion {
    public boolean checkCorrect(String userOption);    
    public boolean display();
    public void enterData(int index) throws IOException;
}
