package com.prashant.vehiclemanagementsystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    @Query("FROM VehicleEntity v where v.isCrossBadged = false")
    public List<VehicleEntity> findNonCrossBadgeVehicle();
}
