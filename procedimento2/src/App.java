import javax.swing.JOptionPane;

public class App {

    static double v1;
    static double v2;
    static double res;
    public static void main(String[] args) throws Exception {
        // Elaborar um algoritmo que realize a operação 
        // aritmética escolhida pelo usuário, a saber:
        // adição, subtração, multiplicação ou divisão, 
        // entre dois valores fornecidos por ele, e 
        // apresentar uma mensagem com o resultado obtido. 
        // Criar um menu de opções para o usuário
        // no algoritmo principal e módulos com procedimentos 
        // para a realização das operações, conforme diagrama a seguir.
        int opcao;

        

        opcao = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha a sua opção:\n" + 
            "1 - Adição\n" + 
            "2 - Subtração\n" + 
            "3 - Multiplicação\n" + 
            "4- Divisão\n"));

        switch(opcao) {
            case 1: modAdicao(); break;
            case 2: modSubtracao(); break;
            case 3: modMultiplicacao(); break;
            case 4: modDivisao(); break;
            default: JOptionPane.showMessageDialog(
                null, "Fim do programa");
        }
    }

    static void modAdicao() {

        v1 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro valor"));

        v2 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor"));
            
        res = v1 + v2;

        JOptionPane.showMessageDialog(
            null, "Soma = " + res);
    }

    static void modSubtracao() {

        v1 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro valor"));

        v2 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor"));
            
        res = v1 - v2;

        JOptionPane.showMessageDialog(
            null, "Subtração = " + res);
    }

    static void modMultiplicacao() {

        v1 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro valor"));

        v2 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor"));
            
        res = v1 * v2;

        JOptionPane.showMessageDialog(
            null, "Multiplicação = " + res);
    }

    static void modDivisao() {

        v1 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o primeiro valor"));

        v2 = Double.parseDouble(JOptionPane.showInputDialog(
            "Digite o segundo valor"));
            
        res = v1 / v2;

        JOptionPane.showMessageDialog(
            null, "Divisão = " + res);
    }
}
