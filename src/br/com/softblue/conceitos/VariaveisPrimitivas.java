package br.com.softblue.conceitos;

import java.util.Arrays;

public class VariaveisPrimitivas {
    public static void main(String[] args) {
        int idade; //variável foi declarada.
        double peso;
        String nome;

        idade = 43; // variável inicilaizada.
        peso = 80;
        nome = "Zé Bezerra";

        var name = "Jailheminau"; //varíavel com tipo var infere o tipo
        // de acordo com valor da inicialização. Inserido no Java 10.
        var age = 43;

        int i = (int) (10L +5);
        long j = 10L + 5;
        
        
        
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(nome);
        System.out.println(name);
        System.out.println(age);
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
