package dao.impl;

import dao.BikeStoregeDao;
import db.Storage;
import model.AbstarctBike;

import java.util.List;
import java.util.Optional;

public class BikeStorageDaoImpl implements BikeStoregeDao {
    private List<AbstarctBike> storage = Storage.bikeList;

    public List<AbstarctBike> getAllBikes() {
        return storage;
    }

    public boolean addBike(AbstarctBike bike) {
        return storage.add(bike);
    }

    public Optional<AbstarctBike> getBike(AbstarctBike bike) {
        return storage.stream().filter(ab -> ab.equals(bike)).findFirst();
    }
}
