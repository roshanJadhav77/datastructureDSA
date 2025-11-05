package ping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private int id;
    private String model;
    private String type;
    private String licencePlate;
    private double isAvailable;

    public Car(int i, String creta, String ka1222, boolean b) {
    }
}
