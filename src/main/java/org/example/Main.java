package org.example;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Zelda", 20.00);
        jogo.alugar();
        jogo.setEstado(new Atrasado(jogo));
        jogo.pagarAluguel(21.00);
        jogo.pagarAluguel(26.00);
        jogo.pagarAluguel(26.00);
    }
}