package br.com.analise2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SecaoDeInteresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long anuncios;

    public SecaoDeInteresse(Long id, String nome, Long anuncios) {
        this.id = id;
        this.nome = nome;
        this.anuncios = anuncios;
    }

    public SecaoDeInteresse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(Long anuncios) {
        this.anuncios = anuncios;
    }
}
