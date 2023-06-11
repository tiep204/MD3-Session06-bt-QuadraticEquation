import ra.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập a:");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập b:");
        double b = sc.nextDouble();
        System.out.println("Mời bạn nhập c:");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if (a==0){
            System.out.println("Mời bạn nhập lại ");
            main(args);
        }
        if (equation.getDiscriminant()<0){
            System.out.println("phương trình bậc 2 vô nghiệm");
        } else if (equation.getDiscriminant()==0) {
            System.out.println("phương trình có 1 nghiệm kép"+ ((-equation.getB())/(2* equation.getA())));
        }else {
            System.out.println("phương trình có 2 nghiêệm");
            System.out.println("Nghiệm 1: "+equation.getRoot1());
            System.out.println("Nghiệm 2:"+equation.getRoot2());
        }
    }
}

