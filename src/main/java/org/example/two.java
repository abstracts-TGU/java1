package org.example;

public class two {
    private double x;
    private double y;

    two(double n) {
        x = n;
        y = resolve(x);
    }

    double resolve(double x){
        if (x<=8)
            return Math.acos(Math.exp(-Math.abs(x)));
        else if (x<9)
            return Math.cos(Math.pow(x,5)/(7+x*x));
        else
            return Math.pow(x,8)+Math.pow(x,x-10);
    }
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}
