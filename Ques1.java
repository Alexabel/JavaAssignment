package ques1; 
import java.util.Scanner;
//importing scanner(object)


public class Ques1 {
    
      public static void main(String[] args) {
          System.out.println("Enter a number");
          //telling user to enter a number
          Scanner x = new Scanner(System.in);
                  int no = x.nextInt(); 
          //declaring where the int is to be stored
            if((no%2) == 0){System.out.println("this num is even");
                            //making the if statement
            }
            else{System.out.println("this number is odd");}
      }
      
    
}
