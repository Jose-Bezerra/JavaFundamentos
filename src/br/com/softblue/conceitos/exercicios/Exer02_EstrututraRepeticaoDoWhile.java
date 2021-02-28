package br.com.softblue.conceitos.exercicios;

//Comece do 0, imprima os numeros seguintes até que a soma seja < 100
public class Exer02_EstrututraRepeticaoDoWhile {
    public static void main(String[] args) {
        int j = 0;
        int soma = 0;

        do {
            System.out.println("j = " + j);
            soma += j;
            j++;
        } while ( soma + j < 100 );

        System.out.println("soma = " + soma);
    }
}
