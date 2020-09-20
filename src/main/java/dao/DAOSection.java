package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Section;
import domain.Tableau;

public class DAOSection extends AbstractJpaDao<Long, Section>{

    // private EntityManager manager;

    // public DAOSection(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(String nom){
    //     int numOfSection = manager.createQuery("Select a From Section a", Section.class).getResultList().size();
    //     if (numOfSection == 0) {
    //         Section section = new Section(nom);
    //         manager.persist(section);
    //     }
    // }

    // public void delete(Section section){
    //     int numOfSection = manager.createQuery("Select a From Section a", Section.class).getResultList().size();
    //     if (numOfSection != 0) {
    //         manager.remove(section);;
    //     }
    // }

    // public void addCarte(Section section, List<Carte> cartes){
    //     section.setCartes(cartes);
    //     manager.persist(section);
    // }

    // public void addTableau(Section section, Tableau tableau){
    //     section.setTableau(tableau);
    //     manager.persist(section);
    // }

    // public void list(){
    //     List<Section> resultList = manager.createQuery("Select a From Section a", Section.class).getResultList();
    //     System.out.println("num of Section:" + resultList.size());
    //     for (Section next : resultList) {
    //         System.out.println("next carte: " + next);
    //     }
    // }    
}
