package cola;

public class Cola {

	private Nodo inicio;
	private Nodo fin;

	public void Cola() {
		inicio = null;
		fin = null;
	}

	public boolean esVacia() {
		return inicio == null;
	}

	public void encolar(int valor) {
		Nodo nuevo = new Nodo();
		nuevo.setValor(valor);
		if (esVacia()) {
			inicio = nuevo;
			fin = nuevo;
		} else {
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}

	public int desencolar() {
		if (!esVacia()) {
			int dato = inicio.getValor();
			if (inicio == fin) {
				inicio = null;
				fin = null;
			} else {
				inicio = inicio.getSiguiente();
			}
			return dato;
		} else {
			return Integer.MAX_VALUE;
		}
	}

	public boolean buscar(int aBuscar) {
		Nodo aux = inicio;
		boolean existe = false;
		while (existe != true && aux != null) {
			if (aBuscar == aux.getValor()) {
				existe = true;
			} else {
				aux = aux.getSiguiente();
			}
		}
		return existe;
	}

	public void eliminar() {
		inicio = null;
		fin = null;
	}

	public void retirar() {
		if (!esVacia()) {
			inicio = inicio.getSiguiente();
		}
	}

	public void mostrarCola() {
		if (!esVacia()) {
			Nodo aux = inicio;
			while (aux != null) {
				System.out.println("|\t" + aux.getValor() + "\t|");
				aux = aux.getSiguiente();
			}
		} else {
			System.out.println("Cola vacía");
		}
	}

	public int cantidad() {
		int cant = 0;
		Nodo aux = inicio;
		while (aux != null) {
			cant++;
			aux = aux.getSiguiente();
		}
		return cant;
	}

	public int cima() throws Exception {
		if (!esVacia()) {
			return inicio.getValor();
		} else {
			throw new Exception("La pila se encuenta vacia");
		}
	}
}
