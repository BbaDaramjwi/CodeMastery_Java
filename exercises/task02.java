/* Exercis: 
    Write a programme that calculates the factorial of a number entered by the user.
    Do not use recursion for this.
*/





package CodeMastery_JAVA.exercises;

import java.util.Scanner;

public class task02
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println(); 

        System.out.println("Enter an integer: ");

        int userInput = scanner.nextInt();            
        
        int factorial = 1;              


        for (int counter = 1; counter < userInput; counter++ )
        {
            factorial = factorial * (counter + 1);

            System.out.println(factorial);
        }     
        
        System.out.println();
    }    
}