package Exec_Class;

/**
 * @author Iury
 * @version 1.0.0
 */
public class Person {

    private String name;
    private int age;
    private String role;
    private String[] endereco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getEndereco() {
        return endereco;
    }

    /**
     * Retorna um array com os endereços.
     * @param endereco
     */
    public void setEndereco(String[] endereco) {
        this.endereco = endereco;
    }

    /**
     * Define e retorna um array com os dados do endereço
     * @param rua
     * @param numero
     * @param bairro
     * @param complemento
     * @return endereco
     */
    public String[] setEnderecoDetalhado(String rua, String numero, String bairro, String complemento) {
        // Preenche o array com os dados do endereço
        String[] dados = {
                rua,
                numero,
                bairro,
                complemento
        };

        // Atualiza o atributo 'endereco' com os dados fornecidos
        this.endereco = dados;

        // Retorna o array 'endereco' atualizado
        return this.endereco;
    }
}
