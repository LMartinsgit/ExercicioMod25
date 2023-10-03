/**
 * 
 */
package br.com.lmartins.services;

import br.com.lmartins.domain.Cliente;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author lucas
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
