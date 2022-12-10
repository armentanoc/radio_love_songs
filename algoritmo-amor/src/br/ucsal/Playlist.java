package br.ucsal;

import java.util.Random;

public class Playlist {

	public static String[][] sertanejo() {

		String[][] sertanejo = new String[7][2];

		sertanejo[0][0] = "\nSe for amor > João Gomes"
				+ "\nÔ, se aí existe amor, se for amor"
				+ "\nVocê vai esperar o meu coração curar"
				+ "\nÔ, se aí existe amor, se for amor"
				+ "\nVocê vai esperar o meu coração curar"
				+ "\nPra te amar\n";
		sertanejo[0][1] = "1";
		sertanejo[1][0] = "\nEu tenho medo > Ze Vaqueiro"
				+ "\nTenho medo de alguém me machucar"
				+ "\nEu tenho medo de me entregar"
				+ "\nEu 'to com medo de me apaixonar"
				+ "\nE outra pessoa querer me usar\n";
		sertanejo[1][1] = "2";
		sertanejo[2][0] = "\nSe mordendo de raiva > Xand Avião"
				+ "\nQuem disse que era só mais um lancinho"
				+ "\nDe uma semana não passava"
				+ "\nTá se mordendo de raiva"
				+ "\nTá se mordendo de raiva"
				+ "\nQuem torceu contra nós dois"
				+ "\nTomou na cara\n";
		sertanejo[2][1] = "4";
		sertanejo[3][0] = "\nBebe e vem me procurar > Saia Rodada"
				+ "\nMas tá sentindo falta da cama amarrotada"
				+ "\nDas roupas pela casa"
				+ "\nDo cheiro de amor no ar"
				+ "\nO cheiro de amor no ar"
				+ "\nCaiu na madrugada e viu que tava errada"
				+ "\nTá desesperada"
				+ "\nLouca pra me encontrar"
				+ "\nEntão bebe e vem me procurar\n";
		sertanejo[3][1] = "3";
		sertanejo[4][0] = "\nApaixonadinha > Marilia Mendonça"
				+ "\nApaixonadinha você me deixou"
				+ "\nApaixonadinha você me deixou"
				+ "\nApaixonadinha você me deixou"
				+ "\nVem ficar perto da sua menina\n";
		sertanejo[4][1] = "1";
		sertanejo[5][0] = "\nRegime fechado > Simone & Simaria"
				+ "\nÔ ô ô ô ô"
				+ "\nNão quero advogado quero regime fechado"
				+ "\nCom você amor"
				+ "\nÔ ô ô ô ô"
				+ "\nNós somos bagunçados e reféns desse pecado\n";
		sertanejo[5][1] = "5";
		sertanejo[6][0] = "\nMe pedaço de pecado > João Gomes"
				+ "\nTô querendo te beijar de novo"
				+ "\nO teu beijo me enlouqueceu"
				+ "\nTudo que a gente já fez foi pouco"
				+ "\nQuero sentir seu corpo no meu\n";
		sertanejo[6][1] = "0";

		return sertanejo;
	}

