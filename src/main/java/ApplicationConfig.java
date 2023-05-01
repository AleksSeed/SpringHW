import org.springframework.context.annotation.Bean;

public class ApplicationConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car(BodyType.BodyTypeCar.COUPE);
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus(BodyType.Capasity.MEDIUM);
    }

    @Bean(name = "Pickup")
    public Pickup getPickupBean() {
        return new Pickup(BodyType.WeightTruck.N1);
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Антошка", new Car(BodyType.BodyTypeCar.SEDAN));
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Бориска", new Bus(BodyType.Capasity.LARGE));
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Витёк", new Pickup(BodyType.WeightTruck.N2));
    }
}








