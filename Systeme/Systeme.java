import BaseDeDonnees.BaseDeDonnees;
public class Systeme implements SystemeInterface {
	private BaseDeDonnees bdd;
	private ServeurMail servMail;

	public Systeme(BaseDeDonnees bdd, ServeurMail servMail) {
		this.bdd = bdd;
		this.servMail = servMail;
	}
	
	public void creerRendezVous(RendezVous rdv) {
		int idRdv = bdd.rendezVous.creerRendezVous(rdv);
		for (Integer user : rdv.getParticipants()) {
			boolean dispo = bdd.utilisateur.utilisateurDisponnible(user, idRdv);
			if (dispo) {
				servMail.demanderConfirm(user, idRdv);
			}
		}
	}
	
	public void retourConfirm(int utilisateur, int rdv, boolean accepte, int agenda) {
		;
	}
}
