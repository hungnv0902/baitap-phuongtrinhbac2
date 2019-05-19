import java.util.Scanner;
public class phuongtrinhbac2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua a,b,c :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.getRoot1();
        quadraticEquation.getRoot2();
        System.out.println("r1 = " + quadraticEquation.getRoot1());
        System.out.println("r2 = " + quadraticEquation.getRoot2());


    }
}
