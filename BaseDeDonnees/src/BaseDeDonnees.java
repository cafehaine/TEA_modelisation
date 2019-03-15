
public class BaseDeDonnees {
	public final TableUtilisateur utilisateur;
	public final TableRendezVous rendezVous;
	public final TableAgenda agenda;
	
	public BaseDeDonnees() {
		utilisateur = new TableUtilisateur();
		rendezVous = new TableRendezVous();
		agenda = new TableAgenda();
	}
}
