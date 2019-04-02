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
public abstract class Question {

    private String _questionContent;
    
    public void setQuestionContent(String value) {
        this._questionContent = value;
    }

    public String getQuestionContent() {
        return this._questionContent;
    }      

    
    private String _correctOption;

    public String getCorrectOption() {
        return _correctOption;
    }

    public void setCorrectOption(String _correctOption) {
        this._correctOption = _correctOption;
    }
   
    
    public abstract boolean play();

    public abstract void enterData(int index) throws IOException;    
    
    public abstract void loadFromFile(int index) throws IOException;
}
