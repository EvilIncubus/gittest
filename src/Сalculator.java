import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        System.out.println("Introdu a,b,c");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + "x^2+" + b + "x+" + c + "=0");
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println(b + "^2-4*" + a + "*" + c + "=" + delta);
        if (delta>0) {
            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println("(" + (-b) + "\u221a" + delta + ")/2*" + a + "=" + x1);
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("(" + (-b) + "\u221a" + delta + ")/2*" + a + "=" + x2);
        }
        else if (delta==0) {
            double x = (-b/2*a);
            System.out.println(-b+"/2*"+a+"="+x);
        }
        else {
            System.out.println("Nu are solutie");
        }
    }
}
