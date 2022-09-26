
public class CLRectangulo {

	private double altura;
	private double base;
	
	public CLRectangulo() {
	}
	
	public CLRectangulo(double unaBase, double unaAltura) {
		base= unaBase;
		altura= unaAltura;
	}
	//Gets and Sets
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double unaBase) {
		base= unaBase;
	}
	
	
	
	public void setAltura(double unaAltura) {
		altura= unaAltura;
	}
	
	// func min req.
	public boolean equals(CLRectangulo otro) {
		boolean respuesta;
		
		respuesta = (base ==otro.base && altura== otro.altura);
		return respuesta;
	}
	public int compareTo(CLRectangulo otro) {
		int respuesta;
	
		if (base > otro.base && altura> otro.altura) 
			 respuesta = 1;
		else
		if (base ==otro.base && altura== otro.altura)
			respuesta = 0;
			else
				respuesta = -1;		
			return respuesta;
	}
	public String toString() {
		StringBuilder texto;
		
		texto = new StringBuilder();
		texto.append(base + "x" + altura);
		return texto.toString();
	}
	
	public double calcularArea() {
		return base *altura;
	}
	
	public double calcularPerimetro() {
		return (base+altura)*2;	
	}
	
	
}

