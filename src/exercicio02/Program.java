package exercicio02;

import java.util.Scanner;

public class Program {
	 
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if ( numero >= 0 ) {
		   System.out.println("Não negativo");
		}
		else {	
		   System.out.println("Negativo");
		}
		
		sc.close();
        
	}

}
