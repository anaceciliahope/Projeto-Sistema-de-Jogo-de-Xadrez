package br.com.jogo.chess.pieces;

import br.com.jogo.boardgame.Board;
import br.com.jogo.chess.ChessPiece;
import br.com.jogo.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "K";
    }
}
