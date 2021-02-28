package br.com.softblue.conceitos.estruturas.controle;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 20);

        //Observe que Do-While executará o código ao menos uma vez.
        //A condição é verificada no final
    }
}
