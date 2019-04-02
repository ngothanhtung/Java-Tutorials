/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabaitap1;

/**
 *
 * @author softech
 */
public class Student {
    private String _name;
    private int _age;
    private float _mark1;
    private float _mark2;
    private float _mark3;
    
    public Student() {
        System.out.println("Constructor start");
    }
    
    public Student(String name) {
        this._name = name;
    }
    
    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _age
     */
    public int getAge() {
        return _age;
    }

    /**
     * @param _age the _age to set
     */
    public void setAge(int _age) {
        this._age = _age;
    }

    public void setMark1(float value) throws Exception {
        if (value < 0 || value > 10) {            
            throw new Exception("Value must be between 0 and 10");
        }
        _mark1 = value;
    }
    
    public float getMark1() {
        return _mark1;
    }
    
    
    /**
     * @return the _mark2
     */
    public float getMark2() {
        return _mark2;
    }

    /**
     * @param _mark2 the _mark2 to set
     */
    public void setMark2(float _mark2) {
        this._mark2 = _mark2;
    }

    /**
     * @return the _mark3
     */
    public float getMark3() {
        return _mark3;
    }

    /**
     * @param _mark3 the _mark3 to set
     */
    public void setMark3(float _mark3) {
        this._mark3 = _mark3;
    }
    
    public void display() {
        System.out.println("Ho va ten: " + this._name);
        System.out.println("Tuoi: " + this._age);
        System.out.println("Diem mon 1: " + this._mark1);
        System.out.println("Diem mon 2: " + this._mark2);
        System.out.println("Diem mon 3: " + this._mark3);
        
        float averageMark = getAverageMark();        
        System.out.println("Diem trung binh: " + averageMark);
        
        String level = getLevel();
        System.out.println("Xep loai: " + level);
        
    }
    
    public float getAverageMark() {
        float averageMark = (this._mark1 + this._mark2 + this._mark3) / 3;
        return averageMark;
    }
    
    public String getLevel() {
        float averageMark = getAverageMark();
        
        if (averageMark >= 9) {
                return "Xuat sac";
            } else if (averageMark >= 8) {
                return "Gioi";
            } else if (averageMark >= 6.5) {
                return "Kha";
            } else if (averageMark >= 5) {
                return "Trung binh";
            } else {
                return "Yeu, Kem";
        }
    }
    
    
    
}
