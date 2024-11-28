import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel mainPanel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton sendButton;

    public LoginForm(){
        initializeForm();
        sendButton.addActionListener(e -> validation());
    }

    private void initializeForm(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void validation(){
        // read text fields values
        var user = this.userText.getText();
        var password = new String(this.passwordText.getPassword());
        if("root".equals(user) && "admin".equals(password))
            showMessage("User data successfully validated! Welcome!");
        else if ("root".equals(user))
            showMessage("Incorrect password");
        else
            showMessage("Incorrect user");
    }

    private void showMessage(String message){
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // changing look and feel to dark
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
