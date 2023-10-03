/**
 * 
 */
package br.com.lmartins.services;

import br.com.lmartins.dao.IProdutoDAO;
import br.com.lmartins.domain.Produto;
import br.com.lmartins.services.generic.GenericService;

/**
 * @author lucas
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
