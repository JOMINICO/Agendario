package modelo;

public class Evento {
	private String fecha;
	private String hora;
	private String descripcion;
	
	//CONSTRUCTORES
	
	public Evento(String f, String h, String d){
		this.fecha=f;
		this.hora=h;
		this.descripcion=d;
	}
	public Evento (){
		this.fecha="FECHA";
		this.hora="HORA";
		this.descripcion="DESCRIPCION";
	}
	public Evento(Evento e){
		this.fecha= new String();
		this.hora= new String();
		this.descripcion = new String();
	}
	
	// GET
	
	public String getFecha() {
		return fecha;
	}
	public String getHora() {
		return hora;
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	// SET
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// SOBRECARGA DE TOSTRING
	
	@Override
	public String toString() {
		
		return "[" + fecha + "]["
				+ hora + "]["
				+ descripcion + "]";
	}

}
