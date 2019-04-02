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
    public String Name;
    public int Age;
    public float Mark1;
    public float Mark2;
    public float Mark3;
    
    public Student() {
        System.out.println("Constructor start");
    }
    
    public Student(String name) {
        Name = name;
    }
    
    public void display() {
        System.out.println("Ho va ten: " + Name);
        System.out.println("Tuoi: " + Age);
        System.out.println("Diem mon 1: " + Mark1);
        System.out.println("Diem mon 2: " + Mark2);
        System.out.println("Diem mon 3: " + Mark3);
        
        float averageMark = getAverageMark();        
        System.out.println("Diem trung binh: " + averageMark);
        
        String level = getLevel();
        System.out.println("Xep loai: " + level);
        
    }
    
    public float getAverageMark() {
        float averageMark = (Mark1 + Mark2 + Mark3) / 3;
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
