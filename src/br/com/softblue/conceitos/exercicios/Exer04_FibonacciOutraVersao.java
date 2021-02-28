package br.com.softblue.conceitos.exercicios;

//Outra versão da sequeência de Fibonnaci
public class Exer04_FibonacciOutraVersao {
    public static void main(String[] args) {

        int calculoSequencia = 1;
        //Lembre-se: A sequência inicia com 0, 1, 1, 2, 3, 5, 8, ....
        for (int i = 0, contador = 0; contador < 15; contador++) {
            System.out.print(i + " ");
            i = i + calculoSequencia;
            calculoSequencia = i - calculoSequencia;

        }

    }
}
