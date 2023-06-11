package ra;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        //delta = b2-4ac;
        double delta = Math.pow(b,2)-4*a*c;
        return delta;
    }
    public double getRoot1(){
        double haia = 2*a;
        double tu = -b+Math.pow(Math.pow(b,2)-4*a*c,0.5);
        return tu/haia;
    }
    public double getRoot2(){
        double haia = 2*a;
        double tu = -b-Math.pow(Math.pow(b,2)-4*a*c,0.5);
        return tu/haia;
    }
}
