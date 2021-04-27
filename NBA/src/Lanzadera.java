
public class Lanzadera {

	public static void main(String[] args) {

		Jugador jugador1 = new Jugador("Charles Barkley", "EEUU", 32, 202,"Ala-Pivot", false);
		Jugador jugador2 = new Jugador("Pau Gasol", "ESP", 37, 218,"Pivot", false);
		Jugador jugador3 = new Jugador("Kobe Bryan", "EEUU", 28, 201,"Alero", true);
		Jugador jugador4 = new Jugador("Chris Paul", "EEUU", 24, 188,"Base", false);
		Jugador jugador5 = new Jugador("Michael Jordan", "EEUU", 32, 198,"Escolta", false);
		
		Jugador jugador6 = new Jugador("Scottie Pippen", "EEUU", 22, 202,"Escolta", false);
		Jugador jugador7 = new Jugador("Karl Malone", "EEUU", 34, 218,"Ala-Pivot", false);
		Jugador jugador8 = new Jugador("Magic Jonshon", "EEUU", 38, 201,"Alero", false);
		Jugador jugador9 = new Jugador("Stephen Curry", "EEUU", 31, 188,"Base", false);
		Jugador jugador10 = new Jugador("Shquille O´Neill", "EEUU", 25, 198,"Pivot", true);
		
		Entrenador entrenador1 = new Entrenador("Phil Jackson", "EEUU", 48, 7);
		Entrenador entrenador2 = new Entrenador("Gregg Poppovich", "EEUU", 64, 25);
		

		Equipo equipo1 = new Equipo("Chicago Bulls", entrenador1);
		Equipo equipo2 = new Equipo("San Antonio Spurs", entrenador2);
		
		Partido partido = new Partido(equipo1, equipo2);
		
		
		equipo1.agregarJugador(jugador1);
		equipo1.agregarJugador(jugador2);
		equipo1.agregarJugador(jugador3);
		equipo1.agregarJugador(jugador4);
		equipo1.agregarJugador(jugador5);
		
		equipo2.agregarJugador(jugador6);
		equipo2.agregarJugador(jugador7);
		equipo2.agregarJugador(jugador8);
		equipo2.agregarJugador(jugador9);
		equipo2.agregarJugador(jugador10);
		
		partido.imprimirPrevia();
		partido.jugarPartido(115, 118);
		

		
	}

}
