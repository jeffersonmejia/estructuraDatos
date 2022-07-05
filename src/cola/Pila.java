package cola;

public class Pila {

	private Nodo inicio;
//Inicialización en el constructor

	public Pila() {
		inicio = null;
	}

	public void apilar(int valor) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.setValor(valor);
		if (inicio == null) {
			nuevo.setSiguiente(null);
			inicio = nuevo;
		} else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
	}

	public int desapilar() {
		if (inicio != null) {
			int valor = inicio.getValor();
			inicio = inicio.getSiguiente();
			return valor;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public void mostrarPila() {
		Nodo nuevo = inicio;
		while (nuevo != null) {
			System.out.println("|\t" + nuevo.getValor() + "\t|");
			nuevo = nuevo.getSiguiente();
		}
		System.out.println();
	}
}
