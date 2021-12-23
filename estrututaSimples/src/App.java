import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;

        numero = Integer.parseInt(JOptionPane.
        showInputDialog("Digite um número: "));

        if (numero % 2 == 1) {
            JOptionPane.showMessageDialog(null, 
            "O número é impar.");
        } else {
            JOptionPane.showMessageDialog(null, 
            "O número é par.");
        }
    }
}
