package org.example.repository;

import org.example.Entity.Bun;
import org.example.Entity.StationBun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StationBunRepository extends JpaRepository<Bun,Long> {
    List<Bun> findByStationNum(int stationNum);
    List<Bun> findByStoreId(int storeId);
    List<Bun> findByStationNumAndKind(int stationNum, int kind);

}

