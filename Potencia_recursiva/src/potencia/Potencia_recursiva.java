package potencia;
import java.util.Scanner;

/**
 * @author clfsantos.estagio //esse é o meu email do estágio, pois fiz no computador de lá
 * Matrícula : 604365
 * Data:09/03/2020
 */
public class Potencia_recursiva {

	public static double Potencia(double b, int a) {
		
		if(a == 0) {
			return 1; //caso a base seja 0 o programa sera encerrado
		}
		return (b * Potencia(b , a - 1)); // caso ao contrario ira fazer de forma decrescente
	}
	
	public static void main(String[] args) {
		
       int a;
       double b, pote;
       
       Scanner teclado = new Scanner(System.in);
       
       System.out.println("Digite o valor da base:");
       b = teclado.nextDouble();
       System.out.println("Digite o valor do expoente:");
       a = teclado.nextInt();
       
       //acionar o método
       pote = Potencia(b,a);
       System.out.println(b + " elevado a " + a + " = " + pote);   
   	   teclado.close();
       
	}
}
