package cola;

public class Nodo {

	private int Valor;
	private Nodo siguiente;

	public Nodo() {
		this.Valor = 0;
		this.siguiente = null;
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int Valor) {
		this.Valor = Valor;
	}

	public Nodo getSiguiente() {
		return this.siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
