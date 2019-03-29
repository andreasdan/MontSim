package com.kea;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        PiEstimator estimator = new PiEstimator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estimate Pi with randomly generated (x,y) points.");
        System.out.print("How many times to iterate? > ");

        //read input until a valid int is given
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Not a valid input...");
            System.out.print("How many times to iterate? > ");
        }

        int iterations = scanner.nextInt();

        //estimate pi with user given iteration count and compare it to the real pi value
        System.out.println("Approximate value of Pi ≈ " + estimator.estimatePi(iterations));
        System.out.println("Real value of pi = " + Math.PI);
    }
}
