package ar.com.xeven;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        /*
        1) Hacer un sistema que simule el lanzamiento de un dado.
        Se debe mostrar por pantalla el valor de la cara que queda en la parte superior.
         */
        Random aleatorio = new Random();
        int dado = aleatorio.nextInt(6)+1;
        System.out.println("Valor dado: "+dado);

        /*
        3) Crear un sistema que genere números aleatorios de 3 cifras y guardarlos en un conjunto,
         sin repeticiones. Preguntar al usuario la cantidad de números que desea guardar,
         generarlos y luego mostrarlos en pantalla.
         */
        Scanner sc = new Scanner(System.in);
        int cantidad;
        do{
            System.out.print("Cantidad de números de 3 cifras: ");
            cantidad = sc.nextInt();
            System.out.println("");
        }while(cantidad<0 || cantidad>999);

        IntStream numeros = aleatorio.ints(100,1000);
        Set<Integer> unSetDeNumerosEnteros = new HashSet<>();

        Iterator iteradorNumeros = numeros.filter(n->n>500).map(numero -> numero*10).distinct().iterator();

        while(iteradorNumeros.hasNext() && unSetDeNumerosEnteros.size() < cantidad)
            unSetDeNumerosEnteros.add((int) iteradorNumeros.next());

        unSetDeNumerosEnteros.forEach(n -> System.out.println("Número: "+n));
    }
}
