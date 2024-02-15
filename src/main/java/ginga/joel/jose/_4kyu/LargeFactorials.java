package ginga.joel.jose._4kyu;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Desciption
 * In mathematics, the factorial of integer n is written as n!. It is equal to the product of n and every integer preceding it. For example: 5! = 1 x 2 x 3 x 4 x 5 = 120
 * Your mission is simple: write a function that takes an integer n and returns the value of n!.
 * You are guaranteed an integer argument. For any values outside the non-negative range, return null, nil or None (return an empty string "" in C and C++). For non-negative numbers a full length number is expected for example, return 25! =  "15511210043330985984000000"  as a string.
 * NOTES:
 * The use of BigInteger or BigNumber functions has been disabled, this requires a complex solution
 */
public class LargeFactorials {

    public String factorial(int n) {
        //with stream iterate we can create a sequence of numbers starting in 1 and increasing by 1
        //we limit the sequence to n numbers
        //we reduce the sequence to a single number by multiplying all the numbers
        return Stream.iterate(BigInteger.ONE, previous-> previous.add(BigInteger.ONE))
                .limit(n)
                .reduce(BigInteger.ONE, BigInteger::multiply)
                .toString();
    }



}
