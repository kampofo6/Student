/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kojo
 */
public class PartTimeStudent extends Student {
    
    private int numOfcourse;

    public int getNumOfcourse() {
        return numOfcourse;
    }

    public void setNumOfcourse(int numOfcourse) {
        this.numOfcourse = numOfcourse;
    }

    public PartTimeStudent(int numOfcourse, String studentId, String studentName) {
        super(studentId, studentName);
        this.numOfcourse = numOfcourse;
    }
    
    
    
    
}
