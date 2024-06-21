package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        boolean algumMaiorQue10 = numeros.stream()
                .anyMatch(n -> n > 10);

        System.out.println(algumMaiorQue10);
    }
}
