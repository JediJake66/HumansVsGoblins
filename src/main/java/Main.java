import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class Main implements ActionListener {
    JFrame frame = new JFrame("Goblin Killen Island");
    JButton[][] grid;
    JTextArea textArea;
    public Main(int width,int length){

        frame.setLayout(new GridLayout(width,length));
        grid=new JButton[width][length];//allocate the size of grid
        for( int y=0; y<length; y++){
            for( int x=0; x<width; x++){
                grid[x][y]=new JButton("("+x+","+y+")");
                frame.add(grid[x][y]);//adds button to grid
                grid[x][y].addActionListener(this);
            }
        }
        textArea = new JTextArea(1,100 );
        frame.add(textArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setText(textArea.getText().concat("You have clicked a button\n "));
    }
    JPanel panel = new JPanel();

    public static void main(String[] args) {
        new Main(3,3);
    }
}
