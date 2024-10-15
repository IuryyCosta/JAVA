package Exec_Class;

public class Cliente {

    private int codigo;
    private String name;

    Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String createName(String name) {
        person.setName(name);  // Define o nome na classe Person
        return person.getName(); // Retorna o nome atualizado
    }

    public String[] createEnderecoCliente(String r, String n, String b, String c) {
        person.setEnderecoDetalhado(r, n, b, c);
        return person.getEndereco();
    }
}
