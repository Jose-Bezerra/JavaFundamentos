package br.com.softblue.conceitos;

public class CastExplicito {
    public static void main(String[] args) {
        double numFlutuante = 100.35;
        int numInteiro = (int) numFlutuante; //Cuidado com o cast explícito
        // A porte decimal é perdida

        byte n2 = (byte) 129;


        System.out.println(numInteiro);
        System.out.println(n2);
    }
}
