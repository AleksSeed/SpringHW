public class BodyType  {

    public enum BodyTypeCar {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        BodyTypeCar(String string) {
        }
    }

    public enum Capasity {
        EXTRA_SMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        Capasity(int i, int n) {
        }
    }

    public enum WeightTruck {
        N1(0d, 3.5d),
        N2(3.5d, 12d),
        N3(12d, null);

        WeightTruck(double v, Double o) {
        }
    }
}