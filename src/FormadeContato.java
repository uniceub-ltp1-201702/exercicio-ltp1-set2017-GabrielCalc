
public class FormadeContato {
	
	private int tipo;
	private String valor;
	
	
	
	@Override
	public String toString() {
		return "FormadeContato [tipo=" + tipo + ", valor=" + valor + "]";
	}
	
	public FormadeContato(int tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
		
	

	
	
	
	
	

}
