package com.kea;

public class PiEstimator
{
    public double estimatePi(int iterations)
    {
        // points plotted inside and outside the circle
        int pointsInsideCircle = 0;
        int pointsOutsideCircle = 0;

        // iterate
        for (int i = 0; i < iterations; i++) {

            //generate random points between 0-1
            double x = Math.random();
            double y = Math.random();

            //formula to determine if the point fall within the circle
            if (x*x + y*y <= 1) {
                pointsInsideCircle++;
            }

            //the point ALWAYS falls within the square
            pointsOutsideCircle++;
        }

        // cast the first operation as double to avoid .0 result
        return (double)(4 * pointsInsideCircle) / pointsOutsideCircle;
    }
}
