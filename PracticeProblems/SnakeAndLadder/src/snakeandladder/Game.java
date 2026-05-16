package src.snakeandladder;

import java.util.ArrayDeque;
import java.util.Deque;


public class Game {
  private Deque<Player> players;
  private Board board;
  private GameStatus status;

  public Game(Board board) {
    this.board = board;
    status = GameStatus.IN_PROGRESS;
    players = new ArrayDeque<>();
  }

  public void addPlayers(Player player) {
    players.addLast(player);
  }

  public void makeMove(Player player, int position) {
    int finalPosition = board.getFinalPosition(player.getPosition(), position, player.getPlayerName());
    player.moveTo(finalPosition);
  }

  public void startGame() throws InterruptedException {
    System.out.println("Game Started");

    Dice dice = new Dice();

    while(status == GameStatus.IN_PROGRESS) {
      Player player = players.pollFirst();

      System.out.println("Roll the Dice: " + player.getPlayerName());

      int diceValue = dice.roll();
      Thread.sleep(5000);
      System.out.println(player.getPlayerName() + " got " + diceValue);

      if(!board.isValidMove(player.getPosition(), diceValue)) {
        System.out.println("Your moves are out of scope and your chance has skipped");
        players.addLast(player);
        continue;
      }

      makeMove(player, diceValue);
      if(board.isWinningPosition(player.getPosition())) {
        status = GameStatus.WINNER;
        System.out.println(player.getPlayerName() + " Won the Match");
        return;
      }
      players.addLast(player);
    }
  }
}
