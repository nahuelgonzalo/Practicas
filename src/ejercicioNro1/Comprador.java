package ejercicioNro1;

public class Comprador {
	private String razonSocial;
	private String domicilio;
	
	public Comprador() {
		
	}
	
	public Comprador(String unaRazonSocial, String unDomicilio) {
		razonSocial = unaRazonSocial;
		domicilio = unaRazonSocial;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
}
