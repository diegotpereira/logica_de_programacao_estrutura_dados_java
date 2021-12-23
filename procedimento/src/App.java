import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Implementação em Java do procedimento do Exemplo 7.1 
        // para realizar a operação de
        // adição entre dois valores, sem a passagem de parâmetros
        double v1;
        double v2;
        double res;

        v1 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro valor"));

        v2 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor"));

        res = v1 + v2;

        JOptionPane.showMessageDialog(
            null, "Soma = " + res);
    }
}
