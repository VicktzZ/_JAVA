import java.awt.event.*;
import java.swing.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class GuiRadio extends JPanel {
    private JLabel lbSexo;
    private JButton btVerificar;
    private JRadioButton rbMasculino, rbFeminino;
    private ButtonGroup buttonGroup;

    public GuiRadio() {
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes() {
        setLayout(null);
        
        btVerificar = new JButton("Verificar");
        rbMasculino = new JRadioButton("Masculino");
        lbSexo = new Jlabel("Selecione o sexo:");
        rbFeminino = new JRadioButton("Feminino");
        buttonGroup = new JRadioButton("Feminino");
        btVerificar.setBounds(55, 105, 100, 20);
        rbMasculino.setBounds(55, 45, 100, 25);
        lbSexo.setBounds(55, 10, 105, 30);
        rbFeminino.setBounds(55, 70, 100, 25);
        rbMasculino.setSelected(true);
        add(btVerificar);
        add(rbMasculino);
        add(lbSexo);
        add(rbFeminino);
    }

    public void definirEventos(){
        btVerificar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                if(rbMasculino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Masculino selecionado");
                }else if (rbFeminino.isSelected()) {
                  JOptionPane.showMessageDialog(null, "Feminino selecionado");
                };
            }
        });
    }
}
