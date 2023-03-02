package Ejercicio2;

public class Ejercicio2D {

	public static void main(String[] args) {
		float ingresos = 489083;  // Ingresos mensuales totales del hogar
		int vehiculos = 3;  // Número de vehículos con una antigüedad menor a 5 años
		int inmuebles = 3;  // Número de inmuebles
		boolean tiene_embarcacion = true;  // Si el hogar tiene una embarcación
		boolean tiene_aeronave = false;  // Si el hogar tiene una aeronave de lujo
		boolean tiene_activos_societarios = false;  // Si el hogar es titular de activos societariosque demuestren capacidad económica plena

		if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || tiene_embarcacion || tiene_aeronave || tiene_activos_societarios) {
		    System.out.println("El hogar cumple con alguna de las condiciones especificadas.");
		} else {
		    System.out.println("El hogar no cumple con ninguna de las condiciones especificadas.");
		}

	}

}
