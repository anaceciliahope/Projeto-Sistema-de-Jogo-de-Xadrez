package br.com.jogo.chess;

import br.com.jogo.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String msg) {
        super(msg);
    }
}
