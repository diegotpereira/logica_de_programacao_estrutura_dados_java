import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float numero;
        float media;
        float soma;
        int cont;

        cont = 0;
        soma = 0f;

        for(cont = 0; cont < 3; cont ++) {

            numero = Float.parseFloat(JOptionPane.
            showInputDialog("Digite o número: "));

            soma = soma + numero;
        }

        media = soma / cont;
        
        JOptionPane.showMessageDialog(
            null, "A média é " + media);
    }
}
