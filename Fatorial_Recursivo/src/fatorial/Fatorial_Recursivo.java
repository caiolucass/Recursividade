package fatorial;
import java.util.Scanner;

/**
 * @author clfsantos.estagio //esse � o meu email do est�gio, pois fiz no computador de l�
 * Matr�cula : 604365
 * Data:09/03/2020
 */

public class Fatorial_Recursivo {

	public static void main(String[] args) {
	  
		int num;
		double fat;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor inteiro positivo:");
		num  = teclado.nextInt();
		
		//acionar o m�todo recursivo
		fat = Fatorial(num);
		System.out.println("Fatorial = " + fat + "\n");
		teclado.close();
      }
	
	public static int Fatorial(int a) {
		
		if(a == 0 || a == 1) {
			return 1;
		}
		else {
			return a * Fatorial(a -1);
		}
	}
  }


