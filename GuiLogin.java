import javax.swing.*;
import javafx.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event;

public class GuiLogin extends JFrame {
    private JTextField tfLogin;
    private JLabel lbSenha;
    private JLabel lbLogin;
    private JButton btLogar;
    private JButton btCancelar;
    private JPasswordField pfSenha;
    private static GuiLogin frame;

    public GuiLogin()
    {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes()
    {
        setTitle("Login no Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        
        tfLogin = new JTextField(5);
        lbLogin = new JLabel("Login: ");
        btLogar = new JButton("Logar: ");
        lbSenha = new JLabel("Senha: ");
        pfSenha = new JPasswordField(5);

        tfLogin.setBounds(100, 30, 120, 25);
        lbLogin.setBounds(30, 30, 80, 25);
        lbSenha.setBounds(30, 75, 80, 25);
        pfSenha.setBounds(100, 75, 120, 25);
        btLogar.setBounds(125, 120, 100, 25);
        btCancelar.setBounds(125, 120, 100, 25);

        add(tfLogin);
        add(lbSenha);
        add(lbLogin);
        add(btLogar);
        add(btCancelar);
        add(pfSenha);
        
        btCancelar = new JButton("Cancelar: ");
        frame = new JPasswordField();
    }

        private void definirEventos()
        {
            btLogar.addActionListener(new ActionListener(){
                public void actionPerfomed(ActionEvent e)
                {
                    String senha = String.valueOf(pfSenha.getPassword());

                    if (tfLogin.getText().equals("java") && senha.equals("java")){
                        frame.setVisible(false);
                        // GuiMenuPrincipal.abrir()
                    } else {
                        JOptionPane.showMessageDialog(null, "Login ou Senha incorreta.");
                    }
                }
            });

            btCancelar.addActionListener(new ActionListener(){
                public void actionPerfomed(ActionEvent e){
                    System.exit(0);
                }
            });
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable(){
                public void run()
                {
                    frame = new GuiLogin();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation((tela.width - frame.getSize().width/2), (tela.height - frame.getSize().height / 2));
                    frame.setVisible(true);
                }
            });
        }
}
