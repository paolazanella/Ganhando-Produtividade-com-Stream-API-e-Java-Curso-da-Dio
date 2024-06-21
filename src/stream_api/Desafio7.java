package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        Integer segundoMaior = numeros.stream()
                .sorted((a, b) -> b - a)
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(segundoMaior);
    }
}
