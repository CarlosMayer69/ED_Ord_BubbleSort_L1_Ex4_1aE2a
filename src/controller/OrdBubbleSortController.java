package controller;

import br.edu.fateczl.bubblesort.BubbleSort;

public class OrdBubbleSortController {

	public OrdBubbleSortController() {
		super();
	}

	public int[] ordenar(int[] vetor) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.bubbleSort(vetor);
	}
}
