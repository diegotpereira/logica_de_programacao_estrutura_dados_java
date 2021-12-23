import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int A;
        int B;
        int C;

        A = Integer.parseInt(JOptionPane.
        showInputDialog("Lado A"));

        B = Integer.parseInt(JOptionPane.
        showInputDialog("Lado B"));

        C = Integer.parseInt(JOptionPane.
        showInputDialog("Lado C"));

        if (A != 0 && B != 0 && C != 0) {
            
            if (A + B > C && A + C > B && B + C > A) {
                
                if (A != B && A != C && B != C) {
                    
                    JOptionPane.showMessageDialog(
                        null, "Escaleno");
                } else {

                    if (A == B && B == C) {
                        
                        JOptionPane.showMessageDialog(
                            null, "Equilatero");
                    } else {

                        JOptionPane.showMessageDialog(
                            null, "Isósceles");
                    }
                }
            }
            else {

                JOptionPane.showMessageDialog(
                            null, "Não forma um triângulo");
            }
        } else {

            JOptionPane.showMessageDialog(
                            null, "Não forma um triângulo");
        }
    } 
}
