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
public class Question {

    private String _questionContent;
    private String _option1;
    private String _option2;
    private String _option3;
    private String _option4;
    private String _correctOption;

    public void setQuestionContent(String value) {
        this._questionContent = value;
    }

    public String getQuestionContent() {
        return this._questionContent;
    }

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

    public String getCorrectOption() {
        return _correctOption;
    }

    public void setCorrectOption(String _correctOption) {
        this._correctOption = _correctOption;
    }           
        
    // Nhap du lieu tu ban phim, luu thong tin nhap duoc vao cac thuoc tinh cua doi tuong Question
    public void enter(int index) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        // Khai bao doi tuong in de dap ung thao tac nhap lieu tu ban phim
        // Lưu ý: method nextLine() la nhan du lieu tu ban phim sau khi an ENTER
        Scanner in = new Scanner(System.in);
        
        // Nhap noi dung cau hoi
        System.out.print("Enter question content: ");
        this.setQuestionContent(in.nextLine());
        
        // Nhap cac phuong an tra loi
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

        this.writeToFile(index);
    }
    
    // Ghi noi dung cac thuoc tinh cua doi tuong Question ra FILE
    public void writeToFile(int index) throws IOException {
        
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
    
    public void readFromFile(int index) throws IOException {
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
       
    public boolean play() {
        // Hien thi noi dung cau hoi
        System.out.println(this.getQuestionContent());
        
        // Hien thi cac phuong an tra loi
        System.out.println("A: " + this.getOption1());
        System.out.println("B: " + this.getOption2());
        System.out.println("C: " + this.getOption3());
        System.out.println("D: " + this.getOption4());        
        
        // Moi nguoi dung nhap cau tra loi
        Scanner in = new Scanner(System.in);
        System.out.print("==> Your answer: "); 
        String userOption = in.nextLine();
        
        // Kiem tra DUNG / SAI
        if (userOption.equalsIgnoreCase(this.getCorrectOption())) {
            System.out.println("Congratulations! You are correct."); 
            System.out.println("=============================================");
            System.out.println("");
            return true;
        } 
        else {
            System.out.println("Sorry! You are wrong."); 
            System.out.println("Correct option: " + this.getCorrectOption());
            System.out.println("=============================================");
            System.out.println("");
            return false;
        }
    }    
}
