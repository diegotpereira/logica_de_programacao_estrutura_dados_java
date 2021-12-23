import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Busca binária (ou logarítmica).
        int qte;
        int x;
        boolean achou;
        String num;

        try {
            
            num = JOptionPane.showInputDialog(
                "Quantos números?");

            qte = Integer.parseInt(num);

            int numeros[] = new int[qte];

            for(int i = 0; i < qte; i++) {

                num = JOptionPane.showInputDialog(
                    "Número[" + i + "]");

                numeros[i] = Integer.parseInt(num);
            }

            Ordenacao.bolha(numeros);
            num = JOptionPane.showInputDialog(
                "Qual o número deseja pesquisar?");
            x = Integer.parseInt(num);
            achou = BuscaBinaria.binaria(x, numeros);

            if(achou)
               JOptionPane.showMessageDialog(null,
                   "Número presente na relação");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Ocorreu um erro durante a leitura");
        }
    }
    public static void bolha(String palavras[]) {
        String x;

        for(int i = 1; i < palavras.length; i++) {
            for(int j = palavras.length - 1; j >= i; j--) {
                if (palavras[j-1].compareTo(palavras[j]) > 0) {
                    
                    x= palavras[j-1];
                    palavras[j-1] = palavras[j];
                    palavras[j] = x;
                }
            }
        }
    }
}

