package jogo_da_velha;

import java.util.Scanner;

public class Jogo {
	
	Matriz matriz;
	Jogador jogador;
	
	private int jogada;
	boolean vencedor = false;
	
	public Jogo(Matriz matriz, Jogador jogador) {
		this.matriz = matriz;
		this.jogador = jogador;
	}
	
	public void inicio() {
		
		/*
		 * Funcao que inicia o jogo e determina as condicoes para finalizar o jogo;
		 *  
		 * Condicoes para finalizar o jogo:
		 * Definicao de um vencedor, Limite de rodadas ou Jogo "deu velha".
		 * 
		 */
		
		while((vencedor() == true) ^ (jogador.getTurno() <= 10)) {
			imprimirMatriz();
			jogada();
		}
		
		if (jogador.getTurno() == 10) {
			imprimirMatriz();
			System.out.println(" ");
			System.out.println("DEU VELHA !!!");
		} else if (vencedor() == true) {
			imprimirMatriz();
			jogador.alterarTurno();
			System.out.println(" ");
			System.out.println("O JOGADOR " + jogador.getJogador() + " VENCEU !!!");
		}	
	}	
	
	
	
	public void imprimirMatriz() {
		
		/* 
		 * Funcao que imprime a "interface" do jogo no terminal, 
		 * com as posicoes gerados pela funcao "criarMatriz()" da Classe Matriz.
		 * 
		 */
		
		System.out.println(" ");
		System.out.println("=================");
		System.out.println("  JOGO DA VELHA  ");
		System.out.println("=================");
		System.out.println(" ");
		System.out.println("+----+----+----+");
		for (int l = 1; l < 4; l++) {
			for (int c = 1; c < 4; c++) {
				System.out.print("|   ");
				System.out.print((matriz.m[l][c]));
			}
			System.out.println("|");
			System.out.println("+----+----+----+");
		}
		System.out.println("=================");
		System.out.println(" ");
	}	

	
	public void jogada() {
		
		// Funcao que possibilita a jogada do usuario com a validacao de permitir apenas digitos de 1 a 9.
		
		Scanner entrada = new Scanner(System.in);	
		try {
			if ((this.jogada == 0) || (this.jogada > 9)) {
				System.out.print("Escolha uma posi��o de 1 a 9 para '" + jogador.getJogador() + "' jogar: "); 
				this.jogada = entrada.nextInt();
			}	
		} catch (Exception e) {
			System.out.println(" ");
			System.out.println("ESSA POSI��O N�O EXISTE, TENTE NOVAMENTE: ");
		} finally {
			if ((vencedor() == true) || (jogador.getTurno() == 10)) {
				entrada.close();
			}
		}
		
		try {
			posicao();
		} catch (PosicaoException e) {
			System.out.println(" ");
			System.out.println(e.getMessage());
		}
	}
	
	
	public void posicao (){
		
		/*
		 * Funcao que verifica se a posicao escolhida ja tenha sido preenchida,
		 * Caso seja valida, altera o turno pela funcao "alterarTurno()"da Classe Jogador.
		 * 
		 */
		
		switch (this.jogada) {
		case 1: 
			if ((matriz.m[1][1].toString().equalsIgnoreCase("x")) || (matriz.m[1][1].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[1][1] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;
		case 2: 
			if ((matriz.m[1][2].toString().equalsIgnoreCase("x")) || (matriz.m[1][2].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[1][2] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 3: 
			if ((matriz.m[1][3].toString().equalsIgnoreCase("x")) || (matriz.m[1][3].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[1][3] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 4: 
			if ((matriz.m[2][1].toString().equalsIgnoreCase("x")) || (matriz.m[2][1].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[2][1] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 5: 
			if ((matriz.m[2][2].toString().equalsIgnoreCase("x")) || (matriz.m[2][2].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[2][2] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;
		case 6: 
			if ((matriz.m[2][3].toString().equalsIgnoreCase("x")) || (matriz.m[2][3].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[2][3] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 7: 
			if ((matriz.m[3][1].toString().equalsIgnoreCase("x")) || (matriz.m[3][1].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[3][1] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 8: 
			if ((matriz.m[3][2].toString().equalsIgnoreCase("x")) || (matriz.m[3][2].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[3][2] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;	
		case 9: 
			if ((matriz.m[3][3].toString().equalsIgnoreCase("x")) || (matriz.m[3][3].toString().equalsIgnoreCase("o"))) {
				this.jogada = 0;
				throw new PosicaoException();
			} else {
				matriz.m[3][3] = jogador.getJogador();
				jogador.alterarTurno();
			}
			break;		
		}	
		this.jogada = 0;
		vencedor();
	}
	
	
	public boolean vencedor() {
		
		// Funcao que valida e determina se existe um vencedor.
		
		for (int i = 1; i < 4; i++) {
			if ((matriz.m[i][1] == matriz.m[i][2]) && (matriz.m[i][2] == matriz.m[i][3])) {
				this.vencedor = true;
			}
		}
		for (int i = 1; i < 4; i++) {
			if ((matriz.m[1][i] == matriz.m[2][i]) && (matriz.m[2][i] == matriz.m[3][i])) {
				this.vencedor = true;
			}
		}
		if ((matriz.m[1][1] == matriz.m[2][2]) && (matriz.m[2][2] == matriz.m[3][3])) {
			this.vencedor = true;
		}
		if ((matriz.m[3][1] == matriz.m[2][2]) && (matriz.m[2][2] == matriz.m[1][3])) {
			this.vencedor = true;
		}
		return this.vencedor;
	}

}
