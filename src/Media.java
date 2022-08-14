import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		double media;
	
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Entre com a N1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Entre com a N2: ");
		nota2 = teclado.nextDouble();
		System.out.print("Entre com a N3: ");
		nota3 = teclado.nextDouble();
		System.out.print("Entre com a N4: ");
		nota4 = teclado.nextDouble();
		System.out.print("Entre com a N5: ");
		nota5 = teclado.nextDouble();
	
		
		media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
		System.out.println();
		System.out.println("A media do aluno eh: " + media);
		System.out.println();
		
		if (media > 6) {
			System.out.println("aprovado".toUpperCase());
		}
		else {
			System.out.println("reprovado");
		
			
			
			teclado.close();
		}		
	}


	}


