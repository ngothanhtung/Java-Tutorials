/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ailatrieuphugame;

import java.util.Scanner;

/**
 *
 * @author softech
 */
public class Question {

    /**
     * @return the _questionContent
     */
    public String getQuestionContent() {
        return _questionContent;
    }

    /**
     * @param _questionContent the _questionContent to set
     */
    public void setQuestionContent(String _questionContent) {
        this._questionContent = _questionContent;
    }

    /**
     * @return the _option1
     */
    public String getOption1() {
        return _option1;
    }

    /**
     * @param _option1 the _option1 to set
     */
    public void setOption1(String _option1) {
        this._option1 = _option1;
    }

    /**
     * @return the _option2
     */
    public String getOption2() {
        return _option2;
    }

    /**
     * @param _option2 the _option2 to set
     */
    public void setOption2(String _option2) {
        this._option2 = _option2;
    }

    /**
     * @return the _option3
     */
    public String getOption3() {
        return _option3;
    }

    /**
     * @param _option3 the _option3 to set
     */
    public void setOption3(String _option3) {
        this._option3 = _option3;
    }

    /**
     * @return the _option4
     */
    public String getOption4() {
        return _option4;
    }

    /**
     * @param _option4 the _option4 to set
     */
    public void setOption4(String _option4) {
        this._option4 = _option4;
    }

    /**
     * @return the _correctOption
     */
    public String getCorrectOption() {
        return _correctOption;
    }

    /**
     * @param _correctOption the _correctOption to set
     */
    public void setCorrectOption(String _correctOption) {
        this._correctOption = _correctOption;
    }
    private String _questionContent;
    private String _option1;
    private String _option2;
    private String _option3;
    private String _option4;
    private String _correctOption;
    
    public boolean play() {
        System.out.println(this._questionContent);
        System.out.println("A. " + this._option1);
        System.out.println("B. " + this._option2);
        System.out.println("C. " + this._option3);
        System.out.println("D. " + this._option4);
        
        // Câu trả lời của người chơi
        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String userOption = input.nextLine();
        
        // Kiểm tra đúng / sai
        if (userOption.equalsIgnoreCase(this._correctOption)) {
            System.out.println("You are correct");
            return true;
        }
        else {
            System.out.println("You are wrong");
            return false;
        }
    }
    
}
