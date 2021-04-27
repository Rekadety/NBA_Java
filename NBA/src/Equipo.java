import java.util.ArrayList;

public class Equipo {

	private ArrayList<Jugador> jugadores;
	private String nombre;
	private Entrenador entrenador;

	public Equipo(String nombre, Entrenador entrenador) {
		this.jugadores = new ArrayList<Jugador> ();
		this.nombre = nombre;
		this.entrenador = entrenador;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	public void agregarJugador(Jugador j) {
		this.jugadores.add(j);
	}
	
	public void mostrarEquipo() {
		
		System.out.println();
		System.out.println("   " +this.nombre);
		System.out.println();
		System.out.println("Etrenador: " +entrenador.getNombre());
		System.out.println("Edad: " +entrenador.getEdad());
		System.out.println("Experiencia entrenando: " +entrenador.getExp()+" años");
		System.out.println("Nacionalidad: " +entrenador.getNacionalidad());
		System.out.println();
		System.out.println("--LISTA DE JUGADORES--");
		
		for(int i = 0; i<jugadores.size(); i++) {
			this.jugadores.get(i).mostrar();
		}
		System.out.println();
	}


}
	

