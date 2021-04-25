package com.prashant.vehiclemanagementsystem.Controller;

import com.prashant.vehiclemanagementsystem.Entity.VehicleEntity;
import com.prashant.vehiclemanagementsystem.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@RestController
@RequestMapping("/v1")
public class VehicleController<findNonCrossBadgeVehicle> {

    @Autowired
    VehicleRepository vehicleRepository;

    @PostMapping("/create-vehicle")
    public VehicleEntity createVehicle(@RequestBody VehicleEntity vehicleEntity)
    {
        System.out.println(vehicleEntity.toString());
        return vehicleRepository.save(vehicleEntity);
    }

    @PutMapping("/update-vehicle/{vin}")
    public ResponseEntity<VehicleEntity>  updateVehicleByVIN(@PathVariable(value ="vin") Long vin,@RequestBody VehicleEntity vehicleEntity)
    {
        VehicleEntity vehicleEntity1=vehicleRepository.findById(vin).get();
        vehicleEntity1.setBrand(vehicleEntity.getBrand());
        vehicleEntity1.setMasterBrand(vehicleEntity.getMasterBrand());
        vehicleEntity1.setColor(vehicleEntity.getColor());
        vehicleEntity1.setRegion(vehicleEntity.getRegion());
        vehicleEntity1.setCanArchitecture(vehicleEntity.getCanArchitecture());
        vehicleEntity1.setEngineType(vehicleEntity.getEngineType());
        vehicleEntity1.setUpdatedDate(vehicleEntity.getUpdatedDate());
        return ResponseEntity.ok(vehicleRepository.save(vehicleEntity1));
    }

    @GetMapping("/get-vehicle")
    public List<VehicleEntity> getVehicle()
    {
        return vehicleRepository.findAll();
    }

    @GetMapping("/get-vehicle/{vin}")
    public VehicleEntity getVehicleByVIN(@PathVariable(value = "vin")Long vin )
    {
        return vehicleRepository.findById(vin).get();
    }

    @GetMapping("/get-vehicle-by-uuid/{uuid}")
    public VehicleEntity getVehicleByUUID(@PathVariable(value = "uuid") UUID uuid )
    {
        return vehicleRepository.findByUUID(uuid);
    }

    @DeleteMapping("/remove-vehicle/{vin}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "vin") Long vin)
    {
        VehicleEntity vehicleEntity = vehicleRepository.findById(vin).get();
        vehicleRepository.delete(vehicleEntity);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
