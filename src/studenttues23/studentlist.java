/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studenttues23;

/**
 *
 * @author Matth
 */
public class studentlist {
    public static void main(String[] args){
        
    
        StudentTues23[] studentList = new StudentTues23[3];
        studentList[0] = new StudentTues23("s1", "matt");
        studentList[1] = new StudentTues23("s2", "joe");
        studentList[2] = new StudentTues23("s3", "rogan");
        
        for(int i = 0; i<studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
        
        
    }//end of main
}//end of class
