package com.prashant.vehiclemanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/v1")
public class VehicleController<findNonCrossBadgeVehicle> {

    @Autowired
    VehicleRepository vehicleRepository;

    @PostMapping("/create-vehicle")
    public VehicleEntity createVehicle(@RequestBody VehicleEntity vehicleEntity)
    {
        return vehicleRepository.save(vehicleEntity);
    }

    @PutMapping("/update-vehicle/{vin}")
    public ResponseEntity<VehicleEntity>  updateVehicleByVIN(@PathVariable(value ="vin") Long vin,@RequestBody VehicleEntity vehicleEntity)
    {
        VehicleEntity vehicleEntity1=vehicleRepository.findById(vin).get();
        vehicleEntity1.setBrand(vehicleEntity.getBrand());
        vehicleEntity1.setMasterBrand(vehicleEntity.getMasterBrand());
        vehicleEntity1.setDeviceMasterBrand(vehicleEntity.getDeviceMasterBrand());
        vehicleEntity1.setCrossBadged(vehicleEntity.getCrossBadged());
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

    @GetMapping("/get-native-vehicle")
    public  List<VehicleEntity> findNativeVehicle(){
        return vehicleRepository.findNonCrossBadgeVehicle();
    }
}
