package one.digitalinnovation.lab_padroes_de_projeto_spring.service;

import one.digitalinnovation.lab_padroes_de_projeto_spring.model.Cliente;

/**
 * Interface que define o padrão Strategy no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
