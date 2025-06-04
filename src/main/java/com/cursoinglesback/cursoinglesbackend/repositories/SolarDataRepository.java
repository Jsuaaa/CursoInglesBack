package com.cursoinglesback.cursoinglesbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursoinglesback.cursoinglesbackend.entities.SolarData;

public interface SolarDataRepository extends JpaRepository<SolarData, Long>{

    SolarData findFirstByOrderByTimestampDesc();


}
