package src.main.tictactoe;

public class Main {
    public static void main(String[] args) {
        PlayingSymbol symbol1 = new PlayingSymbol();
        PlayingSymbol symbol2 = new PlayingSymbol();
        symbol1.setSymbol('X');
        symbol2.setSymbol('Y');
        Player player1 = new Player("1", "Aditya", symbol1);
        Player player2 = new Player("2", "Ankit", symbol2);

        TicTacToeGame game = new TicTacToeGame(3);
        game.setPlayer(player1);
        game.setPlayer(player2);

        game.startGame();
    }
}
