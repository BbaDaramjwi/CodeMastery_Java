/* Exercis: 
    Write a programme that reads in numbers from the keyboard until the user enters a zero.
    Form the sum and mean value from the numbers read in and display the sum and mean value on the screen.
*/





package exercises;

import java.util.Scanner;
import java.util.Arrays;



public class task01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(); 
       
        System.out.println("You can enter numbers until you enter the number 0 \n"); 

        int[] inputs = new int[0];                                         


        do
        {
            System.out.println("Please enter an integer: ");
            int userInput = scanner.nextInt();                               
       
            if (userInput != 0)
            {
                int[] cache = Arrays.copyOf ( inputs, inputs.length + 1 );     

                cache [ cache.length - 1 ] = userInput;

                inputs = cache;
            }
            else
            {
                System.out.println("\nNow that you have entered 0, let me evaluate your entries:");
                break;
            }
        }
        while (true);


        int sum = 0;
        
        for (int element = 0; element < inputs.length; element++)
        {
            sum += inputs[element]; 
        }

        int avg = sum / inputs.length;
        
        System.out.println("\n");
        System.out.println("Sum of all entered numbers: \t"  + sum);
        System.out.println("Average value of all entered numbers: \t" + avg);
        System.out.println("\n");

    }
}