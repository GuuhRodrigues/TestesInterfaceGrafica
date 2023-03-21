import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteEvent implements ActionListener {

    private JButton botao;

    public void janela(){
        JFrame frame = new JFrame();
        botao = new JButton();

        //Registra o Evento
        botao.addActionListener(this);

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent evento){
        botao.setText("Botão foi clicado!");

        //Altera a fonte
        botao.setFont(new Font("SansSerif", Font.BOLD, 20));
    }

    public static void main(String[] args) {
        TesteEvent captura = new TesteEvent();
        captura.janela();
    }
}
