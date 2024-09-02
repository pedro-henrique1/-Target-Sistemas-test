package src;

public class Soma {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // No final o valor da soma será 77
        System.out.println("O valor final de SOMA é: " + SOMA);
    }

}
