/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayspractise2;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class ArraysPractise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner(System.in);
         
         String[]names= new String [10];
         
         System.out.println("Pleas enter the names of ten friends");
         
         for(int i=0;i<=9;i=i+1){
             names[i]=keyedInput.nextLine();
         }
         
         System.out.println("the forth and seventh names listed were");
         System.out.println("Forth:"+names[4]);
         System.out.println("Seventh:"+names[7]);
         
         String[]names2=new String[5];
         
         System.out.println("pleas enter five more friends");
         for(int i=0;i<=4;i++){
             names2[i]=keyedInput.nextLine();
         }
         System.out.println("the second,third,and fourth frieds enterd are");
         System.out.println("Second:"+names2[2]);
         System.out.println("third:"+names2[3]);
         System.out.println("fouth:"+names2[4]);
    }
    
}
