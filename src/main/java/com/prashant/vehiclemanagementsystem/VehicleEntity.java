package com.prashant.vehiclemanagementsystem;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    private Long vin;

    @Column(name = "brand")
    private String brand;

    @Column(name = "region")
    private String region;

    @Column(name = "master_brand")
    private String masterBrand;

    @Column(name="device_master_brand")
    private String deviceMasterBrand;

    @Column(name="is_cross_badged")
    private Boolean isCrossBadged;

    public VehicleEntity() {
    }

    public VehicleEntity(String brand, String region, String masterBrand, String deviceMasterBrand, Boolean isCrossBadged) {
        this.brand = brand;
        this.region = region;
        this.masterBrand = masterBrand;
        this.deviceMasterBrand = deviceMasterBrand;
        this.isCrossBadged = isCrossBadged;
    }

    public Long getVin() {
        return vin;
    }

    public void setVin(Long vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMasterBrand() {
        return masterBrand;
    }

    public void setMasterBrand(String masterBrand) {
        this.masterBrand = masterBrand;
    }

    public String getDeviceMasterBrand() {
        return deviceMasterBrand;
    }

    public void setDeviceMasterBrand(String deviceMasterBrand) {
        this.deviceMasterBrand = deviceMasterBrand;
    }

    public Boolean getCrossBadged() {
        return isCrossBadged;
    }


    @Override
    public String toString() {
        return "VehicleEntity{" +
                "vin=" + vin +
                ", brand='" + brand + '\'' +
                ", region='" + region + '\'' +
                ", masterBrand='" + masterBrand + '\'' +
                ", deviceMasterBrand='" + deviceMasterBrand + '\'' +
                ", isCrossBadged=" + isCrossBadged +
                '}';
    }

    public void setCrossBadged(Boolean crossBadged) {
        isCrossBadged = crossBadged;
    }
}
