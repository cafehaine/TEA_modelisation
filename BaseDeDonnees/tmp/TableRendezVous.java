

import java.util.ArrayList;

public class TableRendezVous {
	private ArrayList<RendezVous> table;
	
	public TableRendezVous() {
		this.table = new ArrayList<RendezVous>();
		
	}
	
	public ArrayList<RendezVous> listeRendezVousUtilisateur(int utilisateur) {
		ArrayList<RendezVous> lstRdv = new ArrayList<RendezVous>();
		for (int i = 0 ; i < table.size() ; i++){
			ArrayList<Integer> lstConf = table.get(i).getLstConfirmer();
			for (int idPar : lstConf){
				if (idPar == utilisateur)
					lstRdv.add(table.get(i));
			}
		}
		return lstRdv;
	}
	
	public void comfirmeRdv(int utilisateur, int rdv) {
		table.get(rdv).addConfirmer(utilisateur);
	}
	
	public void creerRendezVous(RendezVous rdv) {
		table.add(rdv);
	}
}
