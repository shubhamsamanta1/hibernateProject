package com.projectA.hibernateProject.formDAO;

import com.projectA.hibernateProject.formEntity.formEntity;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class formDAOImpl implements formDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public formEntity save(formEntity formentity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.persist(formentity);
        return formentity;
    }


    @Override
    public formEntity update(formEntity formentity) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.merge(formentity);
        return formentity;
    }

    @Override
    public List<formEntity> delete(int ID) {
        Session currentSession = entityManager.unwrap(Session.class);
        formEntity formEntity  = currentSession.get(formEntity.class, ID);
        currentSession.remove(formEntity);
        Query<formEntity> query = currentSession.createQuery("from formEntity",formEntity.class);
        List<formEntity> list = query.getResultList();
        return list;
    }

    @Override
    public formEntity getAllById(int ID) {
        Session currentSession = entityManager.unwrap(Session.class);
        formEntity formEntity  = currentSession.get(formEntity.class, ID);
        return formEntity;
    }

    @Override
    public List<formEntity> getAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<formEntity> query = currentSession.createQuery("from formEntity",formEntity.class);
        List<formEntity> list = query.getResultList();
        return list;
    }
}
