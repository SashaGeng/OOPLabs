import java.util.Scanner;
import java.util.Date;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();
    }
    private double calcS (double a, double b, double x){
        return (pow(x,3)*pow(tan(pow(x+b,2)),2)+(a/sqrt(x+b)));
    }
    private double calcQ (double a, double b, double x){
        return ((b*pow(x,2)-a)/(exp(a*x)-1));
    }

    private void print(double x, double S, double a, double b, double Q) {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("x="+x);
        System.out.println("------------------------------");
        System.out.println("S="+S);
        System.out.println("Q="+Q);
    }
    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число а=");
        double a = scanner.nextDouble();
        System.out.print("Введіть число b=");
        double b = scanner.nextDouble();
        System.out.print("Введіть число x=");
        double x = scanner.nextDouble();
        double S=calcS(a,b,x);
        double Q=calcQ(a,b,x);
        print (x,S,a,b,Q);

        Date date = new Date();
        printDate(date);
    }

    private void printDate(Date date){
        System.out.println("------------------------------");
        System.out.printf("%1$td %1$tb %1$tY\n", date);
    }
}
