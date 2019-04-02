/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OneChoiceQuestion extends Question {
    
    private String _option1;
    private String _option2;
    private String _option3;
    private String _option4;   

    public String getOption1() {
        return _option1;
    }

    public void setOption1(String _option1) {
        this._option1 = _option1;
    }

    public String getOption2() {
        return _option2;
    }

    public void setOption2(String _option2) {
        this._option2 = _option2;
    }

    public String getOption3() {
        return _option3;
    }

    public void setOption3(String _option3) {
        this._option3 = _option3;
    }

    public String getOption4() {
        return _option4;
    }

    public void setOption4(String _option4) {
        this._option4 = _option4;
    }
  
    /**
     *
     * @param index
     * @throws IOException
     */
    @Override
    public void enterData(int index) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter question content: ");
        this.setQuestionContent(in.nextLine());

        System.out.print("Enter option A: ");
        this.setOption1(in.nextLine());

        System.out.print("Enter option B: ");
        this.setOption2(in.nextLine());

        System.out.print("Enter option C: ");
        this.setOption3(in.nextLine());

        System.out.print("Enter option D: ");
        this.setOption4(in.nextLine());

        System.out.print("Correct option ");
        this.setCorrectOption(in.nextLine());

        String fileName = index + ".txt";
        try (FileWriter file = new FileWriter(fileName); BufferedWriter writer = new BufferedWriter(file)) {

            writer.write(this.getQuestionContent());
            writer.newLine();

            writer.write(this.getOption1());
            writer.newLine();

            writer.write(this.getOption2());
            writer.newLine();

            writer.write(this.getOption3());
            writer.newLine();

            writer.write(this.getOption4());
            writer.newLine();

            writer.write(this.getCorrectOption());
            writer.newLine();
        }
    }
    
    @Override
    public void loadFromFile(int index) throws IOException {
        String fileName = index + ".txt";
        try (FileReader file = new FileReader(fileName); BufferedReader reader = new BufferedReader(file)) {

            this.setQuestionContent(reader.readLine());

            this.setOption1(reader.readLine());

            this.setOption2(reader.readLine());

            this.setOption3(reader.readLine());

            this.setOption4(reader.readLine());

            this.setCorrectOption(reader.readLine());
        }
    }
    
    /**
     * Hien thi noi dung cau hoi
     * @return 
     */
    @Override
    public boolean play() {
        
        System.out.println(this.getQuestionContent());
        System.out.println("A: " + this.getOption1());
        System.out.println("B: " + this.getOption2());
        System.out.println("C: " + this.getOption3());
        System.out.println("D: " + this.getOption4());        
        System.out.println("------------------------------");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Your answer: "); 
        String userAnswer = in.nextLine();
        
        if (this.getCorrectOption().equals(userAnswer)) {
            System.out.println("Congratulations! You are correct."); 
            System.out.println("=============================================");
            return true;
        } 
        else {
            System.out.println("Sorry! You are wrong."); 
            System.out.println("Correct option: " + this.getCorrectOption());
            System.out.println("=============================================");
            return false;
        }
    }   
}
