/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.IOException;

/**
 *
 * @author TUNGNT
 */
public abstract class Question implements IQuestion {

    private String _questionContent;
    
     public void setQuestionContent(String value) {
        this._questionContent = value;
    }

    public String getQuestionContent() {
        return this._questionContent;
    }
    
    @Override
    public abstract boolean checkCorrect(String userOption);

    @Override
    public abstract boolean display();

    @Override
    public abstract void enterData(int index) throws IOException;        
}
