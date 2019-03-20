package BaseDeDonnees;

import Objects.RendezVous;

import java.util.ArrayList;

public class TableRendezVous {
	private static ArrayList<RendezVous> tableRendezVous;
	
	public TableRendezVous() {
		if (tableRendezVous == null)
			tableRendezVous = new ArrayList<RendezVous>();
	}
	
	public static RendezVous getRdv(int rdv) {
		return tableRendezVous.get(rdv);
	}
	
	public static ArrayList<RendezVous> listeRendezVousUtilisateur(int utilisateur) {
		ArrayList<RendezVous> lstRdv = new ArrayList<RendezVous>();
		for (int i = 0 ; i < tableRendezVous.size() ; i++){
			ArrayList<Integer> lstConf = tableRendezVous.get(i).getLstConfirmer();
			for (int idPar : lstConf){
				if (idPar == utilisateur)
					lstRdv.add(tableRendezVous.get(i));
			}
		}
		return lstRdv;
	}
	
	public void comfirmeRdv(int utilisateur, int rdv) {
		tableRendezVous.get(rdv).addConfirmer(utilisateur);
	}
	
	public void creerRendezVous(RendezVous rdv) {
		tableRendezVous.add(rdv);
	}
}
