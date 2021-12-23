import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Desenvolver um algoritmo que efetue a leitura de 
        // cinco elementos inteiros para um vetor
        // No fi nal, apresentar a soma de todos os elementos 
        // cujo valor seja ímpar.
        final int tamanho = 5;

        int A[] = new int [tamanho];
        int soma = 0;
        String numero;

        try {
            for(int i = 0; i < tamanho; i++) {

                numero = JOptionPane
                .showInputDialog("Digite o valor " 
                + i + ":");

                A[i] = Integer.parseInt(numero);
            }

            for(int i = 0; i < tamanho; i++) {

                if (A[i] % 2 != 0) {
                    
                    soma = soma + A[i];
                }

                JOptionPane.showMessageDialog(
                    null, "Soma dos impares = " + soma);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura!");
        }
    }
}
