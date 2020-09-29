package br.com.analise2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InteresseCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_cliente;
    private Long Id_Secao_Interesse;

    public InteresseCliente(Long id_cliente, Long id_Secao_Interesse) {
        Id_cliente = id_cliente;
        Id_Secao_Interesse = id_Secao_Interesse;
    }

    public InteresseCliente() {
    }

    public Long getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        Id_cliente = id_cliente;
    }

    public Long getId_Secao_Interesse() {
        return Id_Secao_Interesse;
    }

    public void setId_Secao_Interesse(Long id_Secao_Interesse) {
        Id_Secao_Interesse = id_Secao_Interesse;
    }
}
