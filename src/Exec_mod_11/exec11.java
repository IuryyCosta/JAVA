package Exec_mod_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exec11 {

    public static void main(String args[]){

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino  =  new ArrayList<>();

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Digite o nome (Ou sair para Finalizar)");

            String name = s.nextLine();

            //Verifica se o usuário quer encerrar o loop

            if(name.equalsIgnoreCase("sair"))
                break;
            System.out.println("Digite o Sexo (M/F)");

            String sexo = s.nextLine();

            if(sexo.equalsIgnoreCase("M")){
                grupoMasculino.add(name);
            }else if (sexo.equalsIgnoreCase("F")){
                grupoFeminino.add(name);}
            else{System.out.println("Sexo Inválido. tente novemente");}


            }

        // Exibir os grupos

        System.out.println("\nPessoas do grupo masculino");
            for(String masculino : grupoMasculino){
                System.out.println(masculino);
            }

         System.out.println("*********************");

            for(String feminino : grupoFeminino){
                System.out.println(feminino);
            }

            s.close();

        }




}
