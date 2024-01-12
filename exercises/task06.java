/* Exercis: 
    Write a programme that determines the computer equipment of an employee.
    If an employee has been with the company for less than three years and is a programmer, they will be provided with a 486 PC.
    If an employee has been with the company for less than three years and is not a programmer, they will be given a 386 PC.
    If an employee has been with the company for more than three years and is a programmer, they will receive a Pentium PC.
    All other employees will get a MAC.
*/


package CodeMastery_JAVA.exercises;

import java.util.Scanner;

public class task06
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many years have you been with the company? ");
        int inCompany = scanner.nextInt();
        
        System.out.print("Are you a programmer? (j/n) ");
        String programmer = scanner.next();

        String computerEquipment;

        if (inCompany < 3) 
        {
            if (programmer.equalsIgnoreCase("j")) 
            {
                computerEquipment = "486er PC";
            } 
            else 
            {
                computerEquipment = "386er PC";
            }
        } 
        else 
        {
            if (programmer.equalsIgnoreCase("j")) 
            {
                computerEquipment = "Pentium-PC";
            } 
            else 
            {
                computerEquipment = "MAC";
            }
        }

        System.out.println("You will receive the computer equipment: " + computerEquipment);
        System.out.println();
         
    }
}