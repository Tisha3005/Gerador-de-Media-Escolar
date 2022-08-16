import java.util.Scanner;

public class MediaDoWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");

		int contador = 0;
		double media = teclado.nextDouble();
		boolean continueCalculando;

		do {
			System.out.print("Quer mais nota? <s/n> ");
			continueCalculando = teclado.next().toUpperCase().equals("S");

			if (continueCalculando) {
				System.out.print("Entre com a nota: ");
				media = (media * contador + teclado.nextDouble()) / (++contador);
			}

		} while (continueCalculando);

		System.out.println();
		System.out.println("Media: " + media);
		System.out.println();
		if (media >= 6)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");

		teclado.close();
	}
}