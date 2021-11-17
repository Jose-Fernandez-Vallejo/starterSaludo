package starter;

public class Saludo {
	
	String idioma;
	String mensaje;
	
	
	public Saludo(String idioma)
	{
		this.idioma = idioma;
	}
	
	public String mensajeSaludo(String mensaje) {
		
		if (mensaje == "") {
			switch (idioma) {
			case "Castellano":
				mensaje = "Hola";
				break;
			
			default:
				mensaje = "Hi all";
				break;
			}
		}
		
		return mensaje;
	}

}
