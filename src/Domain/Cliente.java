package Domain;

import java.util.Objects;

public class Cliente {
    private String name;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;


    public Cliente(String name, Long cpf, String tel , String end,
                   Integer numero , String cidade, String estado){

        this.name = name;
        this.cpf = cpf ;
        this.tel = Long.valueOf(tel.trim());
        this.end = end ;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;

    }

    public Cliente(String dadosSeparado,
                   String dadosSeparado1,
                   String dadosSeparado2,
                   String dadosSeparado3,
                   String dadosSeparado4,
                   String dadosSeparado5,
                   String dadosSeparado6) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = Long.valueOf(cpf);
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }



    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
