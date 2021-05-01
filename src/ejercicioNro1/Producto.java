package ejercicioNro1;

public class Producto {
	private double cantidad;
	private String descripcion;
	private double precio;
	
	
	public Producto() {
		
	}
	
	public Producto(double unaCantidad, String unaDescripcion,double unPrecio) {
		cantidad = unaCantidad;
		descripcion = unaDescripcion;
		precio = unPrecio;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
