package br.com.jogo.application;

import br.com.jogo.chess.ChessMatch;
import br.com.jogo.chess.ChessPiece;
import br.com.jogo.chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(teclado);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(teclado);

            ChessPiece capturedPiece = chessMatch.perFormChessMove(source, target);
        }
    }
}