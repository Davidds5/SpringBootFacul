import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class gerenciadorDeTarefas {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Gerenciador de Tarefas");

        /*Criacao de um modelo de lista para armazenar as tarefas.
        Dessa forma e possivel que a lista de tarefas sejam atualizadas
        de forma dinamica.
         */

        DefaultListModel<String> taskListModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(taskListModel);

        JTextField taskTextField = new JTextField(20);
        JButton addButton = new JButton("Adicionar Tarefa");
        JButton removerButton = new JButton("Remover tarefa");

        addButton.addActionListener(e -> {
            String task = taskTextField.getText();
            taskListModel.addElement(task);
            taskTextField.setText("");
        });
        removerButton.addActionListener(e -> {
            int selectedIndex  = taskList.getSelectedIndex();
            if(selectedIndex != 1){
                taskListModel.remove(selectedIndex);
            }
        });
        JPanel controlPanel = new JPanel();
        controlPanel.add(taskTextField);
        controlPanel.add(addButton);
        controlPanel.add(removerButton);

        jFrame.setLayout(new BorderLayout());
        jFrame.add(new JScrollPane(taskList), BorderLayout.CENTER);
        jFrame.add(controlPanel, BorderLayout.SOUTH);

        jFrame.setSize(400, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }


}
