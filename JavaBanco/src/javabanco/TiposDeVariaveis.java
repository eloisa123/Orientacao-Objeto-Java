package javabanco;

import java.util.ArrayList;

import javabanco.entidade.ContaCorrente;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		int umNumero = 42;
		int outroNumero = 3;
		int produto = 0; 
		
		Integer umNumeroObj = new Integer(42);
		
		System.out.println("umNumero: " + umNumero);
		System.out.println("produto (antes) = " + produto);
		
		produto = umNumero * outroNumero;
		
		System.out.println("produto (depois) = " + produto);
		
		System.out.println("umNumeroObj: " + umNumeroObj);
		
		ArrayList<Integer> contas = new ArrayList<Integer>();
		
		contas.add(12345);
		contas.add(67890);
		contas.add(246810);
		contas.add(13579);
		
		System.out.println("Contas: " + contas);
		
		ContaCorrente cc1 = new ContaCorrente();		
		System.out.println("cc1.getSaldo(): " + cc1.getSaldo());
		
		cc1.credito(umNumero);
		
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		cc1.debito(20);
		
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.print("cc1.extrato(): " + cc1.extrato());
		
		
		

	}

}
