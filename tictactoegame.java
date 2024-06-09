import java.util.*;
public class tictactoegame {
    public static void main(String[] args) {
        boolean gameOver = false;
        boolean numCheck = false;
        int comCurrentRowValue = 0;
        int comCurrentColumnValue = 0;
        String[][] board = {{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"},{"[ ]","[ ]","[ ]"}};
        System.out.println("Welcome to TicTacToe.  You will be playing against a computer.");
        System.out.println("You will be playing as X and the computer as O.");
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]); 
            }
            System.out.println(); 
        }
        Scanner main = new Scanner(System.in); 
        System.out.println("Your turn is first.");
        System.out.println("To start please say where you want to place your first X.");
        System.out.println("Start counting at 0.");
        System.out.println("The value of Row or Column should not exceed 2.");
        playerTurn(main, board);
        computerTurn(board, numCheck, comCurrentColumnValue, comCurrentRowValue);
        playerTurn(main, board);
        computerTurn(board, numCheck, comCurrentColumnValue, comCurrentRowValue);
        playerTurn(main, board);
        gameOver = check(board);
        if(gameOver==false){
            computerTurn(board, numCheck, comCurrentColumnValue, comCurrentRowValue);
        }
        if(gameOver == false){
            playerTurn(main, board);
        }
        gameOver = check(board);
        if(gameOver==false){
            computerTurn(board, numCheck, comCurrentColumnValue, comCurrentRowValue);
        }
        gameOver = check(board);
        if(gameOver==false){
            playerTurn(main, board);
        }
        gameOver = check(board);
        if(gameOver==false){
            System.out.println("Game is a draw!");
        }
        main.close();
    }
    static void playerTurn(Scanner main, String[][] board){
        System.out.println("Your turn!");
        System.out.println("Row value:");
        int currentRowValue = main.nextInt();
        System.out.println("Column value:");
        int currentColumnValue = main.nextInt();
        board[currentRowValue][currentColumnValue] = "[X]";
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]); 
            }
            System.out.println(); 
        }
    }
    static void computerTurn(String[][] board, boolean numCheck, int comCurrentColumnValue, int comCurrentRowValue){
        System.out.println("Computers turn!");
        while(numCheck == false){
            comCurrentRowValue = (int) (Math.random() * 3);
            comCurrentColumnValue = (int) (Math.random() * 3);
            if(board[comCurrentRowValue][comCurrentColumnValue]=="[X]" || board[comCurrentRowValue][comCurrentColumnValue]=="[O]"){
            }else{
                numCheck = true;
                board[comCurrentRowValue][comCurrentColumnValue]="[O]";
            }
        }
        numCheck = false;
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c]); 
            }
            System.out.println(); 
        }
    }
        static boolean check(String[][] board) {
                boolean playerWins = false;
                boolean computerWins = false;
                if (board[2][0].equals("[X]") && board[1][0].equals("[X]") && board[0][0].equals("[X]") ||
                    board[2][1].equals("[X]") && board[1][1].equals("[X]") && board[0][1].equals("[X]") ||
                    board[2][2].equals("[X]") && board[1][2].equals("[X]") && board[0][2].equals("[X]") ||
                    board[0][0].equals("[X]") && board[0][1].equals("[X]") && board[0][2].equals("[X]") ||
                    board[1][0].equals("[X]") && board[1][1].equals("[X]") && board[1][2].equals("[X]") ||
                    board[2][0].equals("[X]") && board[2][1].equals("[X]") && board[2][2].equals("[X]") ||
                    board[0][0].equals("[X]") && board[1][1].equals("[X]") && board[2][2].equals("[X]") ||
                    board[2][0].equals("[X]") && board[1][1].equals("[X]") && board[0][2].equals("[X]")) {
                    playerWins = true;
                }
                if (board[2][0].equals("[O]") && board[1][0].equals("[O]") && board[0][0].equals("[O]") ||
                    board[2][1].equals("[O]") && board[1][1].equals("[O]") && board[0][1].equals("[O]") ||
                    board[2][2].equals("[O]") && board[1][2].equals("[O]") && board[0][2].equals("[O]") ||
                    board[0][0].equals("[O]") && board[0][1].equals("[O]") && board[0][2].equals("[O]") ||
                    board[1][0].equals("[O]") && board[1][1].equals("[O]") && board[1][2].equals("[O]") ||
                    board[2][0].equals("[O]") && board[2][1].equals("[O]") && board[2][2].equals("[O]") ||
                    board[0][0].equals("[O]") && board[1][1].equals("[O]") && board[2][2].equals("[O]") ||
                    board[2][0].equals("[O]") && board[1][1].equals("[O]") && board[0][2].equals("[O]")) {
                    computerWins = true;
                }
                if (playerWins) {
                    System.out.println("You win!");
                    return true;
                }
                if (computerWins) {
                    System.out.println("Computer wins!");
                    return true;
                }
                return false;
            }
            
    
    }

        
        
        
        

    
