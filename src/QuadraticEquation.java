import java.util.InputMismatchException;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        boolean valid_a = false;
        while(!valid_a){
            try{
                System.out.print("Enter a: ");
                a = in.nextDouble();
                if (a == 0){
                    System.out.println("VALUE CANNOT BE 0, PLEASE TRY AGAIN.");
                }
                else{
                    valid_a = true;
                }
            }
            catch (InputMismatchException e){
                in.next();
                System.out.println("INVALID INPUT, PLEASE TRY AGAIN");
            }
       }

        double b = 0.0;
        boolean valid_b = false;
        while(!valid_b){
            try{
                System.out.print("Enter b: ");
                b = in.nextDouble();
                if (b == 0){
                    System.out.println("VALUE CANNOT BE 0, PLEASE TRY AGAIN");
                }
                else{
                    valid_b = true;
                }
            }
            catch (InputMismatchException e){
                in.next();
                System.out.println("INVALID INPUT, PLEASE TRY AGAIN");
            }
        }

        double c = 0.0;
        boolean valid_c = false;
        while(!valid_c){
            try{
                System.out.print("Enter c: ");
                c = in.nextDouble();
                if (c == 0){
                    System.out.println("VALUE CANNOT BE 0, PLEASE TRY AGAIN");
                }
                else{
                    valid_c = true;
                }
            }
            catch (InputMismatchException e){
                in.next();
                System.out.println("INVALID INPUT, PLEASE TRY AGAIN");
            }
        }
        double d = Math.pow(b, 2) - (4*a*c);
        if(d<0) System.out.println("There are no solutions");
        else if (d == 0) {
            double x = -(b / (2 * a));
            System.out.println(x);
        }
        else if(d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + "," + x2);
        }
}
}
