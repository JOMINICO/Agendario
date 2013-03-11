package modelo;
import java.util.*;

public class Calendario {
	private static Calendario fechaHora;
	private static GregorianCalendar calendario;

	private Calendario() {
		calendario = new GregorianCalendar();
	}

	public static Calendario getFechaHora() {
		if (fechaHora == null)
			fechaHora = new Calendario();
		return fechaHora;
	}

	// SOBRECARGA TOSTRING()
	@Override
	public String toString() {
		return "[" + calendario.get(calendario.DATE) + "/"
				+ (calendario.get(calendario.MONTH) + 1) + "/"
				+ calendario.get(calendario.YEAR) + "]" + "["
				+ calendario.get(calendario.HOUR_OF_DAY) + ":"
				+ calendario.get(calendario.MINUTE) + "]";
	}

}
