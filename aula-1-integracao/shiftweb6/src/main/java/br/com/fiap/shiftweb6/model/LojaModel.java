package br.com.fiap.shiftweb6.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "SHIFT6_LOJA")
public class LojaModel {


    @Id
    @Column(name = "ID_LOJA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOJA_SEQ")
    @SequenceGenerator(name = "LOJA_SEQ", initialValue = 1, allocationSize = 1)
    private Long idLoja;

    @Column(name = "NOME_LOJA")
    private String nomeLoja;

    @ManyToMany (mappedBy = "lojas", fetch = FetchType.LAZY)
    private List<ProdutoModel> produtos;

    public Long getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Long idLoja) {
        this.idLoja = idLoja;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }




}