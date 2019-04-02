/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author user
 */
public class Player {
    private String _name;
    private float _highestScore;
    
    public void display() {
    
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public float getHighestScore() {
        return _highestScore;
    }

    public void setHighestScore(float _highestScore) {
        this._highestScore = _highestScore;
    }
}
