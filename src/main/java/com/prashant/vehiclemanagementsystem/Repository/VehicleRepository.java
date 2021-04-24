package com.prashant.vehiclemanagementsystem.Repository;
import com.prashant.vehiclemanagementsystem.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

}
