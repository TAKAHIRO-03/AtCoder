import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            r += sc.nextInt();
            r += sc.nextInt();
            String s = sc.next();
            System.out.println(r + " " + s);
        }
    }
}