package Objects;

import java.util.ArrayList;


public class Utilisateur {
	
	private static int nbId = 0;
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private ArrayList<Integer> lstAgenda;

	public Utilisateur(String nom, String prenom, String email) {
		super();
		this.id = ++nbId;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.lstAgenda = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Integer> getLstAgenda(){
		return this.lstAgenda;
	}

	
	public String toString() {
		return this.prenom+" "+this.nom+" "+this.email;
	}
	
	
}
