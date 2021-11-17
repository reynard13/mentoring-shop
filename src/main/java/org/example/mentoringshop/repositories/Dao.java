package org.example.mentoringshop.repositories;

public interface Dao<T> {
    void save(T t) ;

    T get(int index) ;
}
