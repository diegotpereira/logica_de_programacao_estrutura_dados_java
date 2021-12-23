import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler um número fornecido pelo usuário e calcular o fatorial.
        int numero;
        int fat;

        numero = Integer.parseInt(JOptionPane.showInputDialog(
            "Qual é o número"));

        fat = fatorial(numero);

        JOptionPane.showMessageDialog(
            null, "O fatorial de " + numero + 
            " é " + fat);
    }

    static int fatorial (int numero) {
        int f = 1;

        for(int i = 1; i <= numero; i++) 

            f = f* i;

            return f;
        
    }
}
