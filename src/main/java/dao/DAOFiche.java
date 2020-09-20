package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Fiche;
import domain.Tag;
import domain.Utilisateur;

public class DAOFiche extends AbstractJpaDao<Long, Fiche>{

    // private EntityManager manager;

    // public DAOFiche(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(){
    //     int numOfFiche = manager.createQuery("Select a From Fiche a", Fiche.class).getResultList().size();
    //     if (numOfFiche == 0) {
    //         Fiche fiche = new Fiche();
    //         manager.persist(fiche);
    //     }
    // }

    // public void delete(Fiche fiche){
    //     int numOfFiche = manager.createQuery("Select a From Fiche a", Fiche.class).getResultList().size();
    //     if (numOfFiche != 0) {
    //         manager.remove(fiche);;
    //     }
    // }

    // public void addUtilisateur(Fiche fiche, Utilisateur utilisateur){
    //     fiche.setUtilisateur(utilisateur);
    //     manager.persist(fiche);
    // }

    // public void addTag(Fiche fiche, List<Tag> tags){
    //     fiche.setTags(tags);
    //     manager.persist(fiche);
    // }

    // public void addCarte(Fiche fiche, Carte carte){
    //     fiche.setCarte(carte);;
    //     manager.persist(fiche);
    // }

    // public void list(){
    //     List<Fiche> resultList = manager.createQuery("Select a From Fiche a", Fiche.class).getResultList();
    //     System.out.println("num of Fiche:" + resultList.size());
    //     for (Fiche next : resultList) {
    //         System.out.println("next fiche: " + next);
    //     }
    // }

}
