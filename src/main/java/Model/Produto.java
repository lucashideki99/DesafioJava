/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author lucas
 */
@Entity
@Table(name="produto")
public class Produto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    @Column(length = 50, nullable = false)
    private String descricao;
    
    @Temporal(TemporalType.DATE)
    private Date dataValidade;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    
    @Column(precision = 13, scale = 2, nullable = false)
    private BigDecimal preco; 
    
    private boolean ativo;

    public Produto() {
    }
    

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", dataValidade=" + dataValidade + ", dataCadastro=" + dataCadastro + ", preco=" + preco + ", ativo=" + ativo + '}';
    }
    
}
