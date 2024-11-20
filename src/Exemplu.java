import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exemplu {
    public static void main(String[] args) {
        //adunarea();
        // parSauImpar();
        //  factorialul();
        //   numarPrim();
        //   afisare();
        //  sumaSiMedia();
        // inversarea();
        //bisect();
        // numarDeCaractere();
        // inmultirea();
        //revers();
        // maximul();
        masiv(); //tema pe acasa
    }

    private static void adunarea() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int suma = (a + b);
        System.out.println("Suma celor două numere este:" + suma);
    }

    //////////
    private static void parSauImpar() {
        int a = 4;
        int b = 7;
        if (a % 2 == 0) {
            System.out.println("Numarul " + a + " este par");
        } else {
            System.out.println("Numarul " + a + " este impar");
        }
        if (b % 2 == 0) {
            System.out.println("Numarul " + b + " este par");
        } else {
            System.out.println("Numarul " + b + " este impar");
        }
    }

    ///////
    private static void factorialul() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("factorialul lui " + a + " este " + factorial);
    }

    private static void numarPrim() {
        int numar = 16;
        if (numar <= 1) {
            System.out.println("Numerele mai mici sau egale cu 1 nu sunt prime");
            return;// Numerele mai mici sau egale cu 1 nu sunt prime
        }

        // Verificăm divizibilitatea până la √numar
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                System.out.println(numar + " nu este prim");
                return;// Dacă găsim un divizor, numărul nu este prim
            }
        }
        System.out.println(numar + " Este prim");
    }

    /////
    private static void afisare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul");
        int a = scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.print(i + " ");
        }
    }

    //////
    private static void sumaSiMedia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu 5 numere: ");
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            int a = scanner.nextInt();
            System.out.println("Ai introdus: " + a);
            suma += a;
            System.out.println("Suma numerelor introduse este: " + suma);
        }
        int media = 0;
        media = suma / 5;
        System.out.println("Media numereleor este: " + media);
    }

    /////
    private static void inversarea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numarul: ");
        int numar = scanner.nextInt();
        int inversare = 0;
        while (numar != 0) {
            int cifra = numar % 10;
            inversare = inversare * 10 + cifra;
            numar = numar / 10;
        }
        System.out.println("Numarul inversat este: " + inversare);
    }

    /////
    private static void bisect() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu anul: ");
        int an = scanner.nextInt();
        if (an % 4 == 0 && an % 100 == 0 && an % 400 == 0) {
            System.out.println("Anul " + an + " este bisect");
        } else {
            System.out.println("Anul" + an + " nu este bisect");
        }
    }

    /////
    private static void numarDeCaractere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu ceva: ");
        String cuvant = scanner.nextLine();
        int num = cuvant.length();
        System.out.println("Numarul de caractere al cuvantului '" + cuvant + "' este de " + num);
    }

    /////
    private static void inmultirea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu numarul");
        int num = scanner.nextInt();
        int rezultatul = 0;
        for (int i = 1; i <= 10; i++) {
            rezultatul = num * i;
            System.out.println("rezultatul este " + num + "x" + i + "=" + rezultatul);
        }
    }

    private static void revers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu cuvantul");
        String cuvant = scanner.nextLine();
        for (int i = 0; i <= cuvant.length() / 2; i++) {
            if (!(cuvant.charAt(i) == cuvant.charAt(cuvant.length() - i - 1))) {
                System.out.println("Cuvantul nu este  palindrom");
                return;
            }
        }
        System.out.println("Cuvantul este palindrom");
    }

    //////
    private static void maximul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu 3 cifre ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maxim = 0;
        if (a >= b && a >= c) {
            maxim = a;
        } else if (b >= a && b >= c) {
            maxim = b;
        } else {
            maxim = c;
        }
        System.out.println("Maximul dintre aceste cifre este " + maxim);
    }

    private static void masiv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu numerele");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("REZULTATUL ESTE [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (!(i==array.length-1)) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

