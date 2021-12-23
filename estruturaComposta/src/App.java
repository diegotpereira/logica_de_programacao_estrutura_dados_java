import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float salario;
        float bonus;
        int tempo;

        salario = Float.parseFloat(JOptionPane.
        showInputDialog("Digite o sálario: "));

        tempo = Integer.parseInt(JOptionPane.
        showInputDialog("Digite o tempo de empresa: "));

        if (tempo >= 5) {
            bonus = salario * 0.20f;
        } else {
            bonus = salario * 0.10f;
        }
        
        JOptionPane.showMessageDialog(
            null, "O valor do bônus é: "
            + bonus);
    }
}
