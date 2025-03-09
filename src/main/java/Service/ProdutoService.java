/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.ProdutoDAO;
import Model.Produto;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class ProdutoService {
    private ProdutoDAO produtoDAO;
    
    public ProdutoService(){
        this.produtoDAO = new ProdutoDAO();
    }
    
    public boolean salvar(String descricao, Date dataCadastro, Date dataValidade, BigDecimal preco, boolean ativo){
            
        if (descricao == null || descricao.trim().isEmpty()) {
            return false; 
        }
        if (preco == null) {
            return false;
        }
        
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setDataCadastro(dataCadastro);
        produto.setDataValidade(dataValidade);
        produto.setPreco(preco);
        produto.setAtivo(ativo);

        return produtoDAO.salvar(produto);
    }
    
}
