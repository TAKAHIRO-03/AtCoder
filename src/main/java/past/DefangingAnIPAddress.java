package past;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefangingAnIPAddress {

    private static String IPv4;

    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            IPv4 = sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.println(IPv4.replaceAll("\\.", "[.]"));

    }
}
