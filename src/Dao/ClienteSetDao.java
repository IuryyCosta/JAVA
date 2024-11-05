package Dao;

import Domain.Cliente;

import java.lang.ref.Cleaner;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClienteSetDao implements  IClienteDao {

    private Set<Cliente> set;

    public ClienteSetDao() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            this.set.remove(clienteEncontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setName(cliente.getName());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setEnd(cliente.getEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                }
            }
        }
    }


    @Override
    public Cliente consultar(long cpf) {
        for (Cliente clienteCadastrado : this.set) {
            if(clienteCadastrado.getCpf().equals(cpf))
                    return clienteCadastrado;
        }

        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}

