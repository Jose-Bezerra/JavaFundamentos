package br.com.softblue.conceitos.exercicios;

import java.util.Scanner;

//Validação de datas
public class Exer06_ValidadeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt(); //Entre 1 e 31 - Inclusive
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt(); //Entre 1 e 12 - Inclusive
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt(); //Entre 1900 e 2999 - Inclusive

        //Vamos tratar inicialmente os casos inválidos - os genéricos incialemente.
        if ( dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900 || ano > 2999) {
            System.out.println("Data inválida");
        } else if ( dia > 28 && mes == 2) {
            System.out.println("Data inválida");
        } else if (dia == 31 &&  (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            System.out.println("Data inválida");
        } else {
            System.out.println("Data válida!!");
        }

    }
}
