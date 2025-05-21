import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados (ex: Maria-Feminino,João-Masculino,Ana-Feminino):");
        String input = scanner.nextLine();

        List<Pessoa> pessoas = parsePessoas(input);

        List<Pessoa> mulheres = filtrarMulheres(pessoas);

        System.out.println("\nMulheres encontradas:");
        mulheres.forEach(m -> System.out.println(m.getNome()));

        
        boolean teste = verificarSomenteMulheres(mulheres);
        System.out.println("\nTeste de integridade: " + (teste ? "PASSOU" : "FALHOU"));

        scanner.close();
    }

    // Método para criar lista de Pessoa a partir da string
    public static List<Pessoa> parsePessoas(String input) {
        return Arrays.stream(input.split(","))
            .map(item -> {
                String[] partes = item.split("-");
                return new Pessoa(partes[0].trim(), partes[1].trim());
            })
            .collect(Collectors.toList());
    }

    // Método que filtra somente mulheres
    public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
            .collect(Collectors.toList());
    }

    // Método que verifica se todos são mulheres
    public static boolean verificarSomenteMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
            .allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino"));
    }
}