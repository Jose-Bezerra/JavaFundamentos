package br.com.softblue.conceitos;

public class operadoresIncrementoDecremento {
    public static void main(String[] args) {
        /*
         * Existem operdores Pré fixados e  Pós Fixados (mais usado)
         * Vamos entender a diferença?
         * */

        int a = 10;
        System.out.println("valor de a " + a);
        int b = ++a; // Primeiro incrementa, depois atribui
        System.out.println("valor de b " + b);

        int c = 10;
        System.out.println("valor de c " + c);
        int d = c++; // primeiro atribui, depois incrementa
        System.out.println("valor de d " + d);

        System.out.println("valor final a " + a);
        System.out.println("valor final b " + b);
        System.out.println("valor final c " + c);
        System.out.println("valor final d " + d);


    }
}
