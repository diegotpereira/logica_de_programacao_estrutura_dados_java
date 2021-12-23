import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;

        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
    }
}
