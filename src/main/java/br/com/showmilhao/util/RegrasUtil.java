package br.com.showmilhao.util;

public class RegrasUtil {
	
	private RegrasUtil() { }
	
	private static final String REGRAS = "Ao selecionar a op��o JOGAR, ser� necess�rio preencher"
            + " o campo de nome (para que depois seja mostrado no ranking de jogadores)\n\n"
            + "O jogo come�a com o jogador respondendo a uma pergunta. Cada "
            + "pergunta deve conter um enunciado e 4 alternativas, sendo apenas "
            + "uma correta, e um n�vel (F�cil, Normal ou Dif�cil). \n\nA cada rodada a "
            + "pergunta ter� um valor caso o jogador acerte a quest�o, um valor caso\n"
            + "o jogador erre a quest�o e um outro valor caso o jogador decida parar.\n\n"
            + "Caso o jogador acerte a pergunta, o jogo continua com a pr�xima "
            + "pergunta, caso o jogador pare, erre ou acerte a quest�o de 1 Milh�o, o "
            + "jogo finaliza. \n\nAssim que um jogo finalizar, a pontua��o do jogador "
            + "� salva junto ao nome e a pontua��o adquirida para ser mostrado "
            + "posteriormente no ranking, somente se estiver entre os 10 primeiros.\n\n"
            + "O jogador pode ter direito a 3 tipos de ajuda:\n\n" + "- Pulo\n" + "- Cartas\n"
            + "- Universit�rios\n\n" + "Durante todo o jogo o jogador tem direito a 3 pulos, 1 ajuda das cartas e "
            + "1 ajuda aos universit�rios.\n\n" + "O pulo serve para trocar a pergunta feita ao usu�rio.\n\n"
            + "Na ajuda das cartas o jogador escolhe no escuro uma de quatro cartas, "
            + "as cartas s�o enumeradas de 0 a 3, a carta que o jogador escolher ir� "
            + "determinar quantas respostas erradas n�o aparecer�o nas escolhas.\n\n"
            + "Na ajuda aos universit�rios, o jogo mostra o palpite de 3 universit�rios. "
            + "\n\nAten��o: na pergunta de 1 Milh�o de Reais o jogador n�o tem direito a " + "nenhuma ajuda!\n\n"
            + "O Jogo dever� conter 16 turnos de perguntas e respostas com os " + "seguintes valores:\n\n"
            + "1 - Pergunta R$1.000 para acerto, R$0,00 parar e R$0,00 se errar.\n\n"
            + "2 - Pergunta R$2.000 para acerto, R$1.000 parar e R$500 se errar.\n\n"
            + "3 - Pergunta R$3.000 para acerto, R$2.000 parar e R$1.000 se errar.\n\n"
            + "4 - Pergunta R$4.000 para acerto, R$3.000 parar e R$1.500 se errar.\n\n"
            + "5 - Pergunta R$5.000 para acerto, R$4.000 parar e R$2.000 se errar.\n\n"
            + "6 - Pergunta R$10.000 para acerto, R$5.000 parar e R$2.500 se errar.\n\n"
            + "7 - Pergunta R$20.000 para acerto, R$10.000 parar e R$5.000 se errar.\n\n"
            + "8 - Pergunta R$30.000 para acerto, R$20.000 parar e R$10.000 se errar.\n\n"
            + "9 - Pertunga R$40.000 para acerto, R$30.000 parar e R$15.000 se errar.\n\n"
            + "10 - Pergunta R$50.000 para acerto, R$40.000 parar e R$20.000 se errar.\n\n"
            + "11 - Pergunta R$100.000 para acerto, R$50.000 parar e R$25.000 se errar.\n\n"
            + "12 - Pergunta R$200.000 para acerto, R$100.000 parar e R$50.000 se errar.\n\n"
            + "13 - Pergunta R$300.000 para acerto, R$200.000 parar e R$100.000 se errar.\n\n"
            + "14 - Pergunta R$400.000 para acerto, R$300.000 parar e R$150.000 se errar.\n\n"
            + "15 - Pergunta R$500.000 para acerto, R$400.000 parar e R$200.000 se errar.\n\n"
            + "16 - Pergunta R$1.000.000 para acerto, R$500.000 para e R$0,00 se errar.";
	
	public static String getRegras() {
		return REGRAS;
	}

}
