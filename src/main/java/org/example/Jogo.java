package org.example;

public class Jogo {
    private Double valor;
    private String nome;
    private Estado estado;

    public Jogo(String nome, Double valor) {
        this.valor = valor;
        this.estado = new Disponivel(this);
        this.nome = nome;
    }

    public void alugar(){
        this.estado.alugar(this);
    }

    public void pagarAluguel(Double valor) {
        this.estado.pagarAluguel(valor);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Double getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
