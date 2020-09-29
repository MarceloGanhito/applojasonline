package br.com.analise2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anunciante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Void manter;

    public Anunciante(Long id, Void manter) {
        this.id = id;
        this.manter = manter;
    }

    public Anunciante() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Void getManter() {
        return manter;
    }

    public void setManter(Void manter) {
        this.manter = manter;
    }
}
