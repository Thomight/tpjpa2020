package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.generic.AbstractJpaDao;
import domain.Carte;
import domain.Fiche;
import domain.Tableau;
import domain.Tag;
import domain.Utilisateur;
import jpa.EntityManagerHelper;

public class DAO {
    public static void main(String[] args) {

        EntityManager manager = EntityManagerHelper.getEntityManager();
        
        // AbstractJpaDao<Long,Carte> carte = AbstractJpaDao();

        DAOUtilisateur daoUtilisateur = new DAOUtilisateur();
        DAOTag daoTag = new DAOTag();
        DAOFiche daoFiche = new DAOFiche();
        DAOCarte daoCarte = new DAOCarte();
        DAOTableau daoTableau = new DAOTableau();

        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        try {
            daoUtilisateur.save(new Utilisateur("Le Floch", "Thomas"));;
            daoTag.save(new Tag("tag"));;
            daoFiche.save(new Fiche());;
            daoCarte.save(new Carte());;
            daoTableau.save(new Tableau());;

        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();

        daoUtilisateur.findAll();
        daoTag.findAll();
        daoFiche.findAll();
        daoCarte.findAll();
        daoTableau.findAll();

        manager.close();
        System.out.println(".. done");
    }
}
