package datosAgendario;

import java.util.ArrayList;
import modelo.Evento;

public class GestDatEndario {
	private static ArrayList<Evento> eventos;
	private static GestDatEndario accesoDatos;
	private GestDatEndario(){
		eventos = new ArrayList<Evento>();
	}
	
	public static GestDatEndario getGestDatEndario(){
		if (accesoDatos==null)
			accesoDatos= new GestDatEndario();
		return accesoDatos;

	}

	public static ArrayList<Evento> getEventos() {
		return eventos;
	}
	
	//NUEVO EVENTO (CON ORDENACION)
	//BORRAR EVENTO (CON ORDENACION)
	//CONSULTAR EVENTO
	//EVENTO DEL DIA (función que recoge las fechas de los eventos y los compara con la fecha del día actual retornando una lista de eventos nueva)
}
