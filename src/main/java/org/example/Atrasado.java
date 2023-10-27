package org.example;

public class Atrasado implements Estado{
    private Jogo jogo;

    public Atrasado(Jogo jogo){
        this.jogo = jogo;
    }
    @Override
    public void alugar(Jogo jogo) {
        System.out.println("Jogo indisponível para aluguel");
    }

    @Override
    public void pagarAluguel(Double valor) {

        double troco = valor - (this.jogo.getValor() + 5);
        System.out.println("O valor do aluguel será acrescido em 5 reais devido o atraso no pagamento.\n" +
                "Valor: " + (this.jogo.getValor() + 5) + "\n");
        Indisponivel.verificaAluguel(troco, this.jogo);
    }

}
