package br.com.softblue.conceitos.exercicios;

public class Exer03_Fatorial_Recursivo {
    public static void main(String[] args) {
       int numero = 5;
       
       int resultado = Fatorial(numero);

        System.out.println("resultado = " + resultado);

    }

    static int Fatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * Fatorial(numero - 1);
        }
    }


}
