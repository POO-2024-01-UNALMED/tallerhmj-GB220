package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	

	public int compareTo(Futbolista f) {
		int edad = this.getEdad();
		int edadAComparar = f.getEdad();
			if (edad >= edadAComparar) {
				return edad-edadAComparar;
			} else {
				return edadAComparar-edad;
			}
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}


	@Override
	public String toString() {
		return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	
	

}
