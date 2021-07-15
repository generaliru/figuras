import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		FigurasGeometricas figura = new FigurasGeometricas(0);
		System.out.println("Ingresa el lado del cuadrado: ");
		float lado = in.nextFloat();
		Cuadrado cuadrado = new Cuadrado(lado);
		
		System.out.println("Ingresa el base del triangulo: ");
		float base = in.nextFloat();
		System.out.println("Ingresa el altura del triangulo: ");
		float altura = in.nextFloat();
		Triangulo triangulo = new Triangulo(base,altura);
		
		System.out.println("Ingresa el radio del circulo: ");
		float radio = in.nextFloat();
		Circulo circulo = new Circulo(5);
		
		System.out.println(figura.getNombre() + ": " + figura.calcularArea());
		System.out.println(cuadrado.getNombre() + ": " + cuadrado.calcularArea());
		System.out.println(triangulo.getNombre() + ": " + triangulo.calcularArea());
		System.out.println(circulo.getNombre() +  ": " + circulo.calcularArea());
	}

}
