package string_Recursiva;

/**
 * @author clfsantos.estagio //esse � o meu email do est�gio, pois fiz no computador de l�
 * Matr�cula : 604365
 * Data:09/03/2020
 */

public class String_Recursiva {
	
	public static String remove(String s)
   {
		if(s.equals(""))  
			return "";
			
		if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' || s.charAt(0) == 'A' )  
		{
			return(remove(s.substring(1)));
		}
		else      
		{
			s = s.charAt(0)+remove(s.substring(1));
			return s;
		}
	}
		
	  public static void main(String[] args) {
			
	    String s = "algoritmos e estruturas de dados";
		System.out.println(remove(s));
	 }
}

