package jogo_da_velha;

@SuppressWarnings("serial")
public class PosicaoException extends RuntimeException{

	@Override
	public String getMessage() {
		return "ESSA POSIÇÃO JÁ FOI ESCOLHIDA. TENTE NOVAMENTE: ";
	}
}
