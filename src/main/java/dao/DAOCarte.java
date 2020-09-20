package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Fiche;
import domain.Section;

public class DAOCarte extends AbstractJpaDao<Long, Carte> {

    // private EntityManager manager;

    // public DAOCarte(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(){
    //     int numOfCarte = manager.createQuery("Select a From Carte a", Carte.class).getResultList().size();
    //     if (numOfCarte == 0) {
    //         Carte carte = new Carte();
    //         manager.persist(carte);
    //     }
    // }

    // public void delete(Carte carte){
    //     int numOfCarte = manager.createQuery("Select a From Carte a", Carte.class).getResultList().size();
    //     if (numOfCarte != 0) {
    //         manager.remove(carte);;
    //     }
    // }

    // public void addFiche(Carte carte, Fiche fiche){
    //     carte.setFiche(fiche);
    //     manager.persist(carte);
    // }

    // public void addSection(Carte carte, Section section){
    //     carte.setSection(section);
    //     manager.persist(carte);
    // }

    // public void list(){
    //     List<Carte> resultList = manager.createQuery("Select a From Carte a", Carte.class).getResultList();
    //     System.out.println("num of Carte:" + resultList.size());
    //     for (Carte next : resultList) {
    //         System.out.println("next carte: " + next);
    //     }
    // }
    
}
