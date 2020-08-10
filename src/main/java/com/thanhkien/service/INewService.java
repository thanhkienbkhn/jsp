package com.thanhkien.service;

public interface INewService<T> {
    T save(T entity);
    T update(T entity);
}
