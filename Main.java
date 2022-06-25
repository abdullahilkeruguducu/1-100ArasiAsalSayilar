//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int b = 0;

        for (int i = 2; i < 100; i++) {
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) {
                System.out.print(i + " ");
            }
            b = 0;
        }
    }
}