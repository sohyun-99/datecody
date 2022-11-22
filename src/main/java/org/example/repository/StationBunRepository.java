package org.example.repository;

import org.example.Entity.StationBun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StationBunRepository extends JpaRepository<StationBun, Long> {
    Optional<StationBun> findByStation_name(String station_name);
}

