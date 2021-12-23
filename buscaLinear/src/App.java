import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa em Java para busca linear de strings.
        int opcao;
        int qte;
        int x;
        String num;
        boolean ok;
        boolean achou;

        try {
            
            do {
                num = JOptionPane.showInputDialog(
                    "Que tipo deseja usar?\n" + 
                    "1 - Números Inteiros\n" +
                    "2 - Palavras\n");

                opcao = Integer.parseInt(num);

                switch (opcao) {
                    case 1:
                        num = JOptionPane.showInputDialog(
                            "Quantos números?");

                        qte = Integer.parseInt(num);
                        int numeros[] = new int[qte];

                        for(int i = 0; i < qte; i++) {

                            num = JOptionPane.showInputDialog(
                                "Número[" + i + "]");

                            numeros[i] = Integer.parseInt(num);
                        }

                        num = JOptionPane.showInputDialog(
                            "Qual o número deseja pesquisar?");

                        x = Integer.parseInt(num);
                        achou = Busca.linear(x, numeros);

                        if (achou) 
                            JOptionPane.showMessageDialog(null,
                                "Número presente na relação");
                         else 
                            JOptionPane.showMessageDialog(null, 
                            "Número não presente na relação");

                            ok = true;
                            break;


                     case 2:
                        num = JOptionPane.showInputDialog(
                            "Quantas palavras?");

                        qte = Integer.parseInt(num);

                        String palavras[] =  new String[qte];

                        for(int i = 0; i < qte; i++) {

                            num = JOptionPane.showInputDialog(
                                "Palavra[" + i + "]");

                            palavras[i] = num.toUpperCase();
                        }

                        num = JOptionPane.showInputDialog(
                            "Qual a palavra deseja pesquisar?");

                        achou = Busca.linear(num, palavras);

                        if (achou) 
                            
                            JOptionPane.showMessageDialog(null,
                                    "Palavra presente na relação");

                        else
                        JOptionPane.showMessageDialog(null,
                        "Palavra não presente na relação");             

                            ok = true;
                            break;
                    default:
                    JOptionPane.showMessageDialog(null,
                               "Opção Inválida!\n" + 
                               "Tente Novamente.");

                        ok = false;
                }
            } while (!ok);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                     "Ocorreu um erro durante a leitura!");
        }
    }
}
