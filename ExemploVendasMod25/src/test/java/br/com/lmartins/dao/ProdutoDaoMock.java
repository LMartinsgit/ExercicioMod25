/**
 * 
 */
package br.com.lmartins.dao;

import java.util.Collection;

import br.com.lmartins.dao.IProdutoDAO;
import br.com.lmartins.domain.Produto;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author lucas
 *
 */
public class ProdutoDaoMock implements IProdutoDAO {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(String valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto consultar(String valor) {
		Produto produto = new Produto();
		produto.setCodigo(valor);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
