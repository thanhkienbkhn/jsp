package com.thanhkien.dao;

public interface INewDAO<T> {
    T save (T entity);

    T findSingleEntity(Long id);

    T update(T entity);
}
