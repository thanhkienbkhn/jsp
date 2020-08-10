package com.thanhkien.service.impl;

import com.thanhkien.dao.INewDAO;
import com.thanhkien.dao.impl.NewDAO;
import com.thanhkien.dao.impl.UserDao;
import com.thanhkien.service.INewService;

import javax.inject.Inject;

public class NewService<T> implements INewService<T> {


    @Override
    public T save(final T entity) {
        INewDAO dao = new NewDAO();
        dao.save(entity);
        return entity;
    }

    @Override
    public T update(final T entity) {
        INewDAO dao = new UserDao();
        dao.update(entity);
        return entity;
    }
}
