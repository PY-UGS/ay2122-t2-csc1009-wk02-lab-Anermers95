package lab02;

import java.util.Scanner;

public class lab02Main{

    public static void main(String[] args)
    {
        double[] inputNumbers = new double[3];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter byte Value: ");
        byte byteValue = input.nextByte();

        System.out.print("Enter short Value: ");
        short shortValue = input.nextShort();

        System.out.print("Enter int Value: ");
        int  intValue = input.nextInt();

        System.out.print("Enter long Value: ");
        long longValue = input.nextLong();

        System.out.print("Enter float Value: ");
        float floatValue = input.nextFloat();

        System.out.printf("\nbyte: %d, shortValue: %d, intValue: %d, longValue: %d, floatValue: %.3f",
        byteValue,shortValue,intValue,longValue,floatValue);

        //QUESTION 1
        System.out.println("QN1 Enter a double Value: ");
        Q1Circle circle = new Q1Circle(input.nextDouble());
        circle.printArea();

        //QUESTION 2
        System.out.println("\nQ2\nEnter a three numbers:");
        
        for(int i = 0; i <3; ++i)
        {
            inputNumbers[i] = input.nextDouble();
        }
        Q2Average average = new Q2Average(inputNumbers);
        average.printAverage();

        //QUESTION 3
        System.out.printf("\nQ3");
        Q3Time time = new Q3Time();
        time.printTime();

        //QUESTION 4
        System.out.printf("\nQ4");
        System.out.println("\nEnter a year: ");
        Q4Zodiac zodiac = new Q4Zodiac(input.nextInt());
        zodiac.printZodiac();

        //close scanner
        input.close();
    }
}