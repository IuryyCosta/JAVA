import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MainTest {

    @Test
    public void testFiltrarMulheres_somenteMulheresNaLista() {
        String entrada = "Maria-Feminino,João-Masculino,Ana-Feminino,Carlos-Masculino";
        List<Pessoa> pessoas = Main.parsePessoas(entrada);
        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertEquals(2, mulheres.size());
        assertTrue(mulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino")));
    }

    @Test
    public void testSemMulheres() {
        String entrada = "João-Masculino,Carlos-Masculino";
        List<Pessoa> pessoas = Main.parsePessoas(entrada);
        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertTrue(mulheres.isEmpty());
    }

    @Test
    public void testTodasMulheres() {
        String entrada = "Clara-Feminino,Ana-Feminino";
        List<Pessoa> pessoas = Main.parsePessoas(entrada);
        List<Pessoa> mulheres = Main.filtrarMulheres(pessoas);

        assertEquals(2, mulheres.size());
    }
}
