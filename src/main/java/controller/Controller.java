package controller;

import model.enums.OptionalTypeEnum;

import java.util.Arrays;

public class Controller {

    public void readUserOptional(int idxOptional) {
        OptionalTypeEnum optional = findOptional(idxOptional);

        switch (optional) {
            case SHOW_ALL_BIKES:
                //service.getAll();
                break;
            case ADD_NEW_FOLDING_BIKE:
            case ADD_NEW_EBIKE:
            case ADD_NEW_SPEEDELEC_BIKE:
                //service.addBike();
                break;
            case FIND_FIRST_ITEM:
                //service.getBike(Abstract bike)
                break;
            case WRITE_TO_FILE:
                //service.writeToFile()
                break;
            case STOP_APPLICETION:
                //service.stopApplication();
                break;
        }
    }

    private OptionalTypeEnum findOptional(int idxOptional) {
        return Arrays.stream(OptionalTypeEnum.values())
                .filter(e -> e.getOptional() == idxOptional)
                .findFirst().get();
    }
}
