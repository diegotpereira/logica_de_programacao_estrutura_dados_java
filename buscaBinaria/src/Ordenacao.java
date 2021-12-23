public class Ordenacao {
    
    public static void bolha(int numeros[]) {
        int x;

        for(int i = 1; i < numeros.length; i++) {
            for(int j = numeros.length -1; j >= i; j--) {
                if (numeros[j-1] > numeros[j]) {
                    if (numeros[j-1] > numeros[j]) {
                        x = numeros[j-1];
                        numeros[j-1] = numeros[j];
                        numeros[j] = x;
                    }
                }
            }
        }
    }
}
