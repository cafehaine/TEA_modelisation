package BaseDeDonnees;

import Objects.Utilisateur;
import Objects.RendezVous;

import java.util.ArrayList;

public class TableUtilisateur {
	private ArrayList<Utilisateur> tableUtilisateur;
	
	public TableUtilisateur() {
		tableUtilisateur = new ArrayList();
		Utilisateur u1 = new Utilisateur("Jean","Dupuy","Jean.dupuy@gmail.com");
		Utilisateur u2 = new Utilisateur("Jaques","Dupont","Jaques.dupont@gmail.com");
		Utilisateur u3 = new Utilisateur("Claire","Beauchamps","clair.beauchamps@gmail.com");
		tableUtilisateur.add(u1);
		tableUtilisateur.add(u2);
		tableUtilisateur.add(u3);
	}
	
	private Utilisateur getUser(int user) {
		int i=0;
		while (i < tableUtilisateur.size() && tableUtilisateur.get(i).getId() != user)
			i++;
		if (i < tableUtilisateur.size())
			return tableUtilisateur.get(i);
		return null;
	}
	
	//public methods
	public ArrayList<Integer> listeAgenda(int utilisateur) {
		return getUser(utilisateur).getLstAgenda();
	}
	
	public boolean utilisateurDisponnible(int utilisateur, RendezVous rdv) {
		Utilisateur user = getUser(utilisateur);
		ArrayList<RendezVous> tblRdv = TableRendezVous.listeRendezVousUtilisateur(utilisateur);
		Boolean disponible = true;
		for (RendezVous r : tblRdv) {
			if (r.getDate() == rdv.getDate()) {
				disponible = false;
			}
		}
		return disponible;
	}
}
