/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkmarks;

import java.util.Scanner;

/**
 *
 * @author Udofia
 */
public class CheckMarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Student's Score: ");
        int totalMarks = input.nextInt();
        
        if (totalMarks >= 90){
        System.out.println("Grade = A+");
    } else if (totalMarks >= 60){
        System.out.println("Grade = A");
    } else if (totalMarks >= 50){
        System.out.println("Grade = B");
    } else if (totalMarks >= 40) {
    System.out.println("Grade = C");
    } else {
        System.out.println("FAIL");
    }
        
    }
    
}
