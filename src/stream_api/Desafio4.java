package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        List<Integer> numerosSemImpares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerosSemImpares);
    }
}
