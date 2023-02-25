import java.io.*;
import java.util.Scanner;

public class Main {
    static boolean isNeon(long num){

        long sq = num * num;

        long sumOfDigits = 0;

        while (sq != 0){
            sumOfDigits += sq % 10;
            sq /= 10;
        }
        return (sumOfDigits == num);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        long lowerLimit = sc.nextLong();

        System.out.println("Enter higher limit: ");
        long higherLimit = sc.nextLong();


        System.out.print("Neon Numbers between " + lowerLimit + " and " + higherLimit + " are: ");

        for (long i = lowerLimit; i <= higherLimit; i++)
            if (isNeon(i))
                System.out.print(i+" ");
    }
}