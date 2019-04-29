package com.kea;

public class PiEstimator
{
    public double estimatePi(int iterations)
    {
        // counter of points plotted inside the circle
        int pointsInsideCircle = 0;

        // iterate
        for (int i = 0; i < iterations; i++) {

            //generate random points between 0-1
            double x = getRandomDouble(0, 1);
            double y = getRandomDouble(0, 1);

            //formula to determine if the point fall within the circle
            if (x*x + y*y <= 1) {
                pointsInsideCircle++;
            }
        }

        // cast the first operation as double to avoid .0 result
        return (double)(4 * pointsInsideCircle) / iterations;
    }

    // returns a double with a range of [lowRange, highRange]
    private double getRandomDouble(int lowRange, int highRange)
    {
        double rand = Math.random()/Math.nextDown(1.0);
        return lowRange*(1.0 - rand) + highRange*rand;
    }
}
