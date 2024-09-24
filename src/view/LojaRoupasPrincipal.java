package view;

import model.Fila;
import controller.LojaRoupasController;
import controller.Cliente;

public class LojaRoupasPrincipal {
	
	public static void main (String[] args) {
		
		int numclientes = 20;
		LojaRoupasController lojCon = new LojaRoupasController();
		Fila<Cliente> filaclientes = new Fila<>();
		
		for (int i = 0; i < numclientes; i++) {
			Cliente cliente = new Cliente();
			
			cliente.setNome("Cliente #" + (i+1));
			cliente.setqtdPecas((int)((Math.random() *31) + 20));
			cliente.setValorPecas((float)((Math.random() *96) + 5));
			
			filaclientes.insert(cliente);
		}
		
		lojCon.caixa(filaclientes);
		
	}
	
	
	
}
