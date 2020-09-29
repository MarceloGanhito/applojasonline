package br.com.analise2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String palavras;
    private Date diasPublicacao;
    private BigDecimal valor;
    private String titulo;
    private Date dataInsercao;
    private Integer publicar;
    private String nomeContato;
    private String[] telefone;
    private String observacao;

    public Anuncio(Long id, String palavras, Date diasPublicacao, BigDecimal valor, String titulo, Date dataInsercao, Integer publicar, String nomeContato, String[] telefone, String observacao) {
        this.id = id;
        this.palavras = palavras;
        this.diasPublicacao = diasPublicacao;
        this.valor = valor;
        this.titulo = titulo;
        this.dataInsercao = dataInsercao;
        this.publicar = publicar;
        this.nomeContato = nomeContato;
        this.telefone = telefone;
        this.observacao = observacao;
    }

    public Anuncio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPalavras() {
        return palavras;
    }

    public void setPalavras(String palavras) {
        this.palavras = palavras;
    }

    public Date getDiasPublicacao() {
        return diasPublicacao;
    }

    public void setDiasPublicacao(Date diasPublicacao) {
        this.diasPublicacao = diasPublicacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public Integer getPublicar() {
        return publicar;
    }

    public void setPublicar(Integer publicar) {
        this.publicar = publicar;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String[] getTelefone() {
        return telefone;
    }

    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
