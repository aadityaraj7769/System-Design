package src.main.tictactoe;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class TicTacToeGame {
    private Deque<Player> playerQueue;
    private Board board;
    private GameStatus status;

    public TicTacToeGame(int size) {
        board = new Board(size);
        playerQueue = new ArrayDeque<>();
        status = GameStatus.IN_PROGRESS;
    }

    public void addPlayer(Player player) {
        playerQueue.add(player);
    }

    private boolean makeMove(int i, int j, Symbol symbol) {
       return  board.placeMove(i, j, symbol);
    }

    public void startGame() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game has started");
        while(status == GameStatus.IN_PROGRESS) {
            Player player = playerQueue.pollFirst();

            System.out.println("Please Enter the position");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(!board.validateMove(row, col)) {
                System.out.println("Please enter valid move");
                playerQueue.addFirst(player);
               continue;
            }

            if(makeMove(row, col, player.getPlayingSymbol())) {
                System.out.println("WINNER!");
                System.out.println("Player " + player.getPlayerName() + " Won the Match");
                status = GameStatus.WINNER;
                break;
            }

            if(board.isBoardFull()) {
                System.out.println(GameStatus.DRAW);
                status = GameStatus.DRAW;
            }
            playerQueue.add(player);
        }
        scanner.close();
    }

}
