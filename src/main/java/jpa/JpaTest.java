package jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.DAOCarte;
import dao.DAOFiche;
import dao.DAOSection;
import dao.DAOTableau;
import dao.DAOTag;
import dao.DAOUtilisateur;
import domain.Carte;
import domain.Fiche;
import domain.Section;
import domain.Tableau;
import domain.Tag;
import domain.Utilisateur;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		DAOCarte daoCarte = new DAOCarte();
		DAOFiche daoFiche = new DAOFiche();
		DAOSection daoSection = new DAOSection();
		DAOTableau daoTableau = new DAOTableau();
		DAOTag daoTag = new DAOTag();
		DAOUtilisateur daoUtilisateur = new DAOUtilisateur();

		// daoCarte.save(new Carte());
		// daoFiche.save(new Fiche());
		// daoSection.save(new Section("section"));
		// daoTableau.save(new Tableau());
		// daoTag.save(new Tag("tag"));
		// daoUtilisateur.save(new Utilisateur());

		// reset(daoCarte, daoFiche, daoSection, daoTableau, daoTag, daoUtilisateur);

		System.out.println(daoCarte.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());
		System.out.println(daoFiche.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());
		System.out.println(daoSection.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());
		System.out.println(daoTableau.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());
		System.out.println(daoTag.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());
		System.out.println(daoUtilisateur.findAll().stream().map(c -> c.getId()).collect(Collectors.toList()).toString());

	}

	private static void reset(DAOCarte daoCarte, DAOFiche daoFiche, DAOSection daoSection,
		DAOTableau daoTableau, DAOTag daoTag, DAOUtilisateur daoUtilisateur) {
		if (daoCarte != null){
			for (Carte carte : daoCarte.findAll()) {
			daoCarte.delete(carte);
			}
		}
		if (daoFiche != null){
			for (Fiche fiche : daoFiche.findAll()) {
				daoFiche.delete(fiche);
			}
		}
		if (daoSection != null){
			for (Section section : daoSection.findAll()) {
				daoSection.delete(section);
			}
		}
		if (daoTableau != null){
			for (Tableau tableau : daoTableau.findAll()) {
				daoTableau.delete(tableau);
			}
		}
		if (daoTag != null){
			for (Tag tag : daoTag.findAll()) {
				daoTag.delete(tag);
			}
		}
		if (daoUtilisateur != null){
			for (Utilisateur utilisateur : daoUtilisateur.findAll()) {
				daoUtilisateur.delete(utilisateur);
			}
		}
	}


}
