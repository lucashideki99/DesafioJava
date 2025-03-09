/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import Model.Produto;
import java.math.BigDecimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author lucas
 */
@Ignore
public class ProdutoDAOTest {
    
    private Produto produto;
    private ProdutoDAO produtoDAO;
    
    public ProdutoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        produto = new Produto();
        produtoDAO = new ProdutoDAO();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ProdutoDAO.
     */
    @Test
    public void testSalvar() {
        produto.setAtivo(true);
        produto.setDataCadastro(new Date());
        produto.setDataValidade(new Date());
        produto.setDescricao("Teste");
          
        assertEquals(false, produtoDAO.salvar(produto));
        
        produto.setPreco(new BigDecimal("100.12"));
        
        assertEquals(true, produtoDAO.salvar(produto));
      
    }
    
}
