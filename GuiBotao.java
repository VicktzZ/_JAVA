import javax.swing.ImageIcon;

import javafx.event.ActionEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class GuiBotao {
    private JButton btMensagem, btTeimoso;
    private ImageIcon imagemIcone;

    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(null);
        imagemIcone = new ImageIcon("icones/java.png");
        btMensagem = new JButton("Mensagem", imagemIcone);
        btMensagem.setBounds(50, 10, 180, 55);
        btMensagem.setMensagem.Mnemonic(KeyEvent.VK_M);
        btTeimoso = new JButton("Teimoso");
        btTeimoso.setBounds(50, 70, 100, 25);
        add(btMensagem);
        add(btTeimoso);
    }

    public void definirEventos() {
        btMensagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Mensagem");
            }
        });

        btTeimoso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão Teimoso!");
            }
        });

        btTeimoso.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                btTeimoso.setBounds(50, 120, 100, 25);
            }

            public void mouseExited(MouseEvent e) {
                btTeimoso.setBounds(50, 70, 100, 25);
            }
        });
    }
}
