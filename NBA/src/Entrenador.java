import java.util.ArrayList;

public class Entrenador extends Persona{

	private int exp;
	private ArrayList<Equipo> equipos;

	public Entrenador(String nombre, String nacionalidad, int edad, int exp) {
		super(nombre, nacionalidad, edad);
		this.exp = exp;
		this.equipos = new ArrayList<Equipo>();
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public void mostrar() {
		
		System.out.println();
		System.out.println("--ENTRENADOR--");
		super.mostrar();
		System.out.println("Experiencia: " +this.exp);
		
	}
	
}
