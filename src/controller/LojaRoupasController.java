package controller;

import model.Fila;

public class LojaRoupasController {

	public LojaRoupasController() {
		super();
	}
	
	public Fila<Cliente> caixa (Fila<Cliente> fila) {
		while (!fila.isEmpty()) {
			try {
				Cliente aux = new Cliente();
				aux = fila.remove();
				float valorCompra = (aux.getValorPecas() * aux.getqtdPecas());
				System.out.println("A compra do " + aux.getNome() + " deu: " + valorCompra);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return fila;
	}
	
	
}
