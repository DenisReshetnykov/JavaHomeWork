public class Doors {

    public static void main(String[] args) {
        boolean[] Doors = new boolean[100];

        for (int i=1; i<=100; i++ ) {
            for (int j=i; j<=100; j+=i) {
                Doors[j-1] = !Doors[j-1];
            }
            if (Doors[i-1]) {
                System.out.print("[O] ");
            } else {
                System.out.print("[X] ");
            }
        }
    }
}
