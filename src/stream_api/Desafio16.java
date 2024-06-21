package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> pares = agrupados.get(true);
        List<Integer> impares = agrupados.get(false);

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
