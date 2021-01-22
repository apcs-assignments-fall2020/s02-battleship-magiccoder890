public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        // YOUR CODE HERE
        if (board[row][col] == true){
            System.out.print("There is a boat on that specific point, sorry!");
            return true;
        }
        else {
            System.out.print("There is no boat on that specific point.");
            return false;
        }
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        // YOUR CODE HERE
        if (direction.equals("right")){
            for (int column = 0; column < boatLength; column++){
                board[row][col + column] = true;
            }
        }
        if (direction.equals("down")){
            for (int roww = 0; roww < boatLength; roww++){
                board[row + roww][col] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        // YOUR CODE HERE
        int wrong_num = 0;
        for (int col = 0; col < words.length; col++){
            for (int row = 0; row < words[0].length -1 ; row++){
                if (!(words[col][row + 1].length() - words[col][row].length() > 0 && (int)words[col][row + 1].charAt(0) - (int)words[col][row].charAt(0) > 0)) {
                    wrong_num ++;
                }
                
        }
    }
    if (wrong_num > 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        // You can test your code here
    }
}
