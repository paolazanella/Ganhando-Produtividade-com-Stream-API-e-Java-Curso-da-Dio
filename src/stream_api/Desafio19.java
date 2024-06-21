package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 15, 1, 3, 7, 9, 6, 2, 4);

        int somaDivisiveisPor3E5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(somaDivisiveisPor3E5);
    }
}