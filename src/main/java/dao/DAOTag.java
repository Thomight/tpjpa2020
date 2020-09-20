package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dao.generic.AbstractJpaDao;
import domain.Tag;

public class DAOTag extends AbstractJpaDao<Long, Tag>{

    // private EntityManager manager;

    // public DAOTag(EntityManager manager) {
    //     this.manager = manager;
    // }

    // public void create(){
    //     int numOfFiche = manager.createQuery("Select a From Tag a", Tag.class).getResultList().size();
    //     if (numOfFiche == 0) {
    //         Tag tag = new Tag("Tag");
    //         manager.persist(tag);
    //     }
    // }

    // public void delete(Tag tag){
    //     int numOfFiche = manager.createQuery("Select a From Tag a", Tag.class).getResultList().size();
    //     if (numOfFiche != 0) {
    //         manager.remove(tag);;
    //     }
    // }
    
    // public List<Tag> getByName(String query){
    //     return manager.createQuery("Select a From Tag Where nom = " + query, Tag.class).getResultList();
    // }

    // public void list(){
    //     List<Tag> resultList = manager.createQuery("Select a From Tag a", Tag.class).getResultList();
    //     System.out.println("num of Tag:" + resultList.size());
    //     for (Tag next : resultList) {
    //         System.out.println("next tag: " + next);
    //     }
    // }

}
