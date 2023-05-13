package org.fasttrackit.course15.homework.recursivity;

public class RecursiveEx {
    public static void main(String[] args) {
        //sum of first n integer numbers
        int n = 75;
        int sum = sumOfIntegerNumbers(n);
        System.out.println("Sum to all numbers up to " + n + " is: " + sum);

        //sum of first n EVEN integer numbers
        int even = 10;
        int sumOfEven = sumOfEvenNumbers(even);
        System.out.println("The sum of even numbers up to " + even + " is " + sumOfEven);

        //Palindrome: a word that reads the same backwards as forwards,
        String word1 = "radar";
        String word2 = "computer";
        boolean check1 = reversedString(word1);
        boolean check2 = reversedString(word2);
        System.out.println("word " + word1 + " is palindrome: " + check1);
        System.out.println("word " + word2 + " is palindrome: " + check2);

        //sum of digits of a number
        int num1 = 12345;
        int num2 = 9876;

        int sum1 = calculateSumOfDigits(num1);
        int sum2 = calculateSumOfDigits(num2);

        System.out.println("Sum of digits for number " + num1 + ": " + sum1);
        System.out.println("Sum of digits for number " + num2 + ": " + sum2);

        // fibonacci array:
        int nFib = 10;
        int fibVal = fibonacci(10);
        System.out.println("the value at index " + nFib + " in Fibonaci array is: " + fibVal);


    }

    //sum of first n integer numbers
    public static int sumOfIntegerNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfIntegerNumbers(n - 1);
        }
    }

    //sum of first n EVEN integers
    public static int sumOfEvenNumbers(int even) {
        int sum = 0, num = 1, count = 0;
        while (count < even) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
            num++;
        }
        return sum;
    }

    //Palindrome: a word that reads the same backwards as forwards,
    public static boolean reversedString(String palindrome) {
        if (palindrome.length() <= 1) {
            return true;
        } else {
            return palindrome.charAt(0) == palindrome.charAt(palindrome.length() - 1)
                    && reversedString(palindrome.substring(1, palindrome.length() - 1));
        }
    }

    //sum of digits for a number
    public static int calculateSumOfDigits(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDigit = num % 10;
            int remainingNumber = num / 10;
            return lastDigit + calculateSumOfDigits(remainingNumber);
        }
    }

    // fibonacci array:
    public static int fibonacci(int nFib) {
        if (nFib == 0) {
            return 0;
        } else if (nFib == 1) {
            return 1;
        } else {
            return fibonacci(nFib - 1) + fibonacci(nFib - 2);
        }
    }
}