	public static String[][] mpb() {

		String[][] mpb = new String[7][2];

		mpb[0][0] = "\nGarota de Ipanema > Tom Jobim"
				+ "\nOlha que coisa mais linda, mais cheia de graça"
				+ "\nÉ ela, menina, que vem e que passa"
				+ "\nNum doce balanço a caminho do mar\n";
		mpb[0][1] = "5";
		mpb[1][0] = "\nSozinho > Caetano Veloso"
				+ "\nÀs vezes no silêncio da noite"
				+ "\nEu fico imaginando nós dois"
				+ "\nEu fico ali sonhando acordado"
				+ "\nJuntando o antes, o agora e o depois\n";
		mpb[1][1] = "4";
		mpb[2][0] = "\nJoão de Barro > Maria Gadú"
				+ "\nOh, meu Deus, me traz de volta essa menina"
				+ "\nPorque tudo que eu tenho é o seu amor"
				+ "\nJoão de Barro, eu te entendo agora"
				+ "\nPor favor, me ensine como guardar meu amor\n";
		mpb[2][1] = "3";
		mpb[3][0] = "\nMetamorfose ambulante > Raul Seixas"
				+ "\nSobre o que é o amor"
				+ "\nSobre que eu nem sei quem sou"
				+ "\nSe hoje eu sou estrela amanhã já se apagou"
				+ "\nSe hoje eu te odeio amanhã lhe tenho amor"
				+ "\nLhe tenho amor"
				+ "\nLhe tenho horror"
				+ "\nLhe faço amor"
				+ "\nEu sou um ator\n";
		mpb[3][1] = "2";
		mpb[4][0] = "\nOnde anda você > Toquinho e Vinicius de Moraes"
				+ "\nE por falar em saudade"
				+ "\nOnde anda você?"
				+ "\nOnde anda os seus olhos"
				+ "\nQue a gente não vê"
				+ "\nOnde anda esse corpo?"
				+ "\nQue me deixou morto"
				+ "\nDe tanto prazer\n";
		mpb[4][1] = "0";
		mpb[5][0] = "\n\nDesculpe o auê > Rita Lee\n"
				+ "Da próxima vez eu me mando\n"
				+ "Que se dane meu jeito inseguro\n"
				+ "Nosso amor vale tanto\n"
				+ "Por você vou roubar\n"
				+ "Os anéis de Saturno\n";
		mpb[5][1] = "5";
		mpb[6][0] = "\nDe Janeiro a Janeiro > Roberta Campos\n"
				+ "Olhe bem no fundo dos meus olhos\n"
				+ "E sinta a emoção que nascerá quando você me olhar\n"
				+ "O universo conspira a nosso favor\n"
				+ "A consequência do destino é o amor\n"
				+ "Pra sempre vou te amar\n";
		mpb[6][1] = "1";

		return mpb;
	}

	public static String[][] rock() {

		String[][] rock = new String[7][2];

		rock[0][0] = "\nAlways > Bon Jovi\n"
				+ "Yeah I will love you, baby\n"
				+ "Always\n"
				+ "And I'll be there, forever and a day\n"
				+ "Always\n";
		rock[0][1] = "5";
		rock[1][0] = "\nCrazy > Aerosmith\n"
				+ "I go crazy, crazy, baby, I go crazy\n"
				+ "You turn it on\n"
				+ "Then you're gone\n"
				+ "You drive me\n"
				+ "Crazy, crazy, crazy, for you baby\n";
		rock[1][1] = "4";
		rock[2][0] = "\nSweet Child O’ Mine > Guns N’ Roses\n"
				+ "She's got a smile that it seems to me\n"
				+ "Reminds me of childhood memories\n"
				+ "Where everything was as fresh\n"
				+ "As the bright blue sky\n";
		rock[2][1] = "3";
		rock[3][0] = "\nI Don't Want To Miss a Thing > Aerosmith\n"
				+ "'Cause even when I dream of you\n"
				+ "The sweetest dream would never do\n"
				+ "I'd still miss you, baby\n"
				+ "And I don't wanna miss a thing\n";
		rock[3][1] = "5";
		rock[4][0] = "\nTwist and Shout > The Beatles\n"
				+ "Well, work it on out (work it on out)\n"
				+ "You know you look so good (look so good)\n"
				+ "You know you got me goin' now (got me goin')\n"
				+ "Just like I knew you would (like I knew you would)\n";
		rock[4][1] = "2";
		rock[5][0] = "\nSunshine of your love > Cream\n"
				+ "I'm with you, my love\n"
				+ "The light's shining through on you\n"
				+ "Yes, I'm with you, my love\n"
				+ "It's the morning and just we two\n";
		rock[5][1] = "0";
		rock[6][0] = "\nEqualize > Pitty\n"
				+ "Enquanto você conversa e me beija\n"
				+ "Ao mesmo tempo eu vejo\n"
				+ "As suas cores no seu olho, tão de perto\n";
		rock[6][1] = "1";

		return rock;

	}

