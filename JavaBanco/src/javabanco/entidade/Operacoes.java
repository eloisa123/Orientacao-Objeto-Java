package javabanco.entidade;

import java.util.Date;

public class Operacoes {
	
	private float valor;
	private String tipoOperacoes;
	private Date dataHora; 
	
	public Date getDataHora() {
		return dataHora;
	}

	public String getTipoOperacoes() {
		return tipoOperacoes;
	}

	public Operacoes (float valor, String TipoOperacoes, Date dataHora) {
		this.valor = valor;
		this.tipoOperacoes = tipoOperacoes;
		this.dataHora = dataHora;
	}

	public float getValor() {
		return valor;;
	}


}
