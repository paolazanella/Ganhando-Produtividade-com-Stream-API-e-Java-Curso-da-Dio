package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        int somaDigitos = numeros.stream()
                .flatMapToInt(n -> String.valueOf(n).chars().map(Character::getNumericValue))
                .sum();

        System.out.println(somaDigitos);
    }
}
