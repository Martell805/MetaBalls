import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MBPanel extends JPanel implements ActionListener {

    final int WIDTH = 500;
    final int HEIGHT = 500;
    Timer timer;
    MetaBallHandler metaBallHandler;

    MBPanel(){
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        metaBallHandler = new MetaBallHandler(WIDTH, HEIGHT);
        for(int q = 0; q < 20; q++)
            metaBallHandler.createRandomBall();

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        for(int q = 0; q < WIDTH; q++)
            for(int w = 0; w < WIDTH; w++){
                if(metaBallHandler.reverseDistance(q, w) <= 10)
                    g2d.setColor(new Color(0, 0, 0));
                else
                    g2d.setColor(new Color(255, 255, 255));
                g2d.drawLine(q, w, q, w);
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        metaBallHandler.update();
        repaint();
    }
}
