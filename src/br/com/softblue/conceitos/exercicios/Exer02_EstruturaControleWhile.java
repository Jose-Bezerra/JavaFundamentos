package br.com.softblue.conceitos.exercicios;

//Imprima a soma de 1 a 100, pulando de dois em dois (1, 3, 5...)
public class Exer02_EstruturaControleWhile {
    public static void main(String[] args) {
        int  i = 1;
        int soma = 0;

        while (i < 100) {
            soma += i;
            i += 2;
        }

        System.out.println("soma = " + soma);
    }
}
