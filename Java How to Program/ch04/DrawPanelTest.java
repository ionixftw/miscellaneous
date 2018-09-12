import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanelTest {
    public static void main( String[]  args) {
        DrawPanel drawPanel = new DrawPanel();
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(drawPanel);
        jFrame.setSize(900, 900);
        jFrame.setVisible(true);
    }
    
}
class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        for ( int i = 0; i <= width; i+= 30) {
            // Pattern 1
            g.drawLine(0, 0, i, height - i);
            g.drawLine(width, height, i, height - i);
            g.drawLine(width, 0, i, i);
            g.drawLine(0, height, i, i);

            // Pattern 2
            g.drawLine(0, i, i, height);
            g.drawLine(i, height, width, height - i);
            g.drawLine(width, height - i, width - i, 0);
            g.drawLine(width - i, 0, 0, i);

            // Pattern 3
            g.drawLine(0, i, width, i);
            g.drawLine(i, 0, i, height);

            // Pattern 4
            g.drawLine(width - i, 0, width, i);
            g.drawLine(i, 0, 0, i);
            g.drawLine(0, i, width - i, height);
            g.drawLine(i, height, width, i);
        }
    }
}