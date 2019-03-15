import java.util.ArrayList;

public class TableUtilisateur {
	private ArrayList<Utilisateur> table;
	
	private Utilisateur getUser(int user) {
		int i=0;
		while (i < table.size() && table.get(i).getId() != user)
			i++;
		if (i < table.size())
			return table.get(i);
		return null;
	}
	
	public TableUtilisateur() {
		table = new ArrayList();
	}
	
	public ArrayList<Integer> listeAgenda(int utilisateur) {
		return getUser(utilisateur).getAgendas();
	}
	
	public boolean utilisateurDisponnible(int utilisateur, int rdv) {
		Utilisateur user = getUser(utilisateur);
		//TODO
		return true;
	}
}
