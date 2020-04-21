package javaproject.pkg1;
import java.util.*;
public class PascalsTriangle {
    int number;
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter a number between 1 and 9");
    number = input.nextInt();
    for (int i=0;i<number;i++)
    {
        for (int j=i;j<number;j++)
        {
        System.out.print(" ");
        }
        for (int m=0;m<=i;m++)
        {
            System.out.print(m+1);
        }
        for (int n=1;n<=i;n++)
        {
            System.out.print(number-n);
        }
    }
}
