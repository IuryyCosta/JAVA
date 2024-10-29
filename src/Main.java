import exec_12.PessoaFisica;
import exec_12.PessoaJuridica;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PessoaFisica iury = new PessoaFisica("Iury",
                                            "Rua Perdizes",
                LocalDate.of(1998, 9, 17),
                                            "123.456.789-99");

        PessoaJuridica sarah = new PessoaJuridica(
                "Empresa ABC Ltda",
                "Avenida Central, 456",
                LocalDate.of(1993,4,11),
                "12.345.678/0001-00"
        );

        // Imprimindo as informações das pessoas
        System.out.println("Informações da Pessoa Física:");
        System.out.println(iury.toStrig());

        System.out.println("\nInformações da Pessoa Jurídica:");
        System.out.println(sarah.toString());
    }
}