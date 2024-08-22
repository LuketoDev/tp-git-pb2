package ar.edu.unlam.pb2.interfaz;

import java.util.Scanner;

public class Calculadora {
	
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) { 
		
        Integer a; 
        Integer b; 
        Integer opcion; 
        Integer resultado = 0; 
        
        opcion = ingresoValidoDeMenu();
        
        mostrarPorPantalla("Ingrese el primer numero"); 
        a = TECLADO.nextInt(); 
        
        mostrarPorPantalla("Ingrese el segundo numero"); 
        b = TECLADO.nextInt(); 
        
        switch (opcion) {
        case 1:
        	multiplicacion(a, b);
        	break;
        case 2:
        	resta(a, b);
        	break;
        case 3:
        	suma(a, b);
        	break;
        default:
        	division(a, b);
    		break;
        }
		
        mostrarPorPantalla("El resultado es " + resultado.toString()); 
     
	}


	private static Integer ingresoValidoDeMenu() {
		
		Integer opcion; 
		
		do{
			mostrarPorPantalla("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir"); 
	        
	        opcion = TECLADO.nextInt(); 
	        
	      }while(opcion < 1 && opcion > 4);
		
		return opcion;
	}
	
	private static void mostrarPorPantalla(String mensaje) {
		System.out.println(mensaje);
	}
	
	private static Integer suma(Integer a, Integer b) {
		Integer resultado = a + b;
		return resultado;
	}
	
	private static Integer resta(Integer a, Integer b) {
		Integer resultado = a - b;
		return resultado;
	}
	
	private static Integer multiplicacion(Integer a, Integer b) {
		Integer resultado = a * b;
		return resultado;
	}
	
	private static Integer division(Integer a, Integer b) {
		Integer resultado = a / b;
		return resultado;
	}

}
