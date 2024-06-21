package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.println(todosPositivos);
    }
}
