package jogo_da_velha;

public class Aplicacao {

	public static void main(String[] args) {
		
		Matriz matriz = new Matriz();
		
		Jogador jogador = new Jogador();
		
		Jogo jogo = new Jogo (matriz, jogador);
		jogo.inicio();

	}

}
