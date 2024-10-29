package exec_12;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {

    public String cnpj;

    public PessoaJuridica (String name,
                          String endereco,
                           LocalDate dataNascimento,
                            String cnpj) {

        setName(name);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj() {
        this.cnpj = cnpj;
    }

    public String toString() {
        return "PessoaJuridica{" +
                "name='" + getName() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

}

