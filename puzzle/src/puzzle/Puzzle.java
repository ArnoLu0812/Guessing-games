/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lu-l98
 */
public class Puzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int r = rand.nextInt(128) + 1;    
        
        int n=0;
        while(r!=n){
        System.out.println("Please enter the number");
        
        n = input.nextInt();
        
        if(r>n){
        System.out.println("The number is too small, try a larger number");}
        if(r<n){
        System.out.println("The number is too large, try a smaller number"); } 
        
        }
        
        System.out.println("Congratulations");
        
        
       
        
    
    
    }
    
}

    
    

