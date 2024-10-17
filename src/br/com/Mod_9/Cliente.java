package br.com.Mod_9;

import java.util.Scanner;

/**
 * @author Iury
 */
public class Cliente {


    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número Inteiro");
        int numeroLido = scanner.nextInt();

        //Convertendo o número

        Integer numeroConvertido = Integer.valueOf(numeroLido);
        System.out.println("Número em Wrapper: " + numeroConvertido);

        scanner.close();
    }


}
