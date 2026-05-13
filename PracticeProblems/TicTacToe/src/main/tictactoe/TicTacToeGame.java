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
        _status = GameStatus.IN_PROGRESS;
    }

    public void setPlayer(Player player) {
        _playerQueue.add(player);
    }

    private boolean makeMove(int i, int j, Symbol symbol) {
       return  _board.placeMove(i, j, symbol);
    }

    public void startGame() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game has started");
        while(_status == GameStatus.IN_PROGRESS) {
            Player player = _playerQueue.poll();

            System.out.println("Please Enter the position");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(!_board.validateMove(row, col)) {
                System.out.println("Please enter valid move");
                _playerQueue.add(player);
               continue;
            }

            if(makeMove(row, col, player.getPlayingSymbol())) {
                System.out.println("WINNER!");
                System.out.println("Player " + player.getPlayerName() + " Won the Match");
                _status = GameStatus.WINNER;
            }
            count+=1;
            if(count == _board.getSize() * _board.getSize()) {
                System.out.println(_status.DRAW);
                _status = GameStatus.DRAW;
            }
            _playerQueue.add(player);
        }
        scanner.close();
    }

}
