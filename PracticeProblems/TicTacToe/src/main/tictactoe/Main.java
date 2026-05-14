package src.main.tictactoe;

public class Main {
    public static void main(String[] args) {
        Symbol symbol1 = Symbol.X;
        Symbol symbol2 = Symbol.O;

        Player player1 = new Player("1", "Aditya", symbol1);
        Player player2 = new Player("2", "Ankit", symbol2);

        TicTacToeGame game = new TicTacToeGame(3);
        game.addPlayer(player1);
        game.addPlayer(player2);

        game.startGame();
    }
}
