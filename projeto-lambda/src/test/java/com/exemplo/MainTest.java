package com.exemplo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTest {

    @Test
    public void testFiltrarMulheres() {
        String entrada = "Maria-Feminino,João-Masculino,Ana-Feminino";
        List<Pessoa> pessoas = Main.parsePessoas(entrada);
        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertEquals(2, mulheres.size());
        assertTrue(mulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino")));
    }
}
