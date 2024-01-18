/* Exercis: 
    Output the numbers 1 - 100 in a table look:
    1   2   3   4   5   6   7   8   9  10
	11  12  13  14   15  16  17  18  19  20
	21  22  23  24   25  26  27  28  29  30
*/



public class numbersInTableLook
{
    public static void main(String[] args)
    {
        System.out.println();

        for (int i = 1; i <= 100; i++)
        {                
            System.out.printf("%4d", i);
            if (i % 10 == 0)
            {                    
                System.out.println();
            }
        }

        System.out.println();    
    }
}