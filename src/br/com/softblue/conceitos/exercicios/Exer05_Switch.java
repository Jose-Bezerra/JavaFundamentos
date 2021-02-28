package br.com.softblue.conceitos.exercicios;

public class Exer05_Switch {
    public static void main(String[] args) {
        int num = 10;

        while (num < 1000) {
           switch (num % 2) {
               case 0:
                   num += 5;
                   break;
               default:
                   num *= 2;
           }

            System.out.print( num + " ");
        }
    }
}
