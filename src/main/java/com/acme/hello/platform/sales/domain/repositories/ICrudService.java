package com.acme.hello.platform.sales.domain.repositories;

public interface ICrudService<T, ID> {
    T save(T entity);
    T update(T entity);
    void deleteById(ID id);
    T findById(ID id);
}
