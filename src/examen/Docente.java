package examen;

public class Docente extends Alumno{
	String nivelEstudios;
	
	public Docente(String usuario, String contrasena, String nombres, String apellidos, String correo, long teléfono,
			int dia, int mes, int anio, String nivelEstudios) {
		super(usuario, contrasena, nombres, apellidos, correo, teléfono, dia, mes, anio);
		this.nivelEstudios = nivelEstudios;
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

	public String getNivelEstudios() {
		return nivelEstudios;
	}

	public void setNivelEstudios(String nivelEstudios) {
		this.nivelEstudios = nivelEstudios;
	}
	
	

}
