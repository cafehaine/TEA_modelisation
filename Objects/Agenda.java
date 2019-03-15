package Objects;

import java.util.ArrayList;


public class Agenda {
	private static int nbId = 0;
	
	private int id;
	private String label;
	private ArrayList<RendezVous> lstRdv;
	
	public Agenda(String label) {
		super();
		this.id = ++nbId;
		this.label = label;
		this.lstRdv = new ArrayList<RendezVous>();
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

	public ArrayList<RendezVous> getLstRdv() {
		return lstRdv;
	}

	public void setLstRdv(ArrayList<RendezVous> lstRdv) {
		this.lstRdv = lstRdv;
	}
	
	
	
}
