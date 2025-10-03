package primeiroProjeto;

import java.util.Scanner;

public class FuncaoSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nome();
		separador();
		frase();
		separador();
		contagem();
		separador();
		vogais();
		separador();
		quadrado();
		separador();
		pares();
		separador();
		regressiva();
		separador();
		triangulo();
		separador();
		semana();
	}

	public static void separador() {
		System.out.println("------------------------------------------------");
	}
	public static void nome() {
		for(int e = 0; e < 730; e++) {
			System.out.println("Renatinho");
		}
	}
	public static void frase() {
		System.out.println("Você é maior que qualquer desafio que enfrente");
	}
	public static void contagem() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public static void vogais() {
		System.out.println("A | E | I | O | U");
	}
	public static void quadrado() {
		System.out.println("**************");
		for(int i = 0; i < 5; i++) {
			System.out.println("*            *");
		}
		System.out.println("**************");
	}
	public static void pares() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("O valor pares são: " + i);
			}
		}
	}
	public static void regressiva () {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
	public static void triangulo() {
		System.out.println("*  ");
		System.out.println("**  ");
		System.out.println("*** ");
		System.out.println("****");
		System.out.println("*****");
		}
	public static void semana(){
		System.out.println("Domingo");
		System.out.println("Segunda");
		System.out.println("Terça");
		System.out.println("Quarta");
		System.out.println("Quinta");
		System.out.println("Sexta");
		System.out.println("Sábado");
		
		
	}
	
}
