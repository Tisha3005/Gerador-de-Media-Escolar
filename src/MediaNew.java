import java.util.Iterator;
import java.util.Scanner;

public class MediaNew {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double totalDeNotas = 5;
		double contador = 0;
		
		for (int i = 0; i < totalDeNotas; i++) {
			System.out.println("entre com a nota");
			contador = contador + teclado.nextDouble();
			System.out.println(i);
		}
		double media = contador / totalDeNotas;

		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		teclado.close();
	}
}
