package sumapares;

/**
 *
 * @author maryse
 *
 * Ciclo for
 * Suma de los M primeros números pares.
 *
 */
public class SumaPares {
 public  void Sum (){
    
        final int M = 12;
        int suma = 0;
        for (int n = 1; n <= M; n++) {
            suma += 2 * n;
        }
        System.out.println("La suma de los " + M
                + " primeros números pares: " + suma);
    }
 public static void main(String[] args) {
        SumaPares calcular = new SumaPares();
        calcular.Sum();
    }
}
