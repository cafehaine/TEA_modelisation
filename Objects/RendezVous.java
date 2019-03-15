package Objects;

import java.util.ArrayList;
import java.util.Calendar;

public class RendezVous {
	private static int nbId = 0;
	
	private int id;
	private Calendar date;
	private String titre;
	private Double duree; // 1h30 = 1.5
	private ArrayList<Integer> lstParticipant;
	private ArrayList<Integer> lstConfirmer;
	
	public RendezVous(Calendar date, String titre, Double duree) {
		super();
		this.id = ++nbId;
		this.date = date;
		this.titre = titre;
		this.duree = duree;
		this.lstParticipant = new ArrayList<Integer>();
		this.lstConfirmer = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Double getDuree() {
		return duree;
	}

	public void setDuree(Double duree) {
		this.duree = duree;
	}

	public ArrayList<Integer> getLstparticipant() {
		return lstParticipant;
	}
	
	public ArrayList<Integer> getLstConfirmer() {
		return lstConfirmer;
	}
	
	public boolean addParticipant(int idUtilisateur) {
		return this.lstParticipant.add(idUtilisateur);
	}
	
	public boolean addConfirmer(int idUtilisateur) {
		return this.lstConfirmer.add(idUtilisateur);
	}
	
}
