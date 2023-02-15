package Practica0;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ¿Límite? ");
        int limite = entrada.nextInt();

        int suma = SumarHasta(limite);

        System.out.println("Suma: " + suma);
        entrada.close();
    }

    private static int SumarHasta(int limite) {
        int suma = 0;
        int numero = 1;
        while (numero <= limite){
            suma += numero;
            numero++;
        }
        return suma;
    }
}
