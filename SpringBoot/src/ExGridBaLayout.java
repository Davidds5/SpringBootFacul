import java.awt.*;

public class ExGridBaLayout extends Frame {
        private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
        public void AdicionarItem(int Linha, int Coluna, int Largura, int Altura, int Escalarx, int Escalary,
                                  Component component){
            GridBagConstraints itemGrade = new GridBagConstraints();
            itemGrade.gridx = Coluna;
            itemGrade.gridy = Linha;
            itemGrade.gridwidth = Largura;
            itemGrade.gridheight = Altura;
            itemGrade.weightx = Escalarx;
            itemGrade.weighty = Escalary;
            
        }
        public void ExecutarGrid(){
            bt1 = new Button("Botao 1");
            bt2 = new Button("Botao 2");
            bt3 = new Button("Botao 3");
            bt4 = new Button("Botao 4");
            bt5 = new Button("Botao 5");
            bt6 = new Button("Botao 6");
            bt7 = new Button("Botao 7");
            bt8 = new Button("Botao 8");
            setSize(500,300);
            setLocation(200, 200);
            setLayout(new GridBagLayout());
            AdicionarItem(0, 0, 4, 1, 0, 0, bt1);
            AdicionarItem(1, 0, 1 , 1, 0, 0, bt2);
            AdicionarItem(1, 1, 1, 1, 0, 0, bt3);
            AdicionarItem(1, 2, 1, 1, 0, 0, bt4);
            AdicionarItem(1 ,2 ,1, 1 , 0, 0, bt5);
            AdicionarItem(2, 0, 1, 1 ,0, 1, bt6);
            AdicionarItem(3, 0, 1, 1 ,0 ,1, bt7);
            AdicionarItem(2, 1, 3 ,4 ,1 ,1, bt8);
            setVisible(true);
            setTitle("Exemplo GridBaLayout");


        }
}
