
public class Cuadrado extends FigurasGeometricas {
	
	float lado;
	
	Cuadrado(float lado){
		super(4, "Cuadrado");
		this.lado = lado;
	}
	
	public float calcularArea() {
		this.area = this.lado * this.lado;
		return area;
	}
}
