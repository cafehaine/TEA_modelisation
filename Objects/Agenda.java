package Objects;

import java.util.ArrayList;

public class Agenda {
	private static int nbId = 0;

	private int id;
	private String label;
	private ArrayList<Integer> lstRdv;

	public Agenda(String label) {
		super();
		this.id = ++nbId;
		this.label = label;
		this.lstRdv = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ArrayList<Integer> getLstRdv() {
		return lstRdv;
	}

	public void setLstRdv(ArrayList<Integer> lstRdv) {
		this.lstRdv = lstRdv;
	}
	
	public void addRendezVous(int rdv) {
		this.lstRdv.add(rdv);
	}

	public String toString() {
		String ch = "Agenda " + this.label;
		if (this.lstRdv.size() == 0) {
			ch += "\nVous n'avez pas de rendez-vous." ;
		} else {
			ch += "\nMes Rendez-vous :";
			for (int i = 0; i < this.lstRdv.size(); i++) {
				ch+="\n\t- " + this.lstRdv.get(i);
			}
		}
		return ch;
	}

}
