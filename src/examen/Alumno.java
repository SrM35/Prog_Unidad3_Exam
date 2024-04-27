package examen;

public class Alumno {
	String usuario;
	String contrasena;
	String Nombres;
	String Apellidos;
	String Correo;
	long Teléfono;
	// fecha de nacimiento
	int dia;
	int mes;
	int anio;
	
	public Alumno(String usuario, String contrasena, String nombres, String apellidos, String correo, long teléfono,
			int dia, int mes, int anio) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		Nombres = nombres;
		Apellidos = apellidos;
		Correo = correo;
		Teléfono = teléfono;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public long getTeléfono() {
		return Teléfono;
	}

	public void setTeléfono(long teléfono) {
		Teléfono = teléfono;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	

}
