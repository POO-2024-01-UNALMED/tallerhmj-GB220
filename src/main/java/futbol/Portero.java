package futbol;

public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	public int compareTo(Portero f) {
		int goles = golesRecibidos;
		int golesAComparar = f.golesRecibidos;
			if (goles >= golesAComparar) {
				return (int)goles-golesAComparar;
			} else {
				return (int)golesAComparar-goles;
			}
	}
	
	
	

}
