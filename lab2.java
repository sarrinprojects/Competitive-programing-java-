import java.util.*;
public class lab2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();

            long res = 1;

            for (int i = 0; i < m; i++) {
                res = (res * a) % p;
            }

            System.out.println(res);
            System.out.println("20241CSE3002 Sarrin Lal");
        }
    }
}
