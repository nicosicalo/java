package testing;
import interfaz.cola;
import algoritmos.logica;


public class test {
public static void main(String[] args) {
	logica algoritmo = new logica();
	System.out.println("hola, soy medio malo pero aca seria la cola og");
    cola aux1= algoritmo.generarcola(10);
	algoritmo.mostrarPila(aux1);
    aux1=algoritmo.invertir(aux1);
    System.out.println("nashe");
    algoritmo.mostrarPila(aux1);
    
}

}
