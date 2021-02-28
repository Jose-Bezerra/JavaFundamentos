package br.com.softblue.conceitos.exercicios;

public class Exer01_MediaPonderada {
    public static void main(String[] args) {

        float nota1 = 8.5F;
        float nota2 = 7.5F;
        float nota3 = 6.0F;

        int peso1 = 3;
        int peso2 = 2;
        int peso3 = 5;

        float notaParcial1 = nota1 * peso1;
        float notaParcial2 = nota2 * peso2;
        float notaParcial3 = nota3 * peso3;

        double media = (notaParcial1 + notaParcial2 + notaParcial3) / (peso1 + peso2 + peso3);

        System.out.printf("media =  %.2f ", media);
    
    }
}
