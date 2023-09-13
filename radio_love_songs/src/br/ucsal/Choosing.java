package br.ucsal;

import java.util.Random;
import java.util.Scanner;

public class Choosing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = ageOrStyle(sc);
		 
		if (choice == 0) {
			ageRange(sc);
		} else {
			String[][] styleArr = chooseStyle(sc);
			String lyrics = chooseLyrics(sc);
			Playlist.search(lyrics, styleArr);
		}

	}

	/*Choose if you want age or style to begin with*/

	public static int ageOrStyle (Scanner sc) { 

		int choice = -1;
		Print.str("\n"
				+ "RADIO LOVE SONGS");
			Print.str("\nComo você quer encontrar a música do seu amor?"
					+ "\n(0) Faixa Etária;"
					+ "\n(1) Estilo Musical e Trecho da Música.");

		while (choice !=  0 && choice != 1) {
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				Print.str("Opção inválida. Tente novamente");
			}
		}
			
		return choice;
	}

	/*If you choose age, we will return three songs of three different styles for that age range*/

	public static void ageRange (Scanner sc) { 

		int ageRange = -1, style1, style2, style3;
		String [][] temp1, temp2, temp3;

		Print.str("\nQual a idade do seu amor?"
					+ "\n(0) 15 a 20 anos;"
					+ "\n(1) 21 a 25 anos;"
					+ "\n(2) 26 a 30 anos;"
					+ "\n(3) 31 a 35 anos;"
					+ "\n(4) 36 a 40 anos;"
					+ "\n(5) 40 a 60 anos;");

		while (ageRange <  0 || ageRange > 5) {
			try {
				ageRange = sc.nextInt();
			} catch (Exception e) {
				Print.str("Opção inválida. Tente novamente");
			}
		}

		Random rd = new Random();

		do {
			style1 = rd.nextInt(6);
			style2 = rd.nextInt(6);
			style3 = rd.nextInt(6);
		} while (style1 == style2 || style1 == style3 || style2 == style3);

		temp1 = Playlist.switchCaseStyle(style1);
		temp2 = Playlist.switchCaseStyle(style2);
		temp3 = Playlist.switchCaseStyle(style3);

		String ageRangeStr = String.valueOf(ageRange);
		Playlist.musica(temp1, ageRangeStr);
		Playlist.musica(temp2, ageRangeStr);
		Playlist.musica(temp3, ageRangeStr); 

	}

	/*Estilo musical/categoria*/

	public static String[][] chooseStyle (Scanner sc) { 

		int choosenStyle = -1;
		String[][] temp;

		Print.str("\nQual o estilo musical favorito da pessoa amada?"
							+ "\n(0) Sertanejo;"
							+ "\n(1) MPB;"
							+ "\n(2) Rock;"
							+ "\n(3) Forró;"
							+ "\n(4) Pop;"
							+ "\n(5) Pagode.");

		while (choosenStyle <  0 || choosenStyle > 6) {
			try {
				choosenStyle = sc.nextInt();
			} catch (Exception e) {
				Print.str("Opção inválida. Tente novamente");
			}
		}

		temp = Playlist.switchCaseStyle(choosenStyle);

		return temp;
	}

	/*String com o trecho escolhido*/

	public static String chooseLyrics (Scanner sc) { 

		String lyrics = "";

		Print.str("\nQual o trecho da música que você deseja pesquisar?");

		while(lyrics.equals("")) {
		try {
				lyrics = sc.nextLine();
			} catch (Exception e) {
				Print.str("Opção inválida. Tente novamente");
			}
		}

		return lyrics;
	}

}