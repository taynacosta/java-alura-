package escola;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(ddd == null || numero == null){
			throw new IllegalArgumentException("Número de telefone ou DDD obrigatórios!");
		}
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("Formato do DDD invalido!");
		}
		if(!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Formato de telefone invalido!");
		}
		this.setDdd(ddd);
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
}
