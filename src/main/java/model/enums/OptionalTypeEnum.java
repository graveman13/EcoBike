package model.enums;

public enum OptionalTypeEnum {
    SHOW_ALL_BIKES(1),
    ADD_NEW_FOLDING_BIKE(2),
    ADD_NEW_SPEEDELEC_BIKE(3),
    ADD_NEW_EBIKE(4),
    FIND_FIRST_ITEM(5),
    WRITE_TO_FILE(6),
    STOP_APPLICETION(7);
    private int optional;

     OptionalTypeEnum(int optional) {
        this.optional = optional;
    }

    public int getOptional() {
        return optional;
    }

}
