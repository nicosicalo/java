package algoritmos;
import implementacion.metodos;
import interfaz.cola;
public class logica {
	
public cola  generarcola(int cantidadValores) {
		cola  resultado = new metodos();
		resultado.inicializar();
		for(int i=0; i< cantidadValores; i++) 
			resultado.acolar(i);
		
		return resultado;}

public cola copiocola(cola original){
	cola copia= new metodos();
	cola auxiliar= new metodos();
	copia.inicializar();
	auxiliar.inicializar();
	
	while(!original.estaVacia()) {
		auxiliar.acolar(original.primero());
		original.desacolar();
		
	}
	while(!auxiliar.estaVacia()){
		original.acolar(auxiliar.primero());
		copia.acolar(auxiliar.primero());
		auxiliar.desacolar();
		
		
	}
	return copia;
}

public cola invertir(cola original) {
	cola invertida= new metodos();
	 invertida.inicializar();
	 
	 while(!original.estaVacia()) {
		 invertida.atras(original.primero());
		 original.desacolar();
	 }
	 return invertida;}
	 

	 

public void mostrarPila(cola origen) {
	cola auxPila = new metodos();
	auxPila.inicializar();
	while(!origen.estaVacia()) {
		System.out.println(origen.primero());
		auxPila.acolar(origen.primero());
		origen.desacolar();
	}
	while(!auxPila.estaVacia()) {
		origen.acolar(auxPila.primero());
		auxPila.desacolar();
	}

}
	}





