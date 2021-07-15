
public class Triangulo extends FigurasGeometricas {
	
	float base;
	float altura;
	
	Triangulo(float base, float altura) {
		super(3, "Triangulo");
		this.altura = altura;
		this.base = base;
	}
	
	public float calcularArea() {
		this.area = (float) this.altura * this.base / 2;
		return area;
	}
}
