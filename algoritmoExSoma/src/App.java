import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int valor1;
        int valor2;
        int soma;

        valor1 = Integer.parseInt(JOptionPane
        .showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane
        .showInputDialog("Digite o segundo valor: "));

        soma = valor1 + valor2;

        JOptionPane.showMessageDialog(null, 
        "Resultado " + soma);
    }
}
