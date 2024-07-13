import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("snake");
        frame.setVisible(true);//set the frame so that it is visible
        frame.setSize(boardWidth,boardHeight);//set the window size as 600x600
        frame.setLocationRelativeTo(null);//set the dow in middle of the screen
        frame.setResizable(false); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminates when user clicks on the cross button;
        

        SnakeGame snakegame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakegame);
        frame.pack(); 
        snakegame.requestFocus();
    }
}
