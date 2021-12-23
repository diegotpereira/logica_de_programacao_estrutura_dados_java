import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // O objetivo deste exemplo é desenvolver um algoritmo 
        // que efetue a leitura de 10 elementos inteiros de 
        // um vetor Teste1 e construir um vetor Teste2 do mesmo 
        // tipo, observando a seguinte regra de formação: se o 
        // valor do índice for par, o valor do elemento
        // deverá ser multiplicado por 5; se for ímpar, deverá 
        // ser somado com 5. Ao fi nal, mostrar
        // o conteúdo dos dois vetores.
        int teste1[] = new int[10];
        int teste2[] = new int[10];

        String numero;

        try {
            
            for(int i = 0; i < teste1.length; i++) {

                numero = JOptionPane.showInputDialog(
                    "Digite o valor " + i + ":");

                teste1[i] = Integer.parseInt(numero);
            }

            for(int i = 0; i < teste1.length; i++) {

                if (i % 2 == 0) {
                    
                    teste2[i] = teste1[i] * 5;
                } else 

                teste2[i] = teste1[1] * 5;
            }

            System.out.printf("%s\n", "Resultado:");

            for(int i = 0; i < 10; i++) {

                System.out.printf("%s%d%s%d", 
                "teste1[", i, "] = ", teste1[i]);

                System.out.printf("%10s%d%s%d\n", 
                "teste2[", i, "]=", teste2[i]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura");
        }
    }
}
