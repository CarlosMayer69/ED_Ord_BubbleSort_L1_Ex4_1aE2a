package view;

import controller.OrdBubbleSortController;

public class Principal {

	public static void main(String[] args) {
		
		OrdBubbleSortController controller = new OrdBubbleSortController();
        int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};//Exercício 1a
        //int[] vetor = {44, 43, 42, 41, 40, 39, 38};//Exercício 2a
        vetor = controller.ordenar(vetor);
        
        System.out.println(" ");
        System.out.println("=============================");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println(" ");
        System.out.println("=============================");
	}    
}
