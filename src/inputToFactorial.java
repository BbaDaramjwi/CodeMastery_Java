/* Exercis: 
    Write a programme that calculates the factorial of a number entered by the user.
    Do not use recursion for this.
*/





import java.util.Scanner;

public class inputToFactorial
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println(); 

        System.out.println("Enter an integer: ");

        int userInput = scanner.nextInt();  
        
        scanner.close();
        
        int factorial = 1;              


        for (int counter = 1; counter < userInput; counter++ )
        {
            factorial = factorial * (counter + 1);

            System.out.println(factorial);
        }     
        
        System.out.println();
    }    
}