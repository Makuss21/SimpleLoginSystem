import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel label1 = new JLabel();

    WelcomePage(String username) {

        label1.setBounds(0,0,200,40);
        label1.setFont(new Font("MV Boli", Font.BOLD, 20));
        label1.setText("Welcome " + username);

        frame.add(label1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
