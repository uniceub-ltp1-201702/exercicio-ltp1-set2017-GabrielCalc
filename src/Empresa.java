
public class Empresa {
	
	private String nome;
	private String cnpj;
	private String cidade;
	private String uf;
	
	
	
	
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cnpj=" + cnpj + ", cidade=" + cidade + ", uf=" + uf + 
				 "]";
	}
	
	
	public Empresa(String nome, String cnpj, String cidade, String uf) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cidade = cidade;
		this.uf = uf;

	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
