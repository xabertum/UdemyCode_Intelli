package lecture172.personasCapaDatos.personasDTO;

public class personasDTO {
	
	private int id_persona;
	private String nombre;
	private String apellido;
	
	public personasDTO() {}
	
	personasDTO (int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString () {
		return "Persona {" + "id_persona" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
		
		
	}
	

}