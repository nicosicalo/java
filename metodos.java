package implementacion;

import interfaz.cola;

public class metodos implements cola {
	private int[] valores;
	private int cantidad;
	@Override
	public void inicializar() {
		valores = new int[100];
		cantidad = 0;
	}

	@Override
	public void acolar(int valor) {
		valores[cantidad] = valor;
		cantidad++;
	}

	@Override
	public void desacolar() {
		for(int i=0; i<cantidad; i++) {
			valores[i] = valores[i+1];
		}
		cantidad--;
	}

	@Override
	public int primero() {
		return valores[0];
	}
	
	
	@Override
	public boolean estaVacia() {
		return cantidad == 0;
	}
	public void atras(int valor) {
		valores[0]= valor;
		
}

}
