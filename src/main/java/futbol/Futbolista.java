package futbol;

public class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private String posicion;
	
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public boolean jugarConLasManos() {
			return true;
	}
	
	public boolean equals(Futbolista f) {
		return equals((Object) f);
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String toString() {
		return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}
