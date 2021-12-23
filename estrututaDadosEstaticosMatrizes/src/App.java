import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // Dada uma matriz de 6 linhas e 2 colunas de inteiros, 
        // calcular e exibir a média geométrica
        // dos valores de cada uma das linhas. A média geométrica 
        // é calculada pela seguinte expressão: SQRT (X1 * X2), 
        // que representa a raiz quadrada do resultado da multiplicação
        // dos elementos da coluna 1 (X1) pelos elementos da coluna 2 (X2).
        int G[][] = new int[6][2];
        double prod;
        String num;

        try {
            
            for(int i = 0; i < 6; i++) {

                for(int j = 0; j < 2; j++) {

                    num = JOptionPane.showInputDialog(
                        "Informar valor G " + i + ", " + j + ":");
                G[i][j] = Integer.parseInt(num);

                }
            }

            for(int i = 0; i < 6; i++) {

                prod = 1;

                for(int j = 0; j < 2; j++) {

                    prod = prod * G[i][j];
                }

                JOptionPane.showMessageDialog(
                    null, "Linha " + i + ": " + Math.sqrt(prod));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura!");
        }
    }
}
