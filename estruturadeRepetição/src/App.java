import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float numero;
        float media;
        float soma;
        int cont;

        cont = 0;
        soma = 0f;

        while(cont < 850) {

            numero = Float.parseFloat(JOptionPane.
            showInputDialog("Digite o número: "));

            soma = soma + numero;

            cont = cont + 1;
        }

        media = soma / cont;

        JOptionPane.showMessageDialog(
            null, "A média é" + 
            media);
    }
}
