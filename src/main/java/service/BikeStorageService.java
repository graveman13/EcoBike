package service;

import model.AbstarctBike;

import java.util.List;
import java.util.Optional;

public interface BikeStorageService {
    List<AbstarctBike> getAllBikes();

    boolean addBike(AbstarctBike bike);

    Optional<AbstarctBike> getBike(AbstarctBike bike);
}
