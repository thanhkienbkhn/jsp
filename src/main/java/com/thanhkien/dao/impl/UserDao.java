package com.thanhkien.dao.impl;

import com.thanhkien.model.UserModel;
import com.thanhkien.utils.database.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao extends  NewDAO<UserModel> {
    @Override
    public UserModel update(final UserModel entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        entity.setUserName("Updated");
        entity.setAddress("Updated");
        session.merge(entity);
        tx.commit();
        session.close();
        return entity;
    }
}
