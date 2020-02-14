package com.example.apileo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {

    @Override
    List<PlayerEntity> findAll();
}
