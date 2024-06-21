package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        int maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrime)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(maiorPrimo);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
