public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startCar() {
        System.out.println(transport + " готов к работе.");
    }

    public void startBus() {
        System.out.println(transport + " готов к работе.");
    }
    public void startPickUp() {
        System.out.println(transport + " готов к работе.");
    }

    @Override
    public String toString() {
        return "Водитель{" +
                "имя='" + name + '\'' +
                ", транспорт=" + transport +
                '}';
    }
}