	public static String[][] forro() {

		String[][] forro = new String[7][2];

		forro[0][0] = "\nSapatilha 17 > Estakazero\n"
				+ "Pode o ano passar e até nevar\n"
				+ "Pode chuver, relâmpejar\n"
				+ "Da sapatilha 37 eu vou lembrar\n";
		forro[0][1] = "3";
		forro[1][0] = "\nXote dos milagres > Falamansa\n"
				+ "Escrevi seu nome na areia\n"
				+ "O sangue que corre em mim sai da tua veia\n"
				+ "Veja só você é a única que não me dá valor\n"
				+ "Então por que será que esse valor\n"
				+ "É o que eu ainda quero ter\n";
		forro[1][1] = "4";
		forro[2][0] = "\nXote da alegria > Falamansa\n"
				+ "Pra que chorar sua mágoa\n"
				+ "Se afogando em agonia\n"
				+ "Contra tempestade em copo d'água\n"
				+ "Dance o xote da alegria ah ha he eh\n";
		forro[2][1] = "2";
		forro[3][0] = "\nDestá > Dorgival Dantas\n"
				+ "Destá\n"
				+ "Eu hei de ver você bater em minha porta\n"
				+ "Toc toc toc\n";
		forro[3][1] = "0";
		forro[4][0] = "\nSeu namorado > Calcinha Preta\n"
				+ "Volta, fica pra sempre do meu lado\n"
				+ "Que ainda sou, aquele homem apaixonado\n"
				+ "Que te perdeu, hoje reconheceu\n"
				+ "Que o erro foi só meu\n";
		forro[4][1] = "1";
		forro[5][0] = "\nAflição > Limão Com Mel\n"
				+ "Sei que não tem preço, é grande teu valor\n"
				+ "Pois na vida a gente sempre joga pra vencer\n"
				+ "Novamente vou a te procurar\n"
				+ "Pois meu mundo sem você não tem direção\n";
		forro[5][1] = "5";
		forro[6][0] = "\nTa rocheda > Barões da Pisadinha \n"
				+ "Entrei na rua dela com meu carro rebaixado\n"
				+ "No meu porta-malas, escutando forro pesado\n"
				+ "Eu logo percebi quando ela olhou pra mim\n"
				+ "Dei a volta por cima e chamei ela pra sair\n";
		forro[6][1] = "0";

		return forro;

	}

	public static String[][] pop() {

		String[][] pop = new String[7][2];

		pop[0][0] = "\nAll of me > John Legend\n"
				+ "‘Cause all of me\n"
				+ "Loves all of you\n"
				+ "Love your curves and all your edges\n"
				+ "All your perfect imperfections\n";
		pop[0][1] = "3";
		pop[1][0] = "\nFeeling good > Nina Simone\n"
				+ "When the night has come\n"
				+ "And the land is dark\n"
				+ "And the Moon\n"
				+ "Is the only light we'll see\n";
		pop[1][1] = "4";
		pop[2][0] = "\nI put a spell on you >  Nina Simone\n"
				+ "I put a spell on you\n"
				+ "'Cause you're mine\n";
		pop[2][1] = "5";
		pop[3][0] = "\nHeather > Conan Gray\n"
				+ "Why would you ever kiss me?\n"
				+ "I'm not even half as pretty\n"
				+ "You gave her your sweater, it's just polyester\n"
				+ "But you like her better\n";
		pop[3][1] = "0";
		pop[4][0] = "\nNo one > Alicia Keys\n"
				+ "You and me together\n"
				+ "Through the days and nights\n"
				+ "I don't worry, 'cause\n"
				+ "Everything's gonna be alright\n";
		pop[4][1] = "2";
		pop[5][0] = "\nFire on Fire > Sam Smith\n"
				+ "And look in my eyes\n"
				+ "You are perfection, my only direction\n"
				+ "It's fire on fire, hmm\n"
				+ "It's fire on fire\n";
		pop[5][1] = "1";
		pop[6][0] = "\nLove in the dark > Adele\n"
				+ "I can't love you in the dark\n"
				+ "It feels like we're oceans apart\n"
				+ "There is so much space between us\n"
				+ "Maybe we're already defeated\n"
				+ "Yeah, yeah, yeah, yeah, yeah, yeah\n"
				+ "Everything changed me\n";
		pop[6][1] = "1";

		return pop;

	}

