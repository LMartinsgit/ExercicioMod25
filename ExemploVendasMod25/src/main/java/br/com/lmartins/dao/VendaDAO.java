/**
 * 
 */
package br.com.lmartins.dao;

import br.com.lmartins.dao.generic.GenericDAO;
import br.com.lmartins.domain.Venda;
import br.com.lmartins.domain.Venda.Status;
import br.com.lmartins.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author lucas
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
