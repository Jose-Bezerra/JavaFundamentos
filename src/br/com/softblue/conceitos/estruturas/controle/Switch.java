package br.com.softblue.conceitos.estruturas.controle;

public class Switch {
    public static void main(String[] args) {
        int i = 1;

        // O switch testa apenas igualdade, ou seja, é limitado
        switch (i) { // A variável de análise sempre deverá ser int, tipo enum ou String
            case 1:
                System.out.println("Valor = " + 1);
                break; // cuidado com a ausência do break
            case 2:
                System.out.println("Valor = " + 2);
                break;
            case 3:
                System.out.println("Valor = " + 3);
                break;
            default:
                System.out.println("Valor não reconhecido!");
        }

    }
}