	public static String[][] pagode() {

		String[][] pagode = new String[7][2];

		pagode[0][0] = "\nCheia de manias > Raça Negra\n"
				+ "Então me ajude a segurar\n"
				+ "Essa barra que é gostar de você\n"
				+ "Então me ajude a segurar\n"
				+ "Essa barra que é gostar de você, yêh\n";
		pagode[0][1] = "5";
		pagode[1][0] = "\nTão linda > Atitude 67\n"
				+ "Eu achei ela tão linda, ela é tão linda\n"
				+ "Se ficar comigo, a vida fica mais bonita\n"
				+ "Mãe, ela é tão linda, ela é tão linda\n"
				+ "Se ficar comigo, fica pro resto da vida\n";
		pagode[1][1] = "4";
		pagode[2][0] = "\nLinguagem dos olhos > Péricles\n"
				+ "A linguagem dos olhos\n"
				+ "O corpo sabe decifrar\n"
				+ "A linguagem dos olhos\n"
				+ "Quem faz o coração falar\n";
		pagode[2][1] = "3";
		pagode[3][0] = "\nCamisa 10 > Turma do pagode \n"
				+ "Eu não me separo de você, mulher\n"
				+ "Nem se a globeleza um dia me quiser\n"
				+ "Se na Mega-Sena eu vencer\n"
				+ "Fico com você, fico com você\n";
		pagode[3][1] = "2";
		pagode[4][0] = "\nTa vendo aquela Lua > Exaltasamba\n"
				+ "Tá vendo aquela lua que brilha lá no céu?\n"
				+ "Se você me pedir eu vou buscar só para te dar\n"
				+ "Se bem que o brilho dela nem se compara ao seu\n"
				+ "Deixa eu te dar um beijo vou mostrar o tempo que perdeu\n";
		pagode[4][1] = "1";
		pagode[5][0] = "\nAquele beijo > Turma do pagode\n"
				+ "Agora o jogo virou\n"
				+ "Sou eu que te procuro\n"
				+ "Te ligo a toda hora\n"
				+ "Às vezes sem assunto, só jogo conversa fora\n"
				+ "Hoje estou em transe, perdidinho de paixão\n";
		pagode[5][1] = "3";
		pagode[6][0] = "\nAté que enfim > Ferrugem\n"
				+ "'To te esperando já faz tempo\n"
				+ "Tipo assim, a vida inteira\n"
				+ "Eu já te amava em pensamento\n"
				+ "Juro, não é brincadeira\n";
		pagode[6][1] = "0";

		return pagode;
	}

	public static void pesquisa(String trecho, String[][] estiloMusical) {

		String respostaInvalida = "Poxa! Infelizmente não temos nenhuma música com esse trecho";
		int i; boolean resultado = false;

		for (i = 0; i < estiloMusical.length - 1; i++) {
			for (int j = 0; j < estiloMusical[i].length; j++) {

				if (estiloMusical[i][0].toLowerCase().contains(trecho.toLowerCase())) {
					Imprimir.str(estiloMusical[i][0]);
					resultado = true;
					break;
				}
			}
		} 

		if(resultado == false) {
			Imprimir.str(respostaInvalida);
		}
	}



	public static String[][] estiloMusical(int estilo) {

		String[][] temp = new String[7][2];

		switch (estilo) { 

		case 0:
			temp = sertanejo();
			break;
		case 1:
			temp = mpb();
			break;
		case 2:
			temp = rock();
			break;
		case 3:
			temp = forro();
			break;
		case 4:
			temp = pop();
			break;
		case 5:
			temp = pagode();
			break;

		default:
			Imprimir.str("Erro inesperado.");
		}

		return temp;
	}

	public static void musica (String [][] arr, String faixaEtaria) {

		int musica;
		String[][] temp = arr;
		Random rd = new Random();

		do {
			musica = rd.nextInt(6);
			if (temp[musica][1].equals(faixaEtaria) == true) {
				Imprimir.str(temp[musica][0] + "\nFaixa Etária: " + faixaEtaria);
			} 

		} while (temp[musica][1].equals(faixaEtaria) == false);
	}
}