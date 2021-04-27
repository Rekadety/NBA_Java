
public class Partido{

	private Equipo local;
	private Equipo visitante;
	

	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
	}

	
	public Equipo getLocal() {
		return local;
	}


	public void setLocal(Equipo local) {
		this.local = local;
	}


	public Equipo getVisitante() {
		return visitante;
	}


	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}


	public void imprimirPrevia() {
		System.out.println("--EQUIPO LOCAL--");
		local.mostrarEquipo();
		System.out.println("--EQUIPO VISITANTE--");
		visitante.mostrarEquipo();
	}
	
	public void jugarPartido(int puntosLocal, int puntosVisitante) {
		System.out.println("--PUNTOS DEL EQUIPO LOCAL--");
		System.out.println(puntosLocal);
		System.out.println("--PUNTOS DEL EQUIPO VISITANTE--");
		System.out.println(puntosVisitante);
		System.out.println();
		System.out.println(obtenerResultado(puntosLocal, puntosVisitante));
		System.out.println(finPartido(puntosLocal, puntosVisitante));
	}
	
	
	private String obtenerResultado(final int puntosLocal, final int puntosVisitante) {
		 
		int num1 = puntosLocal;
		int num2 = puntosVisitante;
		
	
		return "--RESULTADO DEL PARTIDO-- \n \n "
				+ "El resultado del partido es de " +num1+ " a "+num2+"";
	
	}
	
	private String finPartido(final int puntosLocal, final int puntosVisitante) {
		
		int n1 = puntosLocal; 
		int n2 = puntosVisitante; 
		System.out.println();
		System.out.println("--FINAL DEL PARTIDO--");
		System.out.println();
	if(n2<n1) {
		return "Chicago gana la final de la NBA!!";
	} else if (n1<n2) {
		return "San Antonio gana la final de la NBA!!";
	} else {
		return "Empate! Nos iremos a la prorroga!!";
	}
}
}


