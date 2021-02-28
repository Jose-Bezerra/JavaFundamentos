package br.com.softblue.conceitos.exercicios;

import java.util.ArrayList;

public class Exer04_Fibonacci {
    public static void main(String[] args) {
        int sequenciaFibonacci = 10;

        int n1 = 0; //Primeiro número de seqeuência Fibonacci
        int n2 = 1; //Segundo número da sequeência Fibonacci
        int auxiliar = 0;
        //Lembre-se: A sequência inicia com 0, 1, 1, 2, 3, 5, 8, ....
        for (int i = 1; i <= 15; i++) {
            System.out.print(n1 + " ");
            auxiliar = n2 + n1;
            n1 = n2;
            n2 = auxiliar;
        }

    }
}
