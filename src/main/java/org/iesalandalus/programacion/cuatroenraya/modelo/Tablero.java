package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Tablero {

	public static final int FILAS = 6;

	public static final int COLUMNA = 7;

	public static final int FICHAS_IGUALES_CONSECUTIVAS_NECESARIAS = 4;

	private Casilla[][] casillas = new Casilla[FILAS][COLUMNA];

	public Tablero() {

		for (int i = 0; i < FILAS; i++) { // recorre las filas
			for (int j = 0; j < COLUMNA; j++) { // recoorre las columnas

				casillas[i][j] = new Casilla();

			}
		}
	}

	private boolean columnaVacia(int columna) {

		return !casillas[0][columna].estaOcupada(); // donde 0 es la fila que queremos comprobar ya que, si en la fila 0
													// hay una ficha es porque la columna no esta vacia.

	}

	public boolean estaVacio() {

		boolean tableroVacio = true;

		for (int i = 0; i < casillas.length; i++) {

			if (columnaVacia(i)) {
				tableroVacio = true;
			} else {
				tableroVacio = false;
			}
		}

		return tableroVacio;

	}

	private boolean columnaLlena(int columna) {

		return casillas[5][columna].estaOcupada();

	}

	public boolean estaLleno() {

		boolean tableroLleno = true;

		for (int i = 0; i < casillas.length; i++) {

			if (columnaLlena(i)) {
				tableroLleno = true;
			} else {
				tableroLleno = false;
			}
		}

		return tableroLleno;

	}

	private void comprobarFicha(Ficha ficha) {

		if (ficha == null) {

			throw new NullPointerException("ERROR: La ficha no puede ser nula.");

		}
	}

	private void comprobarColumna(int columna) throws OperationNotSupportedException {

		if (columna < 0 || columna > 6) {
			throw new IllegalArgumentException("ERROR: Columna incorrecta.");
		}
		if (columnaLlena(columna)) {
			throw new OperationNotSupportedException("ERROR: Columna llena.");
		}
	}

	private int getPrimeraFilaVacia(int columna) {
		
		
		/*int fila = 0;
		
		while (fila < FILAS && casillas [fila][columna].estaOcupada()) {
			fila++;
		}
		
		return fila;*/
		

		int posicionFilaVacia = 0;

		for (int i = 0; i < FILAS && casillas[i][columna].estaOcupada(); i++) {

			if (casillas[i][columna]() == null) {

			}
			posicionFilaVacia = i;

		}

		return posicionFilaVacia;

	}
	
	
	private boolean objetivoAlcanzado(int fichasIgualesconsecutivaas) {

		return fichasIgualesconsecutivaas >= FICHAS_IGUALES_CONSECUTIVAS_NECESARIAS;

	}

	private boolean comprobarHorizontal(int fila, Ficha ficha) {

		int contadorFichasmismoColor = 0;

		for (int i = 0; i < COLUMNA && objetivoAlcanzado(contadorFichasmismoColor); i++) {

			if (casillas[fila][i].getFicha() == ficha) { // recorro el array, recorro la fila y cojo las fichas que hay
															// en las columnas (por eso la i) y el .getFicha

				contadorFichasmismoColor++;

			} else {
				contadorFichasmismoColor = 0;
			}

		}
		return objetivoAlcanzado(contadorFichasmismoColor);
	}

	private boolean comprobarVertical (int columna , FICHA ficha) {
		
		int contador
		
	}

}
