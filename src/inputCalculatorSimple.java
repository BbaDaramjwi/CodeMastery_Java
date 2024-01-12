/* Exercis: 
    Write a simple calculator for the console with which you can calculate
    the basic arithmetic operations as well as the factorial and potencies.
    The operands and operators should be read in from the keyboard.
*/




import java.util.Scanner;

public class inputCalculatorSimple
{
    public static void main(String[] args)
    {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first operand (integer): ");
        double a = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Please enter the operator (+, -, *, /, % (modulo), ^ (potency) ) : ");
        char operator = scanner.next().charAt(0);

        System.out.println("Please enter the second operand (integer):");
        double b = scanner.nextDouble();

        scanner.close();

        double result;

        switch (operator) 
        {
            case '+':
                result = addition(a, b);
                break;

            case '-':
                result = subtraction(a, b);
                break;

            case '*':
                result = multiply(a, b);
                break;

            case '/':
                result = division(a, b);
                break;

            case '%':
                result = modulo(a, b);
                break;

            case '^':
                result = potency(a, b);
                break;

            default:
                System.out.println("Invalid operator!");
                System.out.println(); 
                return;
        }

        System.out.println("\nResult: \n" + a + " " + operator + " " + b + " = " + result);
        System.out.println(); 
    }


    public static double addition(double a, double b) 
    {
        return a + b;
    }


    public static double subtraction(double a, double b) 
    {
        return a - b;
    }


    public static double multiply(double a, double b) 
    {
        return a * b;
    }


    public static double division(double a, double b) 
    {
        if (b == 0) 
        {
            System.out.println("Division by zero is not possible!");
            System.out.println(); 
            return 0;
        }
        return a / b;
    }


    public static double modulo(double a, double b) 
    {
        if (b == 0) 
        {
            System.out.println("Modulo by zero is not possible!");
            System.out.println(); 
            return 0;
        }

        return a % b;
    }


    public static double potency(double a, double b) 
    {
        return Math.pow(a, b);
    }
         
    
}