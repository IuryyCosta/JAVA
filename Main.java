import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados (ex: Maria-Feminino,João-Masculino,Ana-Feminino):");
        String input = scanner.nextLine();

        
        List<Pessoa> pessoas = Arrays.stream(input.split(","))
            .map(item -> {
                String[] partes = item.split("-");
                return new Pessoa(partes[0].trim(), partes[1].trim());
            })
            .collect(Collectors.toList());

        // Filtrar apenas as mulheres
        List<Pessoa> mulheres = pessoas.stream()
            .filter(p -> p.getSexo().equalsIgnoreCase("Feminino"))
            .collect(Collectors.toList());

        // Imprimir nomes das mulheres
        System.out.println("\nMulheres encontradas:");
        mulheres.forEach(m -> System.out.println(m.getNome()));

        // Fechar o scanner
        scanner.close();
    }
}
