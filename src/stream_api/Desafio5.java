package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        OptionalDouble media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(media.isPresent() ? media.getAsDouble() : "Não há números maiores que 5");
    }
}
