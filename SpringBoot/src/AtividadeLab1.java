import javax.swing.*;
import java.awt.*;

public class AtividadeLab1 extends javax.swing.JFrame {
    JPanel panel;
    JLabel labelNome;
    JTextField textField;

    public AtividadeLab1(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        labelNome = new JLabel("Nome");

        panel.add(labelNome);

        textField = new JTextField("Fernando");
        textField.setBackground(Color.BLUE);
        textField.setSelectedTextColor(Color.GREEN);
        textField.setForeground(Color.RED);

        panel.add(textField);

        this.getContentPane().add(panel);

        setTitle("Exemplo JFrame com JButtons");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AtividadeLab1();
    }
}
