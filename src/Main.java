import Exec_Class.Cliente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Cria uma instância da classe Cliente
        Cliente cliente = new Cliente();

        // Define o nome do cliente e imprime o nome atualizado
        String nomeAtualizado = cliente.createName("Iury");
        System.out.println("Nome do Cliente: " + nomeAtualizado);

        // Define o endereço do cliente e imprime os dados de endereço atualizados
        String[] enderecoAtualizado = cliente.createEnderecoCliente("Rua das Flores", "123", "Centro", "Apartamento 101");


        for (String data : enderecoAtualizado ){
            System.out.println(data);
        }


    }
}