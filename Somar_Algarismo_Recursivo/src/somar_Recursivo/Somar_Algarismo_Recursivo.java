package somar_Recursivo;
import java.util.Scanner;

public class Somar_Algarismo_Recursivo {
	
	public static int soma(int numero) {
		int x , y;
		
		//atribui o valor do último digito  do numero para o "a"
		x = numero % 10;
		
		//atribuir o ultimo digito do numero para o "b"
		y = (numero - x)/10;
		
		//testar se existe mais digitos
		if( y <= 0) {
			return x;
		}
		else {
			//somar o ultimo digito ate o ultimo numero
			return x + soma(y);
		}	
	}
	
	public static void main(String[] args) {
		int n;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		n = teclado.nextInt();
		
		System.out.println("Soma dos algorismos:"+soma(n));

		teclado.close();
	}

}
