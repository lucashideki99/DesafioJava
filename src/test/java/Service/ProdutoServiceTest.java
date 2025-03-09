/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Service;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author lucas
 */
@Ignore
public class ProdutoServiceTest {
    
    private ProdutoService produtoService;
    
    public ProdutoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        produtoService = new ProdutoService();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ProdutoService.
     */
    @Test
    public void testSalvar() {
        assertEquals(true, produtoService.salvar("Teste", new Date(), new Date(), new BigDecimal("100.1"), true));
        assertEquals(false, produtoService.salvar(null, new Date(), new Date(), new BigDecimal("10"), true));
    }
    
}
