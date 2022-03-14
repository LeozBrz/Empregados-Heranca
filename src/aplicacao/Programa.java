package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregados;
import entidades.Terceirizados;

public class Programa {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.print("DIGITE O NUMERO DE TRABALHADORES: ");
	int num = sc.nextInt();
	List<Empregados> emp = new ArrayList<>(num);
	
	for(int i=0; i<num; i++) {
		System.out.println("TRABALHADOR #1: ");
		System.out.print("TERCEIRIZADO? (s/n):");
		char resp = sc.next().charAt(0);
		System.out.print("NOME: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("QUANTIDADE DE HORAS: ");
		int horas = sc.nextInt();
		System.out.print("VALOR DAS HORAS: ");
		double valHoras = sc.nextDouble();
		if(resp =='s') {
			System.out.print("INSIRA O VALOR ADICIONAL: ");
			Double valAdc= sc.nextDouble();	
			
			Empregados empregado = new Terceirizados(nome, horas,valHoras,valAdc);
			emp.add(empregado);
		}else {
			Empregados empregado = new Empregados(nome, horas,valHoras);
			emp.add(empregado);
		}
	}
	System.out.println("PAGAMENTO:");
		for(Empregados e: emp) {
			System.out.printf(e.getNome() + " - $ " + String.format("%.2f", e.pagamento()));
			System.out.println();
		}
	
	sc.close();
	}	
}
