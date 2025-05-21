package com.exemplo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Pessoa> parsePessoas(String input) {
        return Arrays.stream(input.split(","))
            .map(item -> {
                String[] partes = item.split("-");
                return new Pessoa(partes[0].trim(), partes[1].trim());
            })
            .collect(Collectors.toList());
    }

    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
            .collect(Collectors.toList());
    }
}
