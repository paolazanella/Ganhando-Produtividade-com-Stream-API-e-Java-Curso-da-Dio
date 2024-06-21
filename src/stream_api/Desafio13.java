package stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        int intervaloMin = 5;
        int intervaloMax = 10;

        List<Integer> filtrados = numeros.stream()
                .filter(n -> n >= intervaloMin && n <= intervaloMax)
                .collect(Collectors.toList());

        System.out.println(filtrados);
    }
}
