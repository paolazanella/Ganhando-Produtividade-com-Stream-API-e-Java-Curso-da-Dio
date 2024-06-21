package stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 5, 8, 1, 3, 7, 9, 6, 2, 4);

        Set<Integer> numerosSet = numeros.stream().collect(Collectors.toSet());

        boolean todosDistintos = numeros.size() == numerosSet.size();

        System.out.println(todosDistintos);
    }
}