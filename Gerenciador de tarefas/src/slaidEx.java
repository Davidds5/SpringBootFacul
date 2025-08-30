import java.awt.*;
import java.awt.event.*;

public class slaidEx extends Frame implements WindowListener {

    // botao
    private Button botao = new Button("Clique aqui");
    private Checkbox checkbox = new Checkbox("Selecione esta caixa");
    private CheckboxGroup grupoDeOp = new CheckboxGroup();
    private Choice choice = null;
    private List list = null;
    private Label label = new Label("Digite seu nome: ");
    private TextField nome = new TextField();
    private TextArea texto = new TextArea("");
    private Panel panel1 = new Panel();
    private Panel panel2 = new Panel();

    public static void main(String[] args) {
        slaidEx gui = new slaidEx();
        gui.setSize(400, 300);
        gui.setVisible(true);
        gui.addWindowListener(gui);
    }

    public slaidEx() {
        super("Exemplo - Componentes AWT");

        // inicializando um componente Choice
        choice = new Choice();
        choice.add("Segunda");
        choice.add("Terca");
        choice.add("Quarta");
        choice.add("Quinta");
        choice.add("Sexta");
        choice.add("Sabado");
        choice.add("Domingo");

        // inicializando um componente List
        list = new List(3, false);
        list.add("Brasil");
        list.add("Canada");
        list.add("Chile");
        list.add("Dinamarca");
        list.add("Espanha");

        panel1.setLayout(new GridLayout(2, 2, 3, 3));
        panel1.add(botao);
        panel1.add(list);
        panel1.add(texto);

        Panel container1 = new Panel();
        container1.setLayout(new FlowLayout());
        container1.add(new Checkbox("iniciante", grupoDeOp, true));
        container1.add(new Checkbox("avancado", grupoDeOp, false));

        Panel container2 = new Panel();
        container2.setLayout(new GridLayout(2, 1));
        container2.add(checkbox);
        container2.add(container1); // um container dentro de outro

        panel1.add(container2);

        panel2.setLayout(new BorderLayout(2, 3));
        panel2.add(label, BorderLayout.WEST);
        panel2.add(nome, BorderLayout.CENTER);

        this.setLayout(new BorderLayout(2,2 ));
        add(choice, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        add(panel1, BorderLayout.CENTER);
    }


    //executado quando a janela se torna ativa no contexto do gerenciador de janelas
    // do sistema operacional, ou seja a janela se torna o foco de interacao com
    // o usuario. Isto acontece no windowns quando uma janela e selecionada pelo usuario
    @Override public void windowActivated(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {
        //execuado apos o fechamento da janela
    }

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override public void windowOpened(WindowEvent e) {
    }
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
}
