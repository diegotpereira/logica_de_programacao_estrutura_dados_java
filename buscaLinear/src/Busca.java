public class Busca {

    public static boolean linear(int x, int dados[]) {

        final int n = dados.length;

        for(int i = 0; i < n; i++) 

            if (x == dados[i]) 
                
                return true;

        return false;
    }

    public static boolean linear(String x,
    String dados[]) {

        final int n = dados.length;

        for(int i = 0; i < n; i++)
            if (x.equalsIgnoreCase(dados[i])) 

            return true;

        return false;
    }
    
}
