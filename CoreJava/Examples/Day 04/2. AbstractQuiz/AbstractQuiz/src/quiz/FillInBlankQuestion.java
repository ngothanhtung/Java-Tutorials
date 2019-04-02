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
 * @author TUNGNT
 */
public class FillInBlankQuestion extends Question {

    @Override
    public boolean play() {
        System.out.println(this.getQuestionContent());

        Scanner in = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = in.nextLine();

        
        if (this.getCorrectOption().equals(userAnswer)) {
            System.out.println("Congratulations! You are correct.");
            System.out.println("=============================================");
            return true;
        } else {
            System.out.println("Sorry! You are wrong.");
            System.out.println("Correct option: " + this.getCorrectOption());
            System.out.println("=============================================");
            return false;
        }
    }

    @Override
    public void enterData(int index) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter question content: ");
        this.setQuestionContent(in.nextLine());

        System.out.print("Correct option ");
        this.setCorrectOption(in.nextLine());

        String fileName = index + ".txt";
        try (FileWriter file = new FileWriter(fileName); BufferedWriter writer = new BufferedWriter(file)) {

            writer.write(this.getQuestionContent());
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

            this.setCorrectOption(reader.readLine());
        }
    }
}
