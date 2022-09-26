


public class CLCirculo {

	private double radio; 
	//CONSTRUCTORES
	public CLCirculo(){	
	}
	public CLCirculo(double unRadio) {
		radio= unRadio;
	}
	
	// GETS AND SETS
	public double getRadio() {
		return radio;
	}
	public void setRadio(double unRadio) {
		radio= unRadio;
	}
	
	public boolean equals(CLCirculo otroCirculo) {
		 return (radio== otroCirculo.radio);
	}
	
	public int compare(CLCirculo otroCirculo) {
		int comparaTuVara;
		
		if (radio> otroCirculo.radio)
			comparaTuVara=1;
		else 
			if (radio== otroCirculo.radio) {
				comparaTuVara=0;
			}
			else 
				comparaTuVara=-1;
		return comparaTuVara;			
	}
	
	public String toString() {
		StringBuilder texto;
		
		texto = new StringBuilder();
		texto.append("Circulo con radio" + radio);
		return texto.toString();
	}
	
	
	public double calcularArea() {
		return Math.PI* Math.pow(radio, 2);
	}
	
	public double calcularPerimetro() {
		return Math.PI*2*radio;	
	}
	
	
	
}
