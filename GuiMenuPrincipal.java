import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GuiMenuPrincipal extends JFrame {
    private Container contentPane;    
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos(); 
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = get.contentPane();
        mnBarra = new JMenuBar();
        mnArquivo  = new JMenu("Menu");
        mnArquivo.setMnemonic("A");
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic("E");
        miSair = new JMenuItem("Sair", new ImageIcon("icones/sair.png"));
        miSair.setAccelerator(.getkeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        miBotao = new JMenuItem("Botao");
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        mi.Sair.addActionListener(new ActionListener() {
            public void actionPerformed()
        })
       
}