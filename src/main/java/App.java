import model.AbstractElectricBike;
import model.enums.ProductTypeEnum;
import model.impl.ElectricBike;
import ui.UserInterface;

public class App {
    public static void main(String[] args) {
        AbstractElectricBike electricBike1 = new ElectricBike(ProductTypeEnum.ELECTRIC_BIKE,"Pegou"
                ,100,true,"red",100,54,123);
        AbstractElectricBike electricBike2 = new ElectricBike(ProductTypeEnum.ELECTRIC_BIKE,"Pegou"
                ,101,true,"red",100,54,123);

        UserInterface userInterface = new UserInterface();
        userInterface.run();
    }
}
