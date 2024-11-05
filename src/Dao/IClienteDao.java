package Dao;

import Domain.Cliente;

import java.util.Collection;

/**
 * @author Iury
 */

public interface IClienteDao {

    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public  Cliente consultar(long cpf);
    public Collection<Cliente> buscarTodos();
}
