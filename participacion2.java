package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    static void numeroprimo() {

        Scanner dato = new Scanner(System.in);

        int c = 0;

        int i = 0;

        int numero = 0;

        System.out.print("Ingresa un numero: ");

        numero = dato.nextInt();

        for (i = 1; i <= numero; i++) {

            if ((numero % i) == 0) {
                c++;
            }
        }
        if (c <= 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static void main(String[] args) {

        numeroprimo();

    }
}