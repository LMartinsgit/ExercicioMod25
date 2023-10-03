/**
 * 
 */
package br.com.lmartins.dao;

import br.com.lmartins.dao.generic.IGenericDAO;
import br.com.lmartins.domain.Venda;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author lucas
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
