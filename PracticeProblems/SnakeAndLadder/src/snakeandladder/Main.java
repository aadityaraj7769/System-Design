package src.snakeandladder;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    Player player1 = new Player("1", "Aditya");
    Player player2 = new Player("2", "Anshu");
    Player player3 = new Player("3", "Ankit");

    Board board = new Board(10);

    Game game = new Game(board);
    game.addPlayers(player1);
    game.addPlayers(player2);
    game.addPlayers(player3);

    game.startGame();
  }
}
