package maior_Valor;

/**
 * @author clfsantos.estagio //esse � o meu email do est�gio, pois fiz no computador de l�
 * Matr�cula : 604365
 * Data:09/03/2020
 */

public class Maior_Valor_Recursivo {

	public static int Maior(int []vet , int posicao) {
		
		if(posicao == 0) {
			return vet[0];
		}
		else if(vet[posicao] > Maior(vet , posicao - 1)) {
			return vet[posicao];
		}
		else {
			return Maior(vet , posicao - 1);
		}
		
	}

}
