package src.main.tictactoe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


public class TicTacToeGame {
    private Queue<Player> _playerQueue;
    private Board _board;
    private GameStatus _status;

    public TicTacToeGame(int size) {
        _board = new Board(size);
        _playerQueue = new ArrayDeque<>();
    }

    public void setPlayer(Player player) {
        _playerQueue.add(player);
    }

    private boolean makeMove(int i, int j, PlayingSymbol symbol) {
       return  _board.placeMove(i, j, symbol);
    }

    public void startGame() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Game has started");
            Player player = _playerQueue.poll();


            System.out.println("Please Enter the position and symbol");
            System.out.println("Enter X: ");
            int row = scanner.nextInt();
            System.out.println("Enter Y: ");
            int col = scanner.nextInt();
            System.out.println("Enter Symbol: ");
            char sym = scanner.next().charAt(0);
            PlayingSymbol symbol = new PlayingSymbol();
            symbol.setSymbol(sym);


            if(!_board.validateMove(row, col)) {
                System.out.println("Please enter valid move");
               continue;
            }

            if(makeMove(row, col, symbol)) {
                System.out.println("Player " + player.getPlayerName() + " Won the Match");
                return;
            }
            count+=1;
            if(count == 9) {
                System.out.println("Match Draw");
                break;
            }
            _playerQueue.add(player);
        }
        scanner.close();
    }

}
