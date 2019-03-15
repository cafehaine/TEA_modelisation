

import java.util.ArrayList;

public class TableUtilisateur {
	private ArrayList<Utilisateur> tableUtilisateur;
	
	private Utilisateur getUser(int user) {
		int i=0;
		while (i < tableUtilisateur.size() && tableUtilisateur.get(i).getId() != user)
			i++;
		if (i < tableUtilisateur.size())
			return tableUtilisateur.get(i);
		return null;
	}
	
	public TableUtilisateur() {
		tableUtilisateur = new ArrayList();
	}
	
	public ArrayList<Integer> listeAgenda(int utilisateur) {
		return getUser(utilisateur).getLstAgenda();
	}
	
	public boolean utilisateurDisponnible(int utilisateur, int rdv) {
		Utilisateur user = getUser(utilisateur);
		//TODO
		return true;
	}
}
