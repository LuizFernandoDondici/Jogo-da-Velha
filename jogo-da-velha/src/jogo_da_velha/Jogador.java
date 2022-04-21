package jogo_da_velha;

public class Jogador {
	
	private String jogador;
	private int turno;
	
	public String getJogador() {
		return jogador;
	}
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
	
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Jogador() {
		this.jogador = "x";
		this.turno = 0;
		
	}
	
	
	public void alterarTurno() {
		
		// Funcao que altera turno;
		
		setTurno(this.turno = this.turno + 1);
		if (this.turno % 2 == 0) {
			setJogador("x");
		} else {
			setJogador("o");
		}
		
	}
}
