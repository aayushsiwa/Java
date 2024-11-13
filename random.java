import java.util.concurrent.ThreadLocalRandom;

class random {
    public static void main(String[] args) {
        System.out.println(ThreadLocalRandom.current().nextInt(1,375));
    }
}
