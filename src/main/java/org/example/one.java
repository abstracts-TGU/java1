package org.example;

public class one {
    private double x;
    private double y;
    public double myLog (double a, double b){
        return Math.log(a) / Math.log(b);
    }
    one(double num){
        x = num;
        y = resolveY();
    }
    public double resolveY(){

        return Math.pow(Math.acos(Math.pow(x,1/5)/(Math.pow(x,1/5)+1)),9) +
                Math.pow(myLog(Math.pow(4,Math.tan(3*x))+Math.sqrt(Math.abs(3*x-1))+Math.pow(Math.abs(x),Math.sin(2*x)),5),2)
                ;
    }
    public boolean ifYItInD(double r) {
        if (Math.pow(x,2) + Math.pow(y,2) <= Math.pow(r,2) && (y<0))
            return true;
        else
            return false;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
