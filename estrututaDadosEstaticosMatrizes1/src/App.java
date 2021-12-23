import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Média dos alunos de uma disciplina. Considere uma 
        // matriz de 10 linhas e 3 colunas.
        // Cada linha está associada a um aluno, e as colunas 
        // estão associadas às notas das provas referentes 
        // àquele estudante. O procedimento a seguir escreve 
        // a média de cada estudante e a média da turma em cada prova.
        final int nProvas = 3;
        final int nAlunos = 10;

        

        float NotaProva[][] = new float [nAlunos][nProvas];
        float MedAlunos[] = new float[nAlunos];
        float MedProvas[] = new float[nProvas];

        float Soma;
        String num;

        try {
            
            for(int i = 0; i < nAlunos; i++) {
                
                Soma = 0;

                for(int j = 0; j < nProvas; j++) {

                    num = JOptionPane.showInputDialog(
                        null, "Entre com a nota do aluno-" + 
                        " Prova-" + j);

                    NotaProva[i][j] = Float.parseFloat(num);
                    Soma = Soma + NotaProva[i][j];    
                }

                MedAlunos[i] = Soma / nProvas;
            }

            for(int j = 0; j < nProvas; j++) {

                Soma = 0;

                for(int i = 0; i < nAlunos; i++) {

                    Soma = Soma + NotaProva[i][j];
                }

                MedProvas [j] = Soma / nAlunos;
            }

            for(int i = 0; i < nAlunos; i++) {

                JOptionPane.showMessageDialog(
                    null, "Média do aluno-" + i + ":" + 
                    MedAlunos[i]);
            }

            for(int i = 0; i < nProvas; i++) {
                JOptionPane.showMessageDialog(
                    null, "Média da Prova--" + i + ": " + 
                    MedProvas[i]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro durante a leitura!");
        }
        
    }
}
