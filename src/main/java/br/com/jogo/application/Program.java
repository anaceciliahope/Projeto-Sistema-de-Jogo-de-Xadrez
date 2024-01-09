package br.com.jogo.application;

import br.com.jogo.chess.ChessException;
import br.com.jogo.chess.ChessMatch;
import br.com.jogo.chess.ChessPiece;
import br.com.jogo.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try {

                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(teclado);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(teclado);
                ChessPiece capturedPiece = chessMatch.perFormChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                teclado.nextLine();

            }
        }
    }
}