import javax.swing.*;

public class GameDetails extends JFrame {

    GameDetails() {

        Panel panel = new Panel();
        this.add(panel);
        this.setTitle("The Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
