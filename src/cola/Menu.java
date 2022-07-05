package cola;

import java.util.Scanner;

public class Menu {

	private final Cola cola;
	private final Pila pila;
	private int flag;
	private final int MAX_DATOS;
	private final Scanner sc;

	public Menu(int flag, int MAX_DATOS) {
		this.flag = flag;
		this.MAX_DATOS = MAX_DATOS;
		this.sc = new Scanner(System.in);
		this.cola = new Cola();
		this.pila = new Pila();
	}

	//MENÚ PRINCIPAL
	public void showMain() {
		System.out.println("Menú de opciones");
		System.out.println("\t1. Cola");
		System.out.println("\t2. Pila");
		System.out.println("\t3. Salir");
		System.out.print("Ingresa una opción, por favor: ");
	}

	/*+++++++++++++++++++++++++++++++++++++++*********** COLA **************************************************************/
	//MUESTRA MENÚ COLA
	public void showCola() {
		System.out.println("\nMenú cola");
		System.out.println("---------");
		System.out.println("\t1. Encolar");
		System.out.println("\t2. Desencolar");
		System.out.println("\t3. Mostrar cola");
		System.out.println("\t4. Volver");
		System.out.print("Ingresa una opción, por favor: ");
	}

	//AGREGA NODOS
	public void inCola() {
		int[] datos = new int[MAX_DATOS];
		System.out.println("Ingresa un dato, permitidos " + MAX_DATOS + ".");
		for (int i = 0; i < MAX_DATOS - 1; i++) {
			datos[i] = sc.nextInt();
			cola.encolar(datos[i]);
		}
		System.out.println("Agregado(s) con éxito");
	}

	//ELIMINA NODOS
	public void colaRemovedShow() {
		cola.desencolar();
		System.out.println("\nDesencolado con éxito");
		System.out.print("Escribe cualquier número para continuar: ");
		sc.nextInt();
	}

	//MUESTRA NODOS
	public void showNodosCola() {
		System.out.println("\nNodos actuales");
		System.out.println("--------------");
		cola.mostrarCola();
		System.out.print("Escribe cualquier número para continuar: ");
		sc.nextInt();
	}

	/*+++++++++++++++++++++++++++++++++++++++*******************************************************************************/

 /*+++++++++++++++++++++++++++++++++++++++*********** PILA **************************************************************/
	//MUESTRA MENÚ PILA
	public void showPila() {
		System.out.println("\nMenú pila");
		System.out.println("---------");
		System.out.println("\t1. Apilar");
		System.out.println("\t2. Desapilar");
		System.out.println("\t3. Mostrar pila");
		System.out.println("\t4. Volver");
		System.out.print("Ingresa una opción, por favor: ");
	}

	public void inPila() {
		int[] datos = new int[MAX_DATOS];
		System.out.println("Ingresa un dato, permitidos " + MAX_DATOS + ".");
		for (int i = 0; i < MAX_DATOS - 1; i++) {
			datos[i] = sc.nextInt();
			pila.apilar(datos[i]);
		}
		System.out.println("Agregado(s) con éxito");
	}

	//ELIMINA NODOS
	public void pilaRemovedShow() {
		pila.desapilar();
		System.out.println("\nDesencolado con éxito");
		System.out.print("Escribe cualquier número para continuar: ");
		sc.nextInt();
	}

	//MUESTRA NODOS
	public void showNodosPila() {
		pila.mostrarPila();
		System.out.print("Escribe cualquier número para continuar: ");
		sc.nextInt();
	}
//GETTER AND SETTER

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
