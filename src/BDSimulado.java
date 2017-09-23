import java.util.ArrayList;

public class BDSimulado {
	
	//Atributos
	private ArrayList<Contato> contatos;
	private ArrayList<Empresa> empresas;
	

	//Metodo construtor
	public BDSimulado(){
		
		this.empresas = new ArrayList<Empresa>();
		
		Empresa e1 = new Empresa ("", "", "", "");
		Empresa e2 = new Empresa ("", "", "", "");
		Empresa e3 = new Empresa ("", "", "", "");
		
		this.empresas.add(e1);
		this.empresas.add(e2);
		this.empresas.add(e3);
		//Criar a lista de contatos
		this.contatos = new ArrayList<Contato>();
		//Preencher a lista de contatos
		Contato c1 = new Contato ("Carlos Augusto", "08/05/1982", "M", "Brasília", "DF", e1);
		Contato c2 = new Contato ("Max Weber", "21/02/1977", "M", "São Paulo", "SP", e2);
		Contato c3 = new Contato ("Vitor Daleste", "17/04/1988", "M", "Rio de JaneirO", "RJ", e3);
		Contato c4 = new Contato ("Pablo Picasso", "14/03/1976", "M", "Porto Alegre", "RS",  e2);
		Contato c5 = new Contato ("Pedro Vieira", "15/08/1995", "M", "Campinas", "SP", e1);
		Contato c6 = new Contato ("Marcia Luz", "04/04/1884", "F", "Ouro Preto", "MG", e2);
		Contato c7 = new Contato ("Juliana Sabrina", "10/08/1985", "F", "Caxias", "RS", e3);
		Contato c8 = new Contato ("Marianna Godoy", "22/07/1998", "F", "Fortaleza", "CE", e1);
		Contato c9 = new Contato ("Tatiana Cardoso", "19/02/1993", "F", "Recife", "PE", e2);
		Contato c10 = new Contato ("Levi Mires", "25/11/1984", "M", "Riberão Preto", "SP", e3);
		
		
		this.contatos.add(c1);
		this.contatos.add(c2);
		this.contatos.add(c3);
		this.contatos.add(c4);
		this.contatos.add(c5);
		this.contatos.add(c6);
		this.contatos.add(c7);
		this.contatos.add(c8);
		this.contatos.add(c9);
		this.contatos.add(c10);
		
		
	
	}
}
