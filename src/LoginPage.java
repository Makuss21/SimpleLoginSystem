import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame loginFrame = new JFrame("Login Page");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String,String> logininfo1 = new HashMap<String,String>();

    LoginPage(HashMap<String,String> logininfo){

        logininfo1 = logininfo;

        userIdLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(100,300,350,35);
        messageLabel.setFont(new Font("MV Boli",Font.BOLD,25));

        usernameField.setBounds(125,100,150,25);
        passwordField.setBounds(125,150,150,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);

        resetButton.setBounds(250,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        loginFrame.add(userIdLabel);
        loginFrame.add(passwordLabel);
        loginFrame.add(messageLabel);
        loginFrame.add(usernameField);
        loginFrame.add(passwordField);
        loginFrame.add(loginButton);
        loginFrame.add(resetButton);

        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setSize(500,500);
        loginFrame.setResizable(false);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loginButton){
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if(logininfo1.containsKey(username)){
                if(logininfo1.get(username).equals(password)){

                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("You are logged in!");

                    WelcomePage welcomePage = new WelcomePage(username);

                        loginFrame.dispose();
                }
                else{
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Credentials does not match!");
                }

            }
            else{
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Username does not exist!");
            }

        }

        else if(e.getSource() == resetButton){
            usernameField.setText("");
            passwordField.setText("");
        }

    }
}
