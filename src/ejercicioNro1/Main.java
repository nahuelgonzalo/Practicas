package ejercicioNro1;

import java.util.Calendar;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			Comprador unComprador = new Comprador();
			
			Producto producto1 = new Producto();
			
			
			
			
			
			
			
			
			//Fecha
			Calendar c = Calendar.getInstance();
			String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH));
			String annio = Integer.toString(c.get(Calendar.YEAR));
			
			// Programa principal
			
			
			
			//Lectura de comprador y producto 1
			
			
			
				leerComprador(scan, unComprador);
				
				imprimirPrimero(unComprador, dia, mes, annio);
				procesarVentas(scan, producto1);	
					
					
			
					
					
					
					
			
				
				
				
				
				
				

			
		}
		
		
		
	}

	private static void imprimirFinal(Producto producto1,double subtotal) {
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.println("IVA: 21%");
		System.out.println("Subtotal (sin IVA):"+ subtotal );
		System.out.println("Total:"+ subtotal * 0.21  );
		
		System.out.println("*************************************************************************************");
	}

	private static void imprimirDos(Producto producto1) {
		System.out.println(+producto1.getCantidad() +"      | "+producto1.getDescripcion()+"  		    |  "+producto1.getPrecio()+"			  |  "+producto1.getCantidad()*producto1.getPrecio());
		
		System.out.println("-------------------------------------------------------------------------------------");
	}

	private static void imprimirPrimero(Comprador unComprador, String dia, String mes, String annio) {
		System.out.println("*************************************************************************************");
		
		System.out.println("Fecha:"+dia+"-"+mes+"-"+annio);
		
		System.out.println("*************************************************************************************");
		
		System.out.println("Nombre: "+unComprador.getRazonSocial());
		System.out.println("Domicilio: "+unComprador.getDomicilio());
		
		System.out.println("*************************************************************************************");
		
		System.out.println("Cant.  | Descripcion		|P.unit					 |P.total");
		System.out.println("-------------------------------------------------------------------------------------");
	}

	private static void procesarVentas(Scanner scan, Producto producto1) {
		boolean seguirProcesando = true;
		
		double montoProducto, subtotal=0;
		
		
		while( seguirProcesando ) {
			
			leerProducto(scan, producto1);
			
			 montoProducto = producto1.getCantidad()*producto1.getPrecio();
			
			 subtotal = subtotal + montoProducto;
			 
			//finaliza el while si la cantidad de productos es igual a 0
			if(producto1.getCantidad() == 0) {
				seguirProcesando = false;
				
			}imprimirDos(producto1);
			
		}imprimirFinal(producto1,subtotal);
	}

	private static void leerProducto(Scanner scan, Producto producto1) {
		System.out.println("Ingrese cantidad del producto");
		producto1.setCantidad(scan.nextDouble());
		scan.nextLine();
			
		System.out.println("Ingrese descripcion");
		producto1.setDescripcion( scan.nextLine());
			
		System.out.println("Ingrese valor unitario");
		producto1.setPrecio(scan.nextDouble());
	}

	private static void leerComprador(Scanner scan, Comprador unComprador) {
		System.out.println("Ingrese su razon social");
		unComprador.setRazonSocial(scan.nextLine());
		
		System.out.println("Ingrese su domicilio");
		unComprador.setDomicilio(scan.nextLine());
	}

}
