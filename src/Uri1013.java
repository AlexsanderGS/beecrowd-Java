import java.util.Scanner;

// Faça um programa que leia três valores e apresente o maior dos três 
// valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
// MaiorAB = (a + b + abs(a - b)) / 2

// Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
// Um segundo passo, portanto é necessário para chegar no resultado esperado.

// Entrada
// O arquivo de entrada contém três valores inteiros.

// Saída
// Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".


public class Uri1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, k, t;

		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		k = (x + y + Math.abs(x - y)) / 2;

		t = (k + z + Math.abs(k - z)) / 2;

		System.out.println(t + " eh o maior");
		
	/*  int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = 0;
		
		if (a > b && a > c) {
			maior = a;
		}else if(b > a && b > c) {
			maior  = b;
		}else {
			maior = c;
		}
		System.out.println(maior +" eh o maior"); */

		sc.close();
	}
}
