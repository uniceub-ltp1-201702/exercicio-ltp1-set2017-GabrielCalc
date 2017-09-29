import java.util.ArrayList;
import java.util.Collection;

public class BDSimulado {
	
	//Atributos
	private ArrayList<Contato> contatos;
	private ArrayList<Empresa> empresas;
	

	//Metodo construtor
	public BDSimulado(){
		
		this.empresas = new ArrayList<Empresa>();
		
		Empresa e1 = new Empresa ("McDonald", "74.445.558", "Brasília", "DF");
		Empresa e2 = new Empresa ("Burger King", "57.889.665", "Rio de Janeiro", "RJ");
		Empresa e3 = new Empresa ("Subway", "98.778.564", "São Paulo", "SP");
		
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
		
		FormadeContato f11 = new FormadeContato(1, "carlos.augusto@uniceub.br");
		FormadeContato f21 = new FormadeContato(2, "(61) 99875-0212");
		FormadeContato f31 = new FormadeContato(3, "(61) 3245-2754");
		
		FormadeContato f12 = new FormadeContato(1, "max.weber@hotmail.com");
		FormadeContato f32 = new FormadeContato(2, "(11) 99875-1232");
		FormadeContato f33 = new FormadeContato(3, "carlos.augusto@uniceub.br");
		
		FormadeContato f22 = new FormadeContato(2, "(22) 98754-6598");
		FormadeContato f23 = new FormadeContato(3, "(22) 3265-7685");
		
		FormadeContato f44 = new FormadeContato(3, "(53) 3275-7885");
		
		FormadeContato f41 = new FormadeContato(2, "(11) 99265-5685");
		
		FormadeContato f42 = new FormadeContato(1, "Marcia@yahoo.com.br");
		
		FormadeContato f43 = new FormadeContato(1, "Sabribri@gmail.com");
		FormadeContato f34 = new FormadeContato(2, "(53) 9987-2454");
		
		FormadeContato f51 = new FormadeContato(1, "MariGod@hotmail.com");
		
		FormadeContato f52 = new FormadeContato(1, "Tati.Car@bol.com.br");
		
		FormadeContato f53 = new FormadeContato(2, "Levi@hotmail.com");
		FormadeContato f54 = new FormadeContato(2, "(11) 9283-2754");
		FormadeContato f55 = new FormadeContato(2, "(1) 2245-2454");
		
		c1.addContato(f11);
		c1.addContato(f21);
		c1.addContato(f31);
		
		c2.addContato(f12);
		c2.addContato(f32);
		c2.addContato(f33);
		
		c3.addContato(f22);
		c3.addContato(f23);
		
		c4.addContato(f44);
		
		c5.addContato(f41);
		
		c6.addContato(f42);
		
		c7.addContato(f43);
		c7.addContato(f34);
		
		c8.addContato(f51);
		
		c9.addContato(f52);
		
		c10.addContato(f53);
		c10.addContato(f54);
		c10.addContato(f55);
		
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
	
	//Metodo que recupera todos os contatos
	 public ArrayList<Contato> recupContatos(){
		ArrayList<Contato> resultado = new ArrayList<Contato>();
		
		for (int i = 0; i < this.contatos.size(); i++){
				resultado.add(this.contatos.get(i));
			
		}
		return resultado;
	}
	
	
	 public ArrayList<Contato> contatosdeUmaUF(String UF){
		ArrayList<Contato> resultado = new ArrayList<Contato>();
		
		for (int i = 0; i < this.contatos.size(); i++){
			if (this.contatos.get(i).getUf().equals(UF)) {
				resultado.add(this.contatos.get(i));
			}
				
			
		}
		return resultado;
	}
	 
	 //Exercicio 5
	 public ArrayList<String> exercicioCinco (char letra){
		 ArrayList<String> resultado = new ArrayList<String>();
		 
		 for (int i = 0; i < this.contatos.size(); i++) {
			 char primeiraLetra = this.contatos.get(i).getNome().charAt(0);
			 if (primeiraLetra == letra){
				 resultado.add(this.contatos.get(i).getNome());			
			 }			 
		}
		 return resultado;
	 }
	 
	 public ArrayList<Contato> exercicioSeis (String empresa){
		 ArrayList<Contato> resultado = new ArrayList<Contato>();
		 for (int j=0; j<contatos.size();j++){
				 if (this.contatos.get(j).getSexo().equals("F") && this.contatos.get(j).getEmpresa().getNome().equals(empresa) ){
					 		resultado.add(contatos.get(j));
					 	}
				 }
		return resultado;	
		}
	
	 public ArrayList<String> totaldeContatos(String empresa){
		 ArrayList<String> resultado = new ArrayList<String>();
		 int contatos = 0;
		 for (int i = 0; i < this.contatos.size(); i++) {
			 if (this.contatos.get(i).getEmpresa().getNome().equals(empresa)){
				 if (!(resultado.contains(empresa))){
					 resultado.add(this.contatos.get(i).getEmpresa().getNome());
				 }
				 contatos++;
			 }
		}
 		 resultado.add("Numero de contatos: " + contatos);
		 return resultado;
	 }
	 

}
	