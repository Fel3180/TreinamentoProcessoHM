package AED;

public  class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] vetor = { 20, 40, 30, 60, 50 };
		insertionSort(vetor);
	}
	
	/**
	 * Algoritmo de ordenação por inserção se baseia em ordenar da esquerda para
	 * a direita
	 * 
	 * @param vetor
	 */
	private static void insertionSort(int[] vetor) {
		int i;
		int j;
		int k;

		for (j = 1; j < vetor.length; j++) {
			System.out.println("j=" + j);
			k = vetor[j];
			System.out.println("k=" + k);
			for (i = j - 1; (i >= 0 && vetor[i] > k); i--) {
				System.out.println("i=" + i);
				vetor[i + 1] = vetor[i];
				System.out.println("Vetor=" + vetor[i]);
			}
			vetor[i + 1] = k;

			System.out.print("Vetor_Final=");
			for (int k1 : vetor) {
				System.out.print(k1 + "-");
			}
			System.out.println("");
		}
	}
}
