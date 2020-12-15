package dao;

import model.AbstarctBike;

import java.util.List;
import java.util.Optional;

public interface BikeStoregeDao {
    List<AbstarctBike> getAllBikes();

    boolean addBike(AbstarctBike bike);

    Optional<AbstarctBike> getBike(AbstarctBike bike);
}
