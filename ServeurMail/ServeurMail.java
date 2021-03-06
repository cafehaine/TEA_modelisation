package ServeurMail;

import java.util.ArrayList;

import SystemeInterface.SystemeInterface;
import BaseDeDonnees.BaseDeDonnees;

public class ServeurMail {

	private BaseDeDonnees bdd;
	private SystemeInterface system;

	public ServeurMail() {
		this.bdd = new BaseDeDonnees();
		this.system = null;
	}

	public void setSystem(SystemeInterface sys) {
		this.system = sys;
	}

	public void demanderConfirm(int utilisateur, int rdv) {
		ArrayList<Integer> liste_Agenda = bdd.utilisateur.listeAgenda(utilisateur);

		//ArrayList<Agenda> mesAgendas = idAgendaToAgenda(liste_Agenda); 
		int idAgenda = agendaAlea(liste_Agenda.size());
		boolean accepte = booleanAlea();

		system.retourConfirm(utilisateur,rdv,accepte,idAgenda);

	}

	/*
	public ArrayList<Agenda> idAgendaToAgenda(ArrayList<Integer> listeIdAgenda){
		ArrayList <Agenda> lstAgenda = new ArrayList<Agenda>();
		for (int i=0;i<listeIdAgenda.size();i++) {
			lstAgenda.add(bdd.getAgenda(liste_Agenda.get(i)));
		}
		return lstAgenda;
	}
	*/

	public int agendaAlea(int nb) {
		int idAgenda = (int)(Math.random()*(nb-1)) + 1;
		return idAgenda;
	}

	public boolean booleanAlea() {
		int valbool = (int)(Math.random()*(1-0)) + 0;
		return valbool == 1;
	}
}
