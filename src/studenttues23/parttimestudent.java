/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttues23;

/**
 *
 * @author Matth
 */
public class parttimestudent extends StudentTues23{
    private int numOfCourses;

    public parttimestudent(int numOfCourses, String studentID, String studentName) {
        super(studentID, studentName);
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }

    
    
}
