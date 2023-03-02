package Ejercicio1;

public class Actividadnro1 {

public static void main(String[] args) {

    // Ejercicio 1 parte A: imprimir valores: 5, 6, 7, 8, 9 y 10.

    int Valorinicial = 5;
    int Valorfinal = 10;
    while (Valorinicial <= Valorfinal) {
        System.out.println(Valorinicial);
        Valorinicial++;
    }
}

//Ejercicio 1 parte B
int valorInicial = 5;
int valorFinal = 10;
int i = valorInicial;   {  
while (i <= valorFinal) {
    if (i % 2 == 0) { // verificar si i es par
        System.out.println(i);
    }
    i++;
}
	
        //Ejercicio 1 parte C
			boolean mostrarPares = false; // false para impares, true para pares
			int inicio = 5;
			int fin = 10;

			if (mostrarPares) { // Mostrar números pares
			    int i = inicio % 2 == 0 ? inicio : inicio + 1; // Si el inicio es impar, saltar al siguiente número par
			    while (i <= fin) {
			        System.out.println(i);
			        i += 2;
			    }
			} else { // Mostrar números impares
			    int i = inicio % 2 != 0 ? inicio : inicio + 1; // Si el inicio es par, saltar al siguiente número impar
			    while (i <= fin) {
			        System.out.println(i);
			        i += 2;
			    }
			
//Ejercicio 1 parte D
			    for (int i1 = valorInicial; i1 <= valorFinal; i1++) {
			        if (i1 % 2 != 0) {
			            System.out.println(i1);
			        } else {
			            continue;
			        }
			    }
			 }
}
}

    	 
    	 
    	 
      