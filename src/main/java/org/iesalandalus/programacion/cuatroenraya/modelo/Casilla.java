package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Casilla {

	private Ficha ficha;

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) throws OperationNotSupportedException {
		
		if (ficha == null) {
			throw new NullPointerException("ERROR: No se puede poner una ficha nula.");
		}  
		if(estaOcupada()){
			 throw new OperationNotSupportedException("ERROR: Ya contengo una ficha.");// poner aqui operationnosuported o como se ponga.
		}
		
		this.ficha = ficha;
	}

	public Casilla() {

			ficha = null;
		

	}

	public boolean estaOcupada() {

        return ficha != null;


	}

	@Override
	public String toString() {
		
		String colorCadena1letra;
		
		if(ficha == null) {
			colorCadena1letra = " ";
		} else {
			colorCadena1letra= String.format("%s", ficha.toString().charAt(0));
		}
		 return colorCadena1letra;
		
	}

}
