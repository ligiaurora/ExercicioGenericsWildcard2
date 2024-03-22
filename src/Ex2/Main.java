package Ex2;

import java.util.List;

public class Main {
	
	//Metodo para adicionar
    public static void adicionar(List<? super Integer> lista, Integer novo) {
        lista.add(novo);
    }

    public static void main(String[] args) {
       
        List<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        System.out.println("Numeros antes de adicionar um novo:");
        System.out.println(numeros + "");

        adicionar(numeros, 4);

        System.out.println("Lista de números após adicionar o novo número:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

   
}