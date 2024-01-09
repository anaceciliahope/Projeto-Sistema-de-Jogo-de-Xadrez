package br.com.jogo.application;

import br.com.jogo.boardgame.Piece;
import br.com.jogo.chess.ChessPiece;
import br.com.jogo.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    public static ChessPosition readChessPosition(Scanner teclado) {
        try {
            String s = teclado.nextLine();
            char colunm = s.charAt(0);
            int row = Integer.parseInt(s.substring(1));
            return new ChessPosition(colunm, row);
        } catch (RuntimeException e) {
            throw new InputMismatchException("Erro reading ChessPosition. Valid values are from a1 to h8");
        }

    }
    // https://stackoverflow.com/questions/2979383/java-clear-the-console
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println(" a b c d e f g h");
    }
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");

    }
}
