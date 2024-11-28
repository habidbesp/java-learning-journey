import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Form extends JFrame{
    private JPanel mainPanel;
    private JTextField myTextField;
    private JLabel replicadorLabel;

    public Form(){
        initializeForm();

        // addActionListener listens for actions in the text field (e.g., pressing Enter).
        // When triggered, it calls the replicarTexto() method to handle the action.
//        myTextField.addActionListener(e -> {
//            replicarTexto();
//        });
        myTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void initializeForm(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // center the window
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(this.myTextField.getText());
    }

    public static void main(String[] args) {
        // FlatLightLaf - light mode
        FlatDarculaLaf.setup(); // dark mode
        Form form = new Form();
        form.setVisible(true);
    }

}
