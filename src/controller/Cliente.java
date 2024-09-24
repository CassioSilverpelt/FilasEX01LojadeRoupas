package controller;

public class Cliente {
	
	private String nome;
	private int qtdPecas;
	private float valorPecas;
	
	public Cliente (String nome, int qtdPecas, float valorPecas) {
		this.nome = nome;
		this.qtdPecas = qtdPecas;
		this.valorPecas = valorPecas;
		
	}
	
	public Cliente () {
		this("", 0, 0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getqtdPecas() {
		return qtdPecas;
	}
	
	public void setqtdPecas (int qtdPecas) {
		this.qtdPecas = qtdPecas;
	}
	
	public float getValorPecas() {
		return valorPecas;
	}
	
	public void setValorPecas(float valorPecas) {
		this.valorPecas = valorPecas;
	}
	
}
