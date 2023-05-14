import java.util.Scanner;

/* 	Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, 
   	meses e dias

 	Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e 
 	todo mês com 30 dias. Nos casos de teste nunca haverá uma situação 
 	que permite 12 meses e alguns dias, como 360, 363 ou 364. 
 	Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

 	Entrada
 	O arquivo de entrada contém um valor inteiro.

 	Saída
	Imprima a saída conforme exemplo fornecido.
*/

public class Uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int ano = N / 365;
		N = N % 365;
		
		int meses = N / 30;
		N = N % 30;
		
		int dias = N;

		System.out.printf("%d anos(s)\n", ano);
		System.out.printf("%d mes(es)\n", meses);
		System.out.printf("%d dia(s)\n", dias);
		
		sc.close();
	}
}
