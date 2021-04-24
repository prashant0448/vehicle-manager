package com.prashant.vehiclemanagementsystem.Repository;

import com.prashant.vehiclemanagementsystem.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    @Query("from VehicleEntity v where v.uuid =?1")
    public VehicleEntity findByUUID(UUID uuid);
}
