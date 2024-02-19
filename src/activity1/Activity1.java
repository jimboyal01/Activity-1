/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Activity1 {

    //Jimboy Ralph T. Allanic
    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
       
        System.out.println("Enter Name?");
        String fName = scn.nextLine();
        
        System.out.println("Enter your Middle Name: ");
        String mName = scn.nextLine();
        
        System.out.println("Enter your Sur Name: ");
        String sName = scn.nextLine();
        
        System.out.println("Enter your Age: ");
        String age = scn.nextLine();
            
                System.out.println(" Your Data: " + fName + " " + mName + " " + sName + " " +  age + " Years Old");
                scn.close();
    }
    
}
