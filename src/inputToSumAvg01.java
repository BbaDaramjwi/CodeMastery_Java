/* Exercis: 
    Write a programme that reads in numbers from the keyboard until the user enters a zero.
    Form the sum and mean value from the numbers read in and display the sum and mean value on the screen.
    NO ARRAY!
*/




import java.util.Scanner;

public class inputToSumAvg01
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        System.out.println("You can enter numbers (integer) until you enter the number 0 \n"); 


        do
        {
            System.out.println("Please enter an integer: ");

            int userInput = scanner.nextInt(); 

            if (userInput !=0)
            {
                sum = sum + userInput;
                counter ++;            
            }
            else
            {
                double avg = sum / counter;

                System.out.println("\nNow that you have entered 0, let me evaluate your entries: \n");             

                System.out.println("Sum of all entered numbers: \t"  + sum);
                System.out.println("Average value of all entered numbers: \t" + avg + "\n");

                break;
            }        
        }      
        while (true);  

        scanner.close();

    } 
}