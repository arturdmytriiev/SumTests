package org.example;

public class SumCalculator {
    public int sum(int number)
    {
        int result = 0;
        if(number <= 0)
        {
            throw new IllegalArgumentException();
        }
        for(int i = 1; i <= number; i++)
        {
            result += i;
        }
        return result;
    }
}
