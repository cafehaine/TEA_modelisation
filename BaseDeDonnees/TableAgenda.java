package BaseDeDonnees;

import Objects.Agenda;

import java.util.ArrayList;

public class TableAgenda {
	private ArrayList<Agenda> tableAgenda;
	
	public TableAgenda() {
		this.tableAgenda = new ArrayList<Agenda>();
		Agenda trav = new Agenda("Travail");
		trav.getLstRdv().add(0);
		
		this.tableAgenda.add(trav);
		Agenda perso = new Agenda("Perso");
		perso.getLstRdv().add(1);
		this.tableAgenda.add(perso);
		this.tableAgenda.add(trav);
	}
	
	public Agenda getAgenda(int agenda) {
		return this.tableAgenda.get(agenda);
	}
	
	public void ajouterRendezVous(int agenda, int rdv) {
		this.tableAgenda.get(agenda).addRendezVous(rdv);
	}
}
