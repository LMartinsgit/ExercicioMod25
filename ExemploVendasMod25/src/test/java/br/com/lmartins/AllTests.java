/**
 * 
 */
package br.com.lmartins;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author lucas
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
	ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTests {

}
