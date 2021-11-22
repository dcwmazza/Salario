package exercicio01;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario;
		System.out.print("Digite seu sal�rio: R$ ");
		salario = ler.nextDouble();
		System.out.println("Seu sal�rio bruto � de R$ " + salario);
		boolean pensao;
		char perguntaPensao;
		System.out.print("Voc� paga pens�o? ");
		perguntaPensao = ler.next().charAt(0);

		switch (perguntaPensao) {
		case 'S', 's': {
			pensao = true;
			break;
		}
		default:
			pensao = false;
		}
		ler.close();
		double valorPensao;
		if (pensao == true) {
			valorPensao = (salario * 0.2);
		} else {
			valorPensao = 0;
		}
		double inss = (salario * 0.12); 
		double fgts = (salario * 0.08); 
		double sindicato = (salario * 0.01); 
		double salarioLiquido = salario - inss - fgts - sindicato - valorPensao;
		System.out.println("Os descontos do seu sal�rio s�o: ");
		System.out.println("INSS: " + inss );
		System.out.println("FGTS: " + fgts );
		System.out.println("Sindicato: " + sindicato );
		if (pensao == true) {
			System.out.println("Pens�o: " + valorPensao);
		}
		System.out.println("O seu sal�rio l�quido � de: " + salarioLiquido);
	}

}

