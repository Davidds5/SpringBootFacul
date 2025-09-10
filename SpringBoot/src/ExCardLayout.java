import java.awt.*;

public class ExCardLayout {
    public static void main(String[] args) {

        Frame minhaJanela = new Frame("Exemplo de Card layout");

        Button bt1 = new Button("Menu1");
        Button bt2 = new Button("Menu2");
        Button bt3 = new Button("Menu3");
        Button bt4 = new Button("Menu4");
        Button bt5 = new Button("Menu5");
        Button bt6 = new Button("Menu6");

        minhaJanela.setSize(600, 400);
        minhaJanela.setLocation(200,200);

        CardLayout layout = new CardLayout();
        minhaJanela.setLayout(layout);

        minhaJanela.add(bt1, "BT1");
        minhaJanela.add(bt2, "BT2");
        minhaJanela.add(bt3, "BT3");
        minhaJanela.add(bt4, "BT4");
        minhaJanela.add(bt5, "BT5");
        minhaJanela.add(bt6, "BT6");

        layout.show(minhaJanela, "BT1");
        minhaJanela.setVisible(true);

    }
}
