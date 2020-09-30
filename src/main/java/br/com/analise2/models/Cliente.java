package br.com.analise2.models;

public class Cliente {

    private Long id;
    private Long codAssinante;
    private Long qtdAsseinante;
    private String email;

    public Cliente(Long id, Long codAssinante, Long qtdAsseinante, String email) {
        this.id = id;
        this.codAssinante = codAssinante;
        this.qtdAsseinante = qtdAsseinante;
        this.email = email;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodAssinante() {
        return codAssinante;
    }

    public void setCodAssinante(Long codAssinante) {
        this.codAssinante = codAssinante;
    }

    public Long getQtdAsseinante() {
        return qtdAsseinante;
    }

    public void setQtdAsseinante(Long qtdAsseinante) {
        this.qtdAsseinante = qtdAsseinante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
