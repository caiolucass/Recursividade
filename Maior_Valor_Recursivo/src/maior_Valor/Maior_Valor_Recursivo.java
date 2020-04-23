package maior_Valor;

/**
 * @author clfsantos.estagio //esse é o meu email do estágio, pois fiz no computador de lá
 * Matrícula : 604365
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
