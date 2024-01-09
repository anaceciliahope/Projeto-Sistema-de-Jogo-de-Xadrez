package br.com.jogo.chess.pieces;

import br.com.jogo.boardgame.Board;
import br.com.jogo.chess.ChessPiece;
import br.com.jogo.chess.Color;
public class Rook extends ChessPiece{
    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMove() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
