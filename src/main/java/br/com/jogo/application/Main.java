package br.com.jogo.application;

import br.com.jogo.boardgame.Board;
import br.com.jogo.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}