package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(produto);
    }
}
