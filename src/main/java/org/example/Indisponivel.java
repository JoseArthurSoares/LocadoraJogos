package org.example;

public class Indisponivel implements Estado{
    private Jogo jogo;

    public Indisponivel(Jogo jogo) {
        this.jogo = jogo;
    }

    @Override
    public void alugar(Jogo jogo) {
        System.out.println("Jogo indisponível para aluguel");
    }

    @Override
    public void pagarAluguel(Double valor) {
        double troco = valor - this.jogo.getValor();
        System.out.println("Valor: " + this.jogo.getValor() + "\n");
        verificaAluguel(troco, this.jogo);
    }

    static void verificaAluguel(double troco, Jogo jogo) {
        if (troco == 0) {
            System.out.println("ALuguel quitado com sucesso. Volte sempre");
            jogo.setEstado(new Disponivel(jogo));
        } else if (troco > 0) {
            System.out.println("ALuguel quitado com sucesso. Troco: " + troco + ". Volte sempre.");
            jogo.setEstado(new Disponivel(jogo));
        } else {
            System.out.println("Valor insuficiente para pagar o aluguel.");
        }
    }

}
