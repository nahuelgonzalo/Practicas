package ejercicioNro1;

import java.util.Calendar;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			Comprador unComprador = new Comprador();
			
			Producto producto1 = new Producto();
			
			Producto producto2 = new Producto();
			
			
			
			
			
			
			//Fecha
			Calendar c = Calendar.getInstance();
			String dia = Integer.toString(c.get(Calendar.DATE));
			String mes = Integer.toString(c.get(Calendar.MONTH));
			String annio = Integer.toString(c.get(Calendar.YEAR));
			
			// Programa principal
			
			
			
			//Producto 1
				System.out.println("Ingrese su razon social");
				unComprador.setRazonSocial(scan.nextLine());
				
				System.out.println("Ingrese su domicilio");
				unComprador.setDomicilio(scan.nextLine());
				
				
				
				System.out.println("Ingrese cantidad del producto");
				producto1.setCantidad(scan.nextDouble());
				scan.nextLine();
					
				System.out.println("Ingrese descripcion");
				producto1.setDescripcion( scan.nextLine());
					
				System.out.println("Ingrese valor unitario");
				producto1.setPrecio(scan.nextDouble());
					
					
					
			//Producto2		
					
				System.out.println("Producto 2:");
					
				System.out.println("Ingrese cantidad del producto");
				producto2.setCantidad( scan.nextDouble());
				scan.nextLine();
					
				System.out.println("Ingrese descripcion");
				producto2.setDescripcion(scan.nextLine());
					
				System.out.println("Ingrese valor unitario");
				producto2.setPrecio(scan.nextDouble());
					
					
					
					
					
			
				System.out.println("*************************************************************************************");
				
				System.out.println("Fecha:"+dia+"-"+mes+"-"+annio);
				
				System.out.println("*************************************************************************************");
				
				System.out.println("Nombre: "+unComprador.getRazonSocial());
				System.out.println("Domicilio: "+unComprador.getDomicilio());
				
				System.out.println("*************************************************************************************");
				
				System.out.println("Cant.  | Descripcion		|P.unit					 |P.total");
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println(+producto1.getCantidad() +"      | "+producto1.getDescripcion()+"  		    |  "+producto1.getPrecio()+"			  |  "+producto1.getCantidad()*producto1.getPrecio());
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println(+producto2.getCantidad() +"      | "+producto2.getDescripcion()+"  		    |  "+producto2.getPrecio()+"			  |  "+producto2.getCantidad()*producto2.getPrecio());
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println("IVA: 21%");
				System.out.println("Subtotal (sin IVA):"+((producto1.getCantidad()*producto1.getPrecio()) + (producto2.getCantidad()*producto2.getPrecio())));
				System.out.println("Total:"+((producto1.getCantidad()*producto1.getPrecio() + producto2.getCantidad()*producto2.getPrecio()) * 0.21 + producto1.getCantidad()*producto1.getPrecio() + producto2.getCantidad()*producto2.getPrecio()));
				
				System.out.println("*************************************************************************************");

			
		}
		
		
		
	}

}
