package cola;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Menu menu = new Menu(0, 7);
		Scanner sc = new Scanner(System.in);
		int main, cola, pila;

		while (menu.getFlag() == 0) {
			//MUESTRA MENÚ
			menu.showMain();
			main = sc.nextInt();
			menu.setFlag(main);
			switch (main) {
				//COLA
				case 1: {
					while (menu.getFlag() == 1) {
						menu.showCola();
						cola = sc.nextInt();
						switch (cola) {
							case 1: {
								menu.inCola();
								break;
							}
							case 2: {
								menu.colaRemovedShow();
								break;
							}
							case 3: {
								menu.showNodosCola();
								break;
							}
							case 4: {
								menu.setFlag(0);
								System.out.println("");
								break;
							}
						}
					}
					break;
				}
				//PILA
				case 2: {
					while (menu.getFlag() == 2) {
						menu.showPila();
						pila = sc.nextInt();
						switch (pila) {
							case 1: {
								menu.inPila();
								break;
							}
							case 2: {
								menu.pilaRemovedShow();
								break;
							}
							case 3: {
								menu.showNodosPila();
								break;
							}
							case 4: {
								menu.setFlag(0);
								System.out.println("");
								break;
							}
						}
					}
					break;
				}
				//SALIR

				case 3: {
					System.exit(0);
					break;
				}
			}
		}
	}
}
