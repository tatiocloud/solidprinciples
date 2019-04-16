package ram.io.liskov;

public class Car implements Vehicle {

    private String sound;

    public Car(String sound) {
        this.sound = sound;
    }

    public void canSound() {

        System.out.println("Car Sound: " + sound);
    }
}
