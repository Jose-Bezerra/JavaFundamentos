package br.com.softblue.conceitos;

public class CastingImplicito {
    public static void main(String[] args) {
        long numeroLong = 10; // O Java entende como int o valor atribuído
        float numeroFloat = 5L;
        double numeroFlutuante = 2.3f;
      //  int numeroInteiro = 3.5; => Não conseguimos fazer o cast implícito

        float x = 40;
        float y = (float) 40.0;

        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroFlutuante);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // No cast implícito tipo primitivo maior contem o primitivo menor
        // ex.: Double (8 bytes>  > Float (4 bytes) > Long (8 bytes)
        // ex.: Long (8 bytes) > Int (4 bytes) > short (2 bytes) > Byte(1 byte)
    }
}
