package br.com.fiap.shiftweb6.model;

import javax.persistence.*;

@Entity
@Table(name = "SHIFT6_CATEGORIA")
public class CategoriaModel {

    @Id
    @Column(name="ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORIA_SEQ")
    @SequenceGenerator(name = "CATEGORIA_SEQ", initialValue = 10, allocationSize = 1)
    private long idCategoria;

    @Column(name = "NOME_CATEGORIA")
    private String nome;

    @Column(name = "ATIVO")
    private boolean ativo;

    // CONSTRUTORES
    public CategoriaModel(){
        super();
    }

    public CategoriaModel(long idCategoria, String nome, boolean ativo) {
        super();
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.ativo = ativo;
    }

    // GT + ST
    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "CategoriaModel{" +
                "idCategoria=" + idCategoria +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
