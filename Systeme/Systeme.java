package Systeme;

import BaseDeDonnees.BaseDeDonnees;
import ServeurMail.ServeurMail;
import SystemeInterface.SystemeInterface;
import Objects.RendezVous;

public class Systeme implements SystemeInterface {
	private BaseDeDonnees bdd;
	private ServeurMail servMail;

	public Systeme(BaseDeDonnees bdd, ServeurMail servMail) {
		this.bdd = bdd;
		this.servMail = servMail;
	}
	
	public void creerRendezVous(RendezVous rdv) {
		bdd.rendezVous.creerRendezVous(rdv);
		for (Integer user : rdv.getLstparticipant()) {
			boolean dispo = bdd.utilisateur.utilisateurDisponnible(user, rdv);
			if (dispo) {
				servMail.demanderConfirm(user, rdv.getId());
			}
		}
	}
	
	@Override
	/**
	 * Ici je pense l'utilisateur dispensable, Johan
	 */
	public void retourConfirm(int user, int rdv, boolean accepte, int agenda) {
		if (accepte) {
			bdd.agenda.ajouterRendezVous(agenda, rdv);
		}
	}
}
