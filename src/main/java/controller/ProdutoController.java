/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Service.ProdutoService;
import java.math.BigDecimal;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Decimalbox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

/**
 *
 * @author lucas
 */
public class ProdutoController extends Window {
    
    private Button btnGravar;
    private Button btnLimpar;
    
    private Textbox descricao;
    private Datebox dataCadastro;
    private Datebox dataValidade;
    private Decimalbox preco;
    private Checkbox ativo;
    
    private Window win;
        public void onCreate() {

        this.win = ((Window) getFellow("win"));
        
        this.descricao = ((Textbox) getFellow("descricao"));
        this.dataCadastro = ((Datebox) getFellow("dataCadastro"));
        this.dataValidade = ((Datebox) getFellow("dataValidade"));
        this.preco = ((Decimalbox) getFellow("preco"));
        this.ativo = ((Checkbox) getFellow("ativo"));
        
        this.btnGravar = ((Button) getFellow("btnGravar"));
        this.btnLimpar = ((Button) getFellow("btnLimpar"));

        limparCampos();

    }
        
    public void limparCampos() {
        this.descricao.setRawValue(null);
        this.dataCadastro.setRawValue(null);
        this.dataValidade.setRawValue(null);
        this.preco.setRawValue(null);
        this.ativo.setChecked(false);
        
        this.descricao.setFocus(true);
    }
    
    public void gravarCampo(){
        ProdutoService service = new ProdutoService();
            
        if (service.salvar(this.descricao.getValue(), this.dataCadastro.getValue(), this.dataValidade.getValue(), this.preco.getValue(), this.ativo.isChecked())){
            Messagebox.show("Produto Cadastrado com sucesso!", "Cadastro", Messagebox.OK, Messagebox.INFORMATION);
            limparCampos();
        }else{
            Messagebox.show("Erro ao Cadastrar o produto!", "Cadastro", Messagebox.OK, Messagebox.ERROR);
        }
    }
        
    
}
