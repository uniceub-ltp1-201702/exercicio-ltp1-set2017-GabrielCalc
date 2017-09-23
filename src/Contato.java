
public class Contato {
	
	//Atributos
	public String nome;
	public String dataDeNascimento;
	public String sexo;
	public String cidade;
	public String uf;
	public Empresa empresa;
	


	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", sexo=" + sexo + ", cidade="
				+ cidade + ", uf=" + uf + ", empresa=" + empresa + "]";
	}
	
	
	public Contato(String nome, String dataDeNascimento, String sexo, String cidade, String uf, Empresa empresa) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		this.uf = uf;
		this.empresa = empresa;
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
	
	

}
