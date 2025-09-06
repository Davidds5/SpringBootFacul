import java.awt.*;
public class FlowLayout implements LayoutManager {
    public static void main(String[] args) {

        Frame minhaJanela = new Frame("Exemplo de Flow Layout");

        Button bt1 = new Button("Menu 1");
        Button bt2 = new Button("Menu 2");
        Button bt3 = new Button("Menu 3");
        Button bt4 = new Button("Menu 4");
        Button bt5 = new Button("Menu 5");

        // largura e altura
        minhaJanela.setSize(400, 600);

        minhaJanela.setLocation(200, 200);

        minhaJanela.setLayout(new FlowLayout());

        minhaJanela.add(bt1);
        minhaJanela.add(bt2);
        minhaJanela.add(bt3);
        minhaJanela.add(bt4);
        minhaJanela.add(bt5);

        minhaJanela.setVisible(true);
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {

    }
}
