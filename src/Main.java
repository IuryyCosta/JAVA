import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String resposta;

        // Definimos o limite de alunos que pode ser armazenado
        int maxAlunos = 100;
        String[] nomes = new String[maxAlunos];
        int[] idades = new int[maxAlunos];
        double[][] notasAlunos = new double[maxAlunos][];
        int totalAlunos = 0;

        System.out.println("Deseja iniciar a inserção das notas? Sim ou Não");
        resposta = s.next();

        while (resposta.equalsIgnoreCase("Sim") && totalAlunos < maxAlunos) {
            // Captura os dados do aluno
            System.out.println("Insira o nome do aluno:");
            String nome = s.next();  // Use s.nextLine() para nomes compostos, se preferir

            System.out.println("Insira a idade do aluno:");
            int idade = s.nextInt();

            // Quantidade de notas que deseja inserir
            System.out.println("Quantas notas deseja inserir para o aluno?");
            int qtNotas = s.nextInt();

            // Inicializando o array de notas para este aluno específico
            double[] notas = new double[qtNotas];

            // Laço para capturar as notas do aluno
            for (int i = 0; i < qtNotas; i++) {
                System.out.println("Insira a nota " + (i + 1) + " do aluno:");
                notas[i] = s.nextDouble();
            }

            // Armazenando os dados do aluno no array
            nomes[totalAlunos] = nome;
            idades[totalAlunos] = idade;
            notasAlunos[totalAlunos] = notas;
            totalAlunos++;  // Incrementando o contador de alunos

            // Pergunta se deseja continuar
            System.out.println("\nDeseja inserir dados de outro aluno? Sim ou Não");
            resposta = s.next();
        }

        // Exibe a listagem de todos os alunos e suas notas
        System.out.println("\nListagem dos alunos:");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Notas: ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notasAlunos[i][j]);
            }

            System.out.println("----------------------");
        }

        System.out.println("Encerrando o programa.");
        s.close();
    }
}
