package br.edu.uniritter.canoas.poo.jogo.model;

public class MuitosJogadoresException extends Exception{
    @Override
    public String getMessage() {
        return "O tabuleiro só aceita no máximo 6 jogadores";
    }
}
