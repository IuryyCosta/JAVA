package exec_12;

import java.time.LocalDate;

public class PessoaFisica  extends Pessoa{

    private String cpf ;

    public  PessoaFisica(String name, String endereco, LocalDate dataNascimento, String cpf){
        setName(name);
        setEndereco(endereco);
        setDataNascimento(dataNascimento);
        this.cpf = cpf;
    }

    public String getCpf(){
        return  cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }

    public String toStrig(){
        return "PessoaFisica{" +
                "name='" + getName() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", dataNascimento=" + getDataNascimento() +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
