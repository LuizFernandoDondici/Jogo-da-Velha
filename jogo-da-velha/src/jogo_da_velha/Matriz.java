package jogo_da_velha;

public class Matriz {
	
	String m [][] = new String [4][4];

	public String[][] getM() {
		return m;
	}
	public void setM(String[][] m) {
		this.m = m;
	}

	
	public Matriz() {
		criarMatriz();
	}
	
	
	public void criarMatriz() {
		
		// Funcao para gerar posicoes;
		
		Integer i=0;
		for (int l = 1; l < 4; l++) {
			for (int c = 1; c < 4; c++) {
				i++;
				this.m[l][c] = i.toString();
			}
		}
	}
	
}
