package it.app2ed;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int number = 1000;
        System.out.println(fibonacciSequence(number));
    }
    static BigInteger fibonacciSequence(int number)
    {
        BigInteger value1 = BigInteger.valueOf(0);
        BigInteger value2 = BigInteger.valueOf(1);
        BigInteger value3 = BigInteger.valueOf(1);
        for (int i =2 ; i <= number ; i ++)
        {
            value3 =  value1.add(value2);
            value1 = value2;
            value2 = value3;
        }
        return (value1);
    }
}
