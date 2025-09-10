import java.awt.*;

public class BordLayout {
    public static void main(String[] args) {
        Frame minhaJanela = new Frame("Exemplo de Bord Layout");

        Button bt1 = new Button("Menu1");
        Button bt2 = new Button("Menu2");
        Button bt3 = new Button("Menu3");
        Button bt4 = new Button("Menu4");
        Button bt5 = new Button("Menu5");

        minhaJanela.setSize(600, 400);
        minhaJanela.setLocation(200, 200);

        BorderLayout layout = new BorderLayout();
        minhaJanela.setLayout(layout);

        minhaJanela.add(bt1, BorderLayout.NORTH);
        minhaJanela.add(bt2, BorderLayout.WEST);
        minhaJanela.add(bt3, BorderLayout.SOUTH);
        minhaJanela.add(bt4, BorderLayout.EAST);
        minhaJanela.add(bt5, BorderLayout.CENTER);

        minhaJanela.setVisible(true);
    }

}
