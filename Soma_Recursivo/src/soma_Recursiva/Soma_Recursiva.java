package soma_Recursiva;
import java.util.Scanner;

/**
 * @author clfsantos.estagio //esse � o meu email do estagio, pois fiz no computador de la.
 * Matr�cula : 604365
 * Data:11/03/2020
 */

public class Soma_Recursiva {
	
	public static double Soma(double n, double x) {
		
		//caso o x seja menor que zero n nao podera somar com seu valor
		if(n <= 0 ) {
			return 1;
		}
		else{
			return x + Soma(n - 2, (n - 1)/n); // pega o valor de N e soma com o valor na posicao 
		}
	}

	public static void main(String[] args) {
		
		int n;
		double a;
		Scanner teclado = new Scanner(System.in);
		 
		
		System.out.println("Digite um valor inteiro,positivo e par:");
		n = teclado.nextInt();
                
        a = n;
		
		if(n % 2 == 1 || n < 0 ) {
			System.out.print("N nao e um inteiro, positivo e par.");
		}
		else {
			System.out.println("Soma dos valores: " + Soma(a,0));
		}
		
		teclado.close();
	}

}
