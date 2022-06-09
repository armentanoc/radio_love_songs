package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {

		int metodo; String trecho; String[][] estiloArr;

		metodo = escolhaInicial();

		if (metodo == 0) {
			faixaEtaria();
		} else {
			estiloArr = escolhaEstilo();
			trecho = escolhaTrecho();
			Playlist.pesquisa(trecho, estiloArr);
		}
	}

	/*Opção de Entrada*/

	public static int escolhaInicial () { 

		int metodo;
		Scanner sc = new Scanner(System.in);
		Imprimir.str("\n"
				+ "ALGORITMO DO AMOR");

		do {
			Imprimir.str("\nComo você quer encontrar a música do seu amor?"
					+ "\n(0) Faixa Etária;"
					+ "\n(1) Estilo Musical e Trecho da Música.");

			metodo = sc.nextInt();

			if(metodo !=  0 && metodo != 1) {
				Imprimir.str("Opção inválida. Tente novamente");
			}

		} while (metodo < 0 || metodo > 1);
		
		sc.close();
		return metodo;
	}

	/*Faixa etária + geração das músicas aleatoriamente*/

	public static void faixaEtaria () { 

		int faixaEtaria, estilo1, estilo2, estilo3;
		String [][] temp1, temp2, temp3;

		Scanner sc = new Scanner(System.in);

		do {
			Imprimir.str("\nQual a idade do seu amor?"
					+ "\n(0) 15 a 20 anos;"
					+ "\n(1) 21 a 25 anos;"
					+ "\n(2) 26 a 30 anos;"
					+ "\n(3) 31 a 35 anos;"
					+ "\n(4) 36 a 40 anos;"
					+ "\n(5) 40 a 60 anos;");

			faixaEtaria = sc.nextInt();

			if(faixaEtaria < 0 || faixaEtaria > 5) {
				Imprimir.str("Opção inválida. Tente novamente");
			}

		} while (faixaEtaria < 0 || faixaEtaria > 5);

		String faixaEtariaStr = faixaEtaria + "";

		Random rd = new Random();

		do {
			estilo1 = rd.nextInt(5);
			estilo2 = rd.nextInt(5);
			estilo3 = rd.nextInt(5);
		} while (estilo1 == estilo2 || estilo1 == estilo3 || estilo2 == estilo3);

		temp1 = Playlist.estiloMusical(estilo1);
		temp2 = Playlist.estiloMusical(estilo2);
		temp3 = Playlist.estiloMusical(estilo3);

		Playlist.musica(temp1, faixaEtariaStr);
		Playlist.musica(temp2, faixaEtariaStr);
		Playlist.musica(temp3, faixaEtariaStr);

		sc.close();

	}

	/*Estilo musical/categoria*/

	public static String[][] escolhaEstilo () { 

		int estiloEscolhido;
		String[][] temp;

		Scanner sc = new Scanner(System.in);

		do {
			Imprimir.str("\nQual o estilo musical favorito da pessoa amada?"
					+ "\n(0) Sertanejo;"
					+ "\n(1) MPB;"
					+ "\n(2) Rock;"
					+ "\n(3) Forró;"
					+ "\n(4) Pop;"
					+ "\n(5) Pagode.");

			estiloEscolhido = sc.nextInt();

			if(estiloEscolhido < 0 || estiloEscolhido > 5) {
				Imprimir.str("Opção inválida. Tente novamente");
			}

		} while (estiloEscolhido < 0 || estiloEscolhido > 5);

		temp = Playlist.estiloMusical(estiloEscolhido);

		sc.close();
		return temp;
	}

	/*String com o trecho escolhido*/

	public static String escolhaTrecho () { 

		Imprimir.str("\nQual o trecho da música que você deseja pesquisar?");
		Scanner sc = new Scanner(System.in);
		String escolhaTrecho = sc.nextLine();
		sc.close();
		return escolhaTrecho;
	}

}