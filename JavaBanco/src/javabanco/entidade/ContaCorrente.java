package javabanco.entidade;

import java.util.ArrayList;

public class ContaCorrente {
	
	private int saldo;
	private ArrayList<Float> operacoes = new ArrayList<Float>();
		public int getSaldo() {
		return saldo;
	}
	
	public float debito( float valor) {
		saldo -= valor;
		operacoes.add(-valor);
		return saldo;
	}
	public float credito( float valor) {
		saldo += valor;
		operacoes.add(valor);
		return saldo;

	}
	
	public ArrayList<Float> extrato() {
		return operacoes; 
	}

}
