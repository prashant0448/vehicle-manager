package com.prashant.vehiclemanagementsystem.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
@ToString
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vin;

    @Column(name="uuid")
    private UUID uuid;

    @Column(name = "brand", nullable = false, length = 20)
    private Brand brand;

    @Column(name = "master_brand", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private Brand.MasterBrand masterBrand;

    @Column(name="can_architecture",length = 20)
    @Enumerated(EnumType.STRING)
    private Architecture canArchitecture;

    @Column(name="engine_type",length = 20)
    @Enumerated(EnumType.STRING)
    private EngineType engineType;

    @Column(name="color",length = 20)
    @Enumerated(EnumType.STRING)
    private Color color;

    @Column(name = "region",length = 20)
    private String region;

    @Column(name="manufactured_date")
    @CreatedDate
    private Instant manufacturedDate;

    @Column(name="updated_date")
    @LastModifiedDate
    private Timestamp updatededDate;
}
