package lab02;

import java.util.Arrays;

public class Q2Average {

    double average;
    String formatArray;
    Q2Average()
    {
        average = 0;
    }

    Q2Average(double[] inputs)
    {
        sum(inputs);
    }

    void sum(double[] inputs)
    {
        for(int i =0; i < inputs.length; ++i)
        {
            average += inputs[i];
        }
        average = average/inputs.length;
        formatArray(inputs);
    }

    void formatArray(double[] inputs)
    {
         formatArray = Arrays.toString(inputs)
        .replace("[","")
        .replace(",","")
        .replace("]","");
    }

    void printAverage()
    {
        System.out.printf("The average of:" + formatArray + " is " + average);
    }
    
}
