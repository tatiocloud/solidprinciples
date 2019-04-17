package ram.io.bigo;

public class BigO {

    public static void main(String[] args) {

        long count = 0L;

        for (int i = 1; i <= 9000; i++) {
            for (int j = 1; j <= 9000; j++) {
                count += 1;
            }
        }
        System.out.println("Count: " + count);
    }
}
