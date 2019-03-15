package Interface;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import Objects.Agenda;
import Objects.RendezVous;
import BaseDeDonnees.BaseDeDonnees;
import ServeurMail.ServeurMail;
import Systeme.Systeme;

public class Interface {

	private BaseDeDonnees bdd;
	private ServeurMail serv;
	private Systeme system;

	public void main(String[]args) {
		
		bdd = new BaseDeDonnees();
		serv = new ServeurMail();
		
		system = new Systeme(bdd, serv);
		serv.setSystem(system);

		int numero = identification();
		ArrayList<Integer> mesIdAgendas = bdd.utilisateur.listeAgenda(numero);
		ArrayList<Agenda> mesAgendas = idToAgenda(mesIdAgendas);
		
		int choix = choix();
		
		if (choix == 1) {
			creerRendezVous();
		} else if (choix == 2) {
			afficherAgendaUtilisateur(mesAgendas);
		}else if (choix == 3) {
			System.out.println("A bientot !");
		}
		
	}
	
	public int choix() {
		int choix = -1;
		
		System.out.println("Que Voulez-vous faire ?");
		System.out.println("1 - Ajouter Rendez Vous");
		System.out.println("2 - Voir un Agenda");
		System.out.println("3 - Quitter");
		while (choix != 1 || choix != 2 || choix !=3) {
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
		}
		return choix;
	}
	
	public void creerRendezVous() {
		Calendar date = Calendar.getInstance();
		date.set(2019,03,15, 16, 20);
		RendezVous rdv = new RendezVous(date,"rendezVous 1",1.5);
		
		system.creerRendezVous(rdv);
	}
	
	public int identification() {
		int num = -1;
        try {
        	System.out.println("Bonjour, quel est votre numéro d'utilisateur ? ");
    		Scanner sc = new Scanner(System.in);
    		num = sc.nextInt();
       } catch (Exception e) {
    	   System.out.println("un numéro est demandé");
       }
		
		return num;
	}
	
	public ArrayList<Agenda> idToAgenda(ArrayList<Integer> mesAgendas){
		ArrayList<Agenda> agenda = new ArrayList<Agenda>();
		
		for (int i=0;i<mesAgendas.size();i++){
			agenda.add(bdd.agenda.getAgenda(mesAgendas.get(i)));
		}
		
		return agenda;
	}
	
	public void afficherAgendaUtilisateur(ArrayList<Agenda> mesAgendas) {
		System.out.println("Vos Agendas :");
		
		for (int i=0;i<mesAgendas.size();i++) {
			System.out.println(mesAgendas.get(i).getLabel());
		}
		
		System.out.println("Quel Agenda voulez-vous voir ?");
		try {
			Scanner sc = new Scanner(System.in);
			int idAgenda = sc.nextInt();
			System.out.println(mesAgendas.get(idAgenda));
       } catch (Exception e) {
    	   System.out.println("un numéro est demandé");
       }
				
		
	}
}