package br.com.softblue.conceitos.exercicios;

public class Exer05_IfElse {
    public static void main(String[] args) {
        int num = 10;

        while (num < 1000) {
            if (num % 2 == 0) {
                num += 5;
                System.out.print(num + " ");
            } else {
                num *= 2;
                System.out.print(num + " ");
            }
        }
    }
}
