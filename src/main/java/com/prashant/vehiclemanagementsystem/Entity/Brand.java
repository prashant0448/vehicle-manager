package com.prashant.vehiclemanagementsystem.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Brand {
    Audi(MasterBrand.Volkswagen),
    Porsche(MasterBrand.Volkswagen),
    Buggati(MasterBrand.Volkswagen),
    Bentley(MasterBrand.Volkswagen),
    Lamborghini(MasterBrand.Volkswagen),
    Ducati(MasterBrand.Volkswagen),
    Lexus(MasterBrand.Toyota),
    Toyota(MasterBrand.Toyota),
    RangeRover(MasterBrand.Tata),
    LandRover(MasterBrand.Tata),
    RollsRoyce(MasterBrand.BMW),
    BMW(MasterBrand.BMW),
    MercedesBenz(MasterBrand.MercedesBenz),
    Infiniti(MasterBrand.Nissan),
    Datsun(MasterBrand.Nissan),
    Alpine(MasterBrand.Renualt),
    Dacia(MasterBrand.Renualt);

    private final MasterBrand masterBrand;
    public enum MasterBrand
    {
        Volkswagen,
        Tata,
        Nissan,
        Renualt,
        Toyota,
        BMW,
        MercedesBenz;
    }


}
