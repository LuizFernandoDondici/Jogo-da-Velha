package jogo_da_velha;

@SuppressWarnings("serial")
public class PosicaoException extends RuntimeException{

	@Override
	public String getMessage() {
		return "ESSA POSI��O J� FOI ESCOLHIDA. TENTE NOVAMENTE: ";
	}
}
