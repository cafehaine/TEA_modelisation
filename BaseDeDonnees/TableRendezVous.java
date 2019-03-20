package BaseDeDonnees;

import Objects.RendezVous;

import java.util.ArrayList;
import java.util.Calendar;

public class TableRendezVous {
	private static ArrayList<RendezVous> tableRendezVous;
	
	public TableRendezVous() {
		if (tableRendezVous == null)
			tableRendezVous = new ArrayList<RendezVous>();
		
		Calendar date = Calendar.getInstance();
		date.set(2019,03,15, 16, 20);
		RendezVous rdv = new RendezVous(date,"Réunion",1.5);
		rdv.addParticipant(2);
		rdv.addParticipant(3);
		rdv.addConfirmer(1);
		
		date = Calendar.getInstance();
		date.set(2019,04,15, 14, 20);
		RendezVous rdv2 = new RendezVous(date,"Dentiste",0.5);
		rdv2.addConfirmer(1);
		
		tableRendezVous.add(rdv);
		tableRendezVous.add(rdv2);
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
