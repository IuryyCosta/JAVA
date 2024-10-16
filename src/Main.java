
import java.util.Scanner;
import Aluno.Media;

public class Main {
    public static void main(String[] args) {

        Media aluno = new Media();
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Media Aluno **** \n");

        System.out.println("**** Nota 1 **** ");
        aluno.setNota1(scanner.nextDouble());

        System.out.println("**** Nota 2 **** ");
        aluno.setNota2(scanner.nextDouble());

        System.out.println("**** Nota 3 **** ");
        aluno.setNota3(scanner.nextDouble());

        System.out.println("**** Nota 4 **** ");
        aluno.setNota4(scanner.nextDouble());

       System.out.println("Nota total do aluno : "+ aluno.getNotaTotal());

        System.out.println("****  Aprovação **** \n");
        aluno.getIsAprovad();

        scanner.close();




    }
}