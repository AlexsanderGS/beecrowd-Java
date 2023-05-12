import java.util.Locale;
import java.util.Scanner;

// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
// A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 
// e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, 
// sempre com uma casa decimal.

// Entrada
// O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

// Saída
// Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, 
// com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade

public class Uri1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3;
		double mediaP;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		nota1 = nota1 * 2 / 10;
		nota2 = nota2 * 3 / 10;
		nota3 = nota3 * 5 / 10;
		mediaP = nota1 + nota2 + nota3;
		
		System.out.printf("MEDIA = %.1f" , mediaP);
		
		sc.close();
	}
}
