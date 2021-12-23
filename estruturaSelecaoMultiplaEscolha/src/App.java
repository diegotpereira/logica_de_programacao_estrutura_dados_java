import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int codigo;

        codigo = Integer.parseInt(JOptionPane.
        showInputDialog("Digite o código: "));

        switch(codigo) {

            case 001: JOptionPane.showMessageDialog(
                null, "Caderno");
                break;
                
            case 002: JOptionPane.showMessageDialog(
                null, "Lápis");
                break;

            case 003: JOptionPane.showMessageDialog(
                null, "Borracha");
                break;

            default: JOptionPane.showMessageDialog(
                null, "Diversos");    
        }
    }
}
