import java.awt.*;

public class ExGridLayout {
    public static void main(String[] args) {
        Frame minhaJanela = new Frame("Exemplo de Grid Layout");

        Button bt1 = new Button("Menu1");
        Button bt2 = new Button("Menu2");
        Button bt3 = new Button("Menu3");
        Button bt4 = new Button("Menu4");
        Button bt5 = new Button("Menu5");
        Button bt6 = new Button("Menu6");

        minhaJanela.setSize(600, 400);
        minhaJanela.setLocation(200, 200);

        GridLayout layout = new GridLayout(2, 3);
        minhaJanela.setLayout(layout);

        minhaJanela.add(bt1);
        minhaJanela.add(bt2);
        minhaJanela.add(bt3);
        minhaJanela.add(bt4);
        minhaJanela.add(bt5);
        minhaJanela.add(bt6);

        minhaJanela.setVisible(true);
    }
}
