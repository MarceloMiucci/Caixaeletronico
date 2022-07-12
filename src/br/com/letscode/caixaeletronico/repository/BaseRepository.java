package br.com.letscode.caixaeletronico.repository;

import java.util.List;

public interface BaseRepository<T> {

    List<T> findAll();

    T findById(int id);

    void adiciona(T objeto);
}
