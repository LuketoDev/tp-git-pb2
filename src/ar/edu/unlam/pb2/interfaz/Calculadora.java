package ar.edu.unlam.pb2.interfaz;

import java.util.Scanner;

public class Calculadora {
	
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) { 
		
        Integer a; 
        Integer b; 
        Integer opcion; 
        Integer resultado; 
        
        opcion = ingresoValidoDeMenu();
        
        System.out.println("Ingrese el primer numero"); 
        a = TECLADO.nextInt(); 
        
        System.out.println("Ingrese el segundo numero"); 
        b = TECLADO.nextInt(); 
        
        switch (opcion) {
        
        case 1:
        	resultado = a * b;
        	break;
        	
        case 2:
        	resultado = a - b;
        	break;
        	
        case 3:
        	resultado = a + b; 
        	break;
        	
        default:
    		resultado = a / b; 
    		break;
        }
		
        System.out.println("El resultado es " + resultado.toString()); 
     
	}

	private static Integer ingresoValidoDeMenu() {
		
		Integer opcion; 
		
		do{
        	
	        System.out.println("Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir"); 
	        
	        opcion = TECLADO.nextInt(); 
	        
	      }while(opcion < 1 && opcion > 4);
		
		return opcion;
	}
	
	
}
