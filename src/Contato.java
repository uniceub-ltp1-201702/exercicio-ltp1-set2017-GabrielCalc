import java.util.ArrayList;

public class Contato {
	
	//Atributos
	private String nome;
	private String dataDeNascimento;
	private String sexo;
	private String cidade;
	private String uf;
	private Empresa empresa;
	private ArrayList<FormadeContato> formadecontato;
	


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public ArrayList<FormadeContato> getFormadecontato() {
		return formadecontato;
	}


	public void setFormadecontato(ArrayList<FormadeContato> formadecontato) {
		this.formadecontato = formadecontato;
	}


	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo + ", cidade="
				+ cidade + ", uf=" + uf + ", empresa=" + empresa + "]";
	}
	
	
	public Contato(String nome, String dataDeNascimento, String sexo, String cidade, String uf, Empresa empresa) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		this.uf = uf;
		this.empresa = empresa;
		this.formadecontato = new ArrayList<FormadeContato>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	public void addContato(FormadeContato contato) {
		formadecontato.add(contato);
	}
}
