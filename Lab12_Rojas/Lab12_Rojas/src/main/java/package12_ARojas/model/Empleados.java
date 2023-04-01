package package12_ARojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleados {
	@Id
	private int codigo;
	
	@Column(name = "apellidos", length = 40)
	private String apellido;
	
	@Column(name = "nombres", length = 40)
	private String nombre;
	 
	@Column(name = "ocupacion", length = 40) 
	private String ocupacion;
	
	@Column(name = "sueldo") 
	private double sueldo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleados [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", ocupacion="
				+ ocupacion + ", sueldo=" + sueldo + "]";
	} 
	
	
}
