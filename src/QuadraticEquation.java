
public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }




    public double getRoot1() {
        if((Math.pow(this.b, 2) - 4*a*c) >= 0) {
            double r1 =  ((-b) + Math.pow((Math.pow(this.b, 2) - 4*a*c), 0.5)) /(2*a);
            return r1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if((Math.pow(this.b, 2) - 4*a*c) >= 0) {
            double r2 =  ((-b) - Math.pow((Math.pow(this.b, 2) - 4*a*c), 0.5)) /(2*a);
            return r2;
        } else {
            return 0;
        }
    }



}
