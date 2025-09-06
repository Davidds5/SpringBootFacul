import java.awt.*;
import java.awt.event.*;

public class ComponentesAWT extends Frame implements  WindowListener {

    private Button botao = new Button("Clique aqui");

    private Checkbox checkbox = new Checkbox("Selecione esta caixa");

    private CheckboxGroup checkboxGroup = new CheckboxGroup();

    private Choice choice = null;

    private List list = null;

    private Label label = new Label("Digite seu nome: ");

    private TextField UsuarioDigitando = new TextField();

    private TextArea EditTexto = new TextArea("");

    private Panel panel1 = new Panel();

    private Panel panel2 = new Panel();

    static public void main(String[] args) {
        ComponentesAWT gui = new ComponentesAWT();
        gui.setSize(400, 300);
        gui.setVisible(true);
        gui.addWindowListener(gui);
    }
    ComponentesAWT(){
        super("Exemplo - Componentes AWT");

        choice = new Choice();
        choice.add("Segunda");
        choice.add("Terca");
        choice.add("Quarta");
        choice.add("Quinta");
        choice.add("Sexta");

        list = new List(3, false);
        list.add("Brasil");
        list.add("Canada");
        list.add("Chile");
        list.add("Dinamarca");
        list.add("Espanha");

        panel1.setLayout(new GridLayout(1, 2, 3, 3));
        panel1.add(botao);
        panel1.add(list);
        panel1.add(EditTexto);

        Panel container1 = new Panel();
        container1.setLayout(new FlowLayout());
        container1.add(new Checkbox("inicinate", checkboxGroup, true));
        container1.add(new Checkbox("avancado", checkboxGroup, false));

        Panel container2 = new Panel();
        container2.setLayout(new GridLayout(2, 2));
        container2.add(checkbox);
        container2.add(container1);

        panel1.add(container2);

        panel2.setLayout(new BorderLayout(2, 2));
        panel2.add(label, BorderLayout.WEST);
        panel2.add(UsuarioDigitando, BorderLayout.CENTER);

        this.setLayout(new BorderLayout(2, 2));
        add(choice, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);
    }

    public void windowActivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e ){}

    public void windowClosing(WindowEvent e){
        System.exit(0);

    }

    public void windowDeactivated(WindowEvent e){}

    public void windowDeiconified(WindowEvent e){}

    public void windowIconified(WindowEvent e){}

    @Override
    public void windowOpened(WindowEvent e) {

    }
}
