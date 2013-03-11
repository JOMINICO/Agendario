import modelo.Calendario;

/**
 * 
 */

/**
 * @author Josemi
 *
 */
import java.util.Scanner;

import datosAgendario.GestDatEndario;
import modelo.*;
public class Agendario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(Calendario.getFechaHora().toString());

		// EVENTO DEL DIA
		// INTRODUCION DE EVENTO
	
		Scanner write = new Scanner(System.in);
		Evento evt1 = new Evento("09/03/2013","20:37","Descripcion");
		System.out.println(evt1);
		//GestDatEndario.getEventos();
		
	}

}
