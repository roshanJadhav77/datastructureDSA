package ping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reseveration {
    private Long id;
    private Car car;
    private Driver driver;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private PaymentMethod payment;

    public Reseveration(long l, Car car, Driver driver, Customer customer1, LocalDate now, LocalDate localDate, PaymentMethod paymentMethod) {
    }
}
