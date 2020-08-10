package com.thanhkien.dao.impl;

import com.thanhkien.dao.INewDAO;
import com.thanhkien.utils.database.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class NewDAO<T> implements INewDAO<T> {
    @Override
    public T save(final T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(entity);
        tx.commit();
        session.close();
        return entity;
    }

    @Override
    public T findSingleEntity(final Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        StringBuilder sql = new StringBuilder("FROM UserModel WHERE id = :id");
        List<T> res = session.createQuery(sql.toString()).setParameter("id", id).list();

        return res.get(0);
    }

    @Override
    public T update(final T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(entity);
        tx.commit();
        session.close();
        return entity;
    }
}
