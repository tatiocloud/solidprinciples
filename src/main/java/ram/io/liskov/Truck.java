package ram.io.liskov;

public class Truck implements Vehicle {

    private String sound;

    public Truck(String sound) {
        this.sound = sound;
    }

    public void canSound() {
        System.out.println("Truck Sound: " + sound);
    }
}
