package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Utilisateur;

public class DAOUtilisateur extends AbstractJpaDao<Long, Utilisateur>{

    // private EntityManager manager;

    // public DAOUtilisateur(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(){
    //     int numOfFiche = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList().size();
    //     if (numOfFiche == 0) {
    //         Utilisateur utilisateur = new Utilisateur("Le Floch", "Thomas");
    //         manager.persist(utilisateur);
    //     }
    // }

    // public void delete(Utilisateur utilisateur){
    //     int numOfFiche = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList().size();
    //     if (numOfFiche != 0) {
    //         manager.remove(utilisateur);;
    //     }
    // }
    
    // public List<Utilisateur> getByName(String nom, String prenom){
    //     return manager.createQuery("Select a From Utilisateur Where nom = "+ nom + "and prenom = " + prenom, Utilisateur.class).getResultList();
    // }

    // public void list(){
    //     List<Utilisateur> resultList = manager.createQuery("Select a From Utilisateur a", Utilisateur.class).getResultList();
    //     System.out.println("num of Utilisateur:" + resultList.size());
    //     for (Utilisateur next : resultList) {
    //         System.out.println("next utilisateur: " + next);
    //     }
    // }
}
