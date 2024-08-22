package ar.edu.unlam.pb2.interfaz;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) { 
		
		Scanner teclado = new Scanner(System.in);
		
        Integer a; 
        Integer b; 
        Integer opcion; 
        Integer resultado = 0; 
        
        do{
        	
        	mostrarPorPantalla("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir"); 
        
        	opcion = teclado.nextInt(); 
        
        }while(opcion < 1 && opcion > 4); 
        
        
        mostrarPorPantalla("Ingrese el primer numero"); 
        a = teclado.nextInt(); 
        
        mostrarPorPantalla("Ingrese el segundo numero"); 
        b = teclado.nextInt(); 
        
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
        
        teclado.close();
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
