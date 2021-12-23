import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            float vetor[] = new float[10];

            float  media;
            float soma;

            media = 0;
            soma = 0;

            String num;

            for(int i = 0; i < vetor.length; i++) {

                num = JOptionPane.showInputDialog(
                    "Digite o valor " + i + ":");

                vetor[i] = Float.parseFloat(num);

                soma = soma + vetor[i];
            }

            media = soma/vetor.length;

            JOptionPane.showMessageDialog(
                null, "Media: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura!");
        }
    }
}
