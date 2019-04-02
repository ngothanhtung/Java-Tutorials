/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Game {

    private final Player _player;
    private final ArrayList<OneChoiceQuestion> _questions;
    private final int _maxQuestionCount;
    private int _questionIndex;
    private int _score;
      
    public Game() {
    
        this._player = new Player();
        this._questionIndex = 1;
        this._questions = new ArrayList<>();
        this._maxQuestionCount = 5;
        this._score = 0;
    }
    
    /*
    * Khoi tao cac thong tin cho tro choi
    */
    public void loadData() throws IOException {
        // Nap cac cau hoi. Gia su o day co khoang 5 cau hoi
        for (int i = 1; i <= this._maxQuestionCount; i++) {
            OneChoiceQuestion q = new OneChoiceQuestion();
            q.loadFromFile(i);
            // Sau khi nap noi dung tu file xong thi them vao mang.
            this._questions.add(q);
        }
    }   
    
    public void registerPlayer() {
        System.out.print("Enter player name: ");
        Scanner in = new Scanner(System.in);
        
        this._player.setName(in.nextLine());
    }
    
    public void play() {
        for (int i = 0; i < this._maxQuestionCount; i++) {
            OneChoiceQuestion currentQuestion = this._questions.get(i);
            System.out.println("Question " + this._questionIndex);
            boolean isCorrect = currentQuestion.display();
            if (isCorrect) {
                this._score++;
            }
            this._questionIndex++;            
        }
        
        System.out.println("GAME OVER!");
        System.out.format("YOUR SCORE: %d\n", this._score);
    }           
}
