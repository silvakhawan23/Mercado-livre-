package br.com.Mercado.Livre;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Teclado {

		public static int lerInteiro(String rotulo) {
			System.out.println(rotulo);
			try {
				Scanner scann = new Scanner (System.in);
				return scann.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas numeros inteiros");
				System.out.println(rotulo);
				Scanner scann = new Scanner (System.in);
				return scann.nextInt();
			}
		}
		public static double lerDouble (String rotulo) {
			try {
				System.out.println(rotulo);
				Scanner scann = new Scanner (System.in);
				return scann.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas numeros com virgula (doubles), ou qualquer numero do conjunto dos reais");
				System.out.println(rotulo);
				Scanner scann = new Scanner (System.in);
				return scann.nextDouble();
			}
		}
		
		public static String lerString(String rotulo) {
			try {
				System.out.println(rotulo);
				Scanner scann = new Scanner (System.in);
				return scann.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas textos");
				System.out.println(rotulo);
				Scanner scann = new Scanner (System.in);
				return scann.nextLine();
			}
			
		}
	}

