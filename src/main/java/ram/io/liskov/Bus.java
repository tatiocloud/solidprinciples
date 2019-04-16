package ram.io.liskov;

public class Bus implements Vehicle{

    private String sound;

    public Bus(String sound) {
        this.sound = sound;
    }

    public void canSound() {

        System.out.println("Bus Cound: " + sound);
    }
}
