package com.example.demo.repository;

import java.util.List;

public interface BaseRepository<T> {

    List<T> findAll();

    T findById(int id);

    //you may add any other required method
}
