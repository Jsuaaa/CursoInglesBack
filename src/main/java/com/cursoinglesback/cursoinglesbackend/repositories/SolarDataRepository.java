package com.cursoinglesback.cursoinglesbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cursoinglesback.cursoinglesbackend.entities.SolarData;

@Repository
public interface SolarDataRepository extends JpaRepository<SolarData, Long>{

    @Query("SELECT s FROM SolarData s ORDER BY s.timestamp DESC LIMIT 1")
    SolarData findLatest();

}
