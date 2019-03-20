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
		
		Calendar date = Calendar.getInstance();
		date.set(2019,03,15, 16, 20);
		RendezVous rdv = new RendezVous(date,"Réunion",1.5);
		rdv.lstParticipant.add(1);
		rdv.lstParticipant.add(2);
		rdv.lstConfimer.add(0);
		
		Calendar date = Calendar.getInstance();
		date.set(2019,04,15, 14, 20);
		RendezVous rdv2 = new RendezVous(date,"Dentiste",0.5);
		rdv2.lstConfimer.add(0);
		
		
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
	
	public String toString() {
		System.out.println("Rdv : "+this.titre+" date : "+this.date+" durée : "+this.duree);
		System.out.println("Participant :");
		for (int i=0;i<this.lstParticipant.size();i++) {
			System.out.println("- "+this.lstParticipant.get(i));
		}
		System.out.println("Confirmé :");
		for (int i=0;i<this.lstConfirmer.size();i++) {
			System.out.println("- "+this.lstConfirmer.get(i));
		}
	}
	
}
