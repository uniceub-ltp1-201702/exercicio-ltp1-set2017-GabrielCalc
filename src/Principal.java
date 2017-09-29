import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bds = new BDSimulado();
		
		System.out.println(bds.totaldeContatos("Burger King"));
		
	
		ArrayList<Contato> getFormadeContato = bds.recupContatos();
		System.out.println(getFormadeContato);
		
		System.out.println(bds.exercicioCinco('M'));
		
		ArrayList<Contato> getContatodaUF = bds.contatosdeUmaUF("SP");
		for (int j = 0; j < getContatodaUF.size(); j++) {
			System.out.println(getContatodaUF.get(j));
			
		}
		
		System.out.println(bds.exercicioSeis("Burger King"));
	}

}
