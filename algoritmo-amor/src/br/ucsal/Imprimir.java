
package br.ucsal;

public class Imprimir {

	public static void str (String str) {
		System.out.println(str);
	}

	public static void inteiro (int inteiro) {
		System.out.println(inteiro);
	}

	public static void arr (String[][] arr) {

		for (int i = 0;  i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
