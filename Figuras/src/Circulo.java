
public class Circulo extends FigurasGeometricas{
	
	float radio;
	
	Circulo(float radio){
		super(0, "Circulo");
		this.radio = radio;
	}
	
	public float calcularArea() {
		float area = (float) (this.radio*Math.PI*this.radio);
		return area;
	}
}
