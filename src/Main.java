public class Main {
    public static void main(String[] args) {

        String rands = BluddyRandom.randString(50);

        for (int i = 0; i < rands.length(); i++) {
            System.out.print(rands.toCharArray()[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
