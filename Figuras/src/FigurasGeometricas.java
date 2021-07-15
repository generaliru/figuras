
public class FigurasGeometricas {
	
	protected float area = 0;
	protected float num_lados;
	protected String nombre;
	
	FigurasGeometricas(int num_lados){
		this.nombre = "Figura";
		this.num_lados = num_lados;
	}
	
	FigurasGeometricas(int num_lados, String nombre){
		this.nombre = nombre;
		this.num_lados = num_lados;
	}
	
	public float calcularArea() {
		return area;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

}
