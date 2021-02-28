package br.com.softblue.conceitos.exercicios;

public class Exer03_Fatorial_EstruturaRepeticao {
    public static void main(String[] args) {
        int numero = 5;
        int fatorial = 1;


        for (int i = 2; i <= numero; i++) {

            fatorial = fatorial * i;

        }

        System.out.println("O fatorial do número " + numero + " é " + fatorial + ".");
    }
}
