package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Section;
import domain.Tableau;

public class DAOTableau extends AbstractJpaDao<Long, Tableau>{

    // private EntityManager manager;

    // public DAOTableau(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(){
    //     int numOfCarte = manager.createQuery("Select a From Tableau a", Tableau.class).getResultList().size();
    //     if (numOfCarte == 0) {
    //         Tableau tableau = new Tableau();
    //         manager.persist(tableau);
    //     }
    // }

    // public void delete(Tableau tableau){
    //     int numOfTableau = manager.createQuery("Select a From Tableau a", Tableau.class).getResultList().size();
    //     if (numOfTableau != 0) {
    //         manager.remove(tableau);;
    //     }
    // }

    // public void addSections(Tableau tableau, List<Section> sections){
    //     tableau.setSections(sections);
    //     manager.persist(tableau);
    // }

    // public void addDefaultSections(Tableau tableau){
    //     tableau.setDefaultSections();
    //     manager.persist(tableau);
    // }

    // public void list(){
    //     List<Tableau> resultList = manager.createQuery("Select a From Tableau a", Tableau.class).getResultList();
    //     System.out.println("num of Tableau:" + resultList.size());
    //     for (Tableau next : resultList) {
    //         System.out.println("next carte: " + next);
    //     }
    // }
    
}
