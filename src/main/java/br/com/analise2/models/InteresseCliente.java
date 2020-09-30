package br.com.analise2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InteresseCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Cliente cliente;
    private SecaoDeInteresse secaoInteresse;

    public InteresseCliente(Cliente cliente, SecaoDeInteresse secaoInteresse) {
        this.cliente = cliente;
        this.secaoInteresse = secaoInteresse;
    }

    public InteresseCliente() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SecaoDeInteresse getSecaoInteresse() {
        return secaoInteresse;
    }

    public void setSecaoInteresse(SecaoDeInteresse secaoInteresse) {
        this.secaoInteresse = secaoInteresse;
    }
}
