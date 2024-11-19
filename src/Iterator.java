public class Iterator {
    public static void main(String[] args) {
        //printeaza cifre pare de la 1->10

        for (int i =1; i<=10; i++) {
            if (i%2==0){
            System.out.println(i);
            }
        }
        for (int i = 2; i <= 30; i++) {
            if (estePrim(i)) {  // Verificăm dacă numărul i este prim
                System.out.println(i);
            }
        }
        /* To do:  creaza un array cu 10 pozitii, insereaza in aceste 10 pozitii de la tastiera, sorteaza in ordinea crescatoare(boubble sorting), afiseaza array la ecran(in clasa noua)*/
    }

    // Metoda pentru a verifica dacă un număr este prim
    public static boolean estePrim(int numar) {
        // Dacă numărul este mai mic decât 2, nu este prim
        if (numar <= 1) {
            return false;
        }

        // Verificăm pentru divizori de la 2 până la sqrt(numar)
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;  // Dacă găsim un divizor, nu este prim
            }
        }
        return true;
    }
}
