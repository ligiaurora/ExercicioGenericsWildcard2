package Ex1;

import java.util.List;

public class Main {
 
	//Metodo para imprimir as listas
    public static void imprimirL(List<?> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        List<Integer> i = List.of(1, 2, 3, 4, 5);
        List<String> s= List.of("aaaa", "bbb", "ccc");
        List<Double> d = List.of(1.5, 2.5, 3.5);

        System.out.println("Lista de Inteiro:");
        imprimirL(i);

        System.out.println("Lista de String:");
        imprimirL(s);

        System.out.println("Lista de Double:");
        imprimirL(d);
    }
}