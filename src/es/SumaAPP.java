package es;
/**
 * App
 * @author Daniel Tajuelo <danieltajuelo@gmail.com>
 */
public class SumaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Declaramos la matriz bidimensional       
        int matriz1[][], matriz2[][], resultado[][];
        int fxc;
        
        fxc=Utilidades.pedirValor();
        //Rellenamos las matrices con el número que hemos pedido por teclado
        matriz1 = new int[fxc][fxc];
        matriz2 = new int[fxc][fxc];
        resultado = new int[fxc][fxc];

        System.out.println("Rellenemos tus matrices...");
        Thread.sleep(2000);
        //Rellenamos las dos matrices
        Utilidades.rellenarMatriz1(matriz1);
        Utilidades.rellenarMatriz2(matriz2);
        System.out.println("Mostrando el resultado...");
        Thread.sleep(2000);
        //Sumamos las dos matrices y las pasamos a una
        resultado = Utilidades.sumaMatrices(matriz1, matriz2, resultado);
  
        //Mostramos las dos matrices anteriores y su resultado
        System.out.println("Tu primera matriz era: ");
        Utilidades.mostrarMatriz1(matriz1);
        Thread.sleep(2000);
        System.out.println("Y tu segunda matriz era: ");
        Utilidades.mostrarMatriz2(matriz2);
        Thread.sleep(2000);
        Utilidades.LimpiarConsola();
        Thread.sleep(20);
        System.out.println("Tu resultado es: ");
        Utilidades.mostrarResultado(resultado);
        Thread.sleep(5000);

    }

}
