package com.sofkau.moto.repository;

import com.sofkau.moto.model.Moto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepos extends JpaRepository<Moto, Integer> {
}
