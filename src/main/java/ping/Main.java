package ping;

// rental car,
// book car - driver details, car details(Model, PlateNumber, Type) and price ()
// filter based on creteria -
// system should handle reservation (Create - update - delete (cancel))
// payment processging
// conceurency - multiple custmoer

// HLL -

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(001, "Roshan");
        Car car = new Car(001,"creta", "KA1222", true);
        Customer customer1 = new Customer(201, "Customer1", "098876655", "customer@gmail");
        Reseveration reservation = new Reseveration(
                000011L,
                car,
                driver,
                customer1,
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                PaymentMethod.UPI
        );


    }
}
