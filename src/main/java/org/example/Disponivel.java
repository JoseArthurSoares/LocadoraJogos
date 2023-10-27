package org.example;

public class Disponivel implements Estado{
    private Jogo jogo;

    public Disponivel(Jogo jogo) {
        this.jogo = jogo;
    }
    @Override
    public void alugar(Jogo jogo) {
        System.out.println("Jogo " + this.jogo.getNome() + " disponível. Valor: " + this.jogo.getValor());
        this.jogo.setEstado(new Indisponivel(jogo));
    }

    @Override
    public void pagarAluguel(Double valor) {
        System.out.println("Jogo não está alugado.");
    }

}
