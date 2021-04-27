
public class Jugador extends Persona{

	private int altura;
	private String posicion;
	private boolean capitan;
	private String captain; //Para sustituir el valor TRUE/FALSE de la variable booleana
	
	public Jugador(String nombre, String nacionalidad, int edad, int altura, String posicion, boolean capitan) {
		super(nombre, nacionalidad, edad);
		this.altura = altura;
		this.posicion = posicion;
		this.capitan = capitan;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isCapitan() {
		return capitan;
	}

	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}
	
	public void mostrar() {
		captain = this.capitan ? "(C)" : "";
		//Para que no aparezca como resultado TRUE/FALSE
	
		super.mostrar();
		System.out.println("Altura: " +this.altura+ "cm");
		System.out.println("Posición: " +this.posicion);
		System.out.println("Capitan: " +this.captain);
		
	}
}
