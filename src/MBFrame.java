import javax.swing.*;

public class MBFrame extends JFrame {
    MBPanel mbPanel;

    MBFrame(){
        mbPanel = new MBPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mbPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
