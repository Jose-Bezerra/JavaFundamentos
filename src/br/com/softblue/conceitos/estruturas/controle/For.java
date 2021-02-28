package br.com.softblue.conceitos.estruturas.controle;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i == 17) {
                continue; // Não exeecuta a impressão do i, mas continua no FOR
            } else if ( i == 19 ) {
                break; // Sai do laço'
                // O break pode ser usado no switch, while e for.
            }
            System.out.println("i = " + i);
            
        }

        int j = 0;
        for (;;) {
            System.out.println("j = " + j);
            if (j == 10) {
                break;
            }
            j++;

        }


    }
}
