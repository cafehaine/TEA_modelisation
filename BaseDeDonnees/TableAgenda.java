package BaseDeDonnees;

import Objects.Agenda;

import java.util.ArrayList;

public class TableAgenda {
	private ArrayList<Agenda> tableAgenda;
	
	public TableAgenda() {
		this.tableAgenda = new ArrayList<Agenda>();
	}
	
	public Agenda getAgenda(int agenda) {
		return this.tableAgenda.get(agenda);
	}
	
	public void ajouterRendezVous(int agenda, int rdv) {
		this.tableAgenda.get(agenda).addRendezVous(TableRendezVous.getRdv(rdv));
	}
}
