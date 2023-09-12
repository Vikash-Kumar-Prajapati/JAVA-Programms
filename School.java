import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int student = scanner.nextInt();
        scanner.nextLine();
        ArrayList studenList = new ArrayList<>();

        for (int i = 0; i < student; i++) {
            int add = scanner.nextInt();
            studenList.add(add);
        }

        for (int i = 0; i < studenList.size(); i++) {
            System.out.println(studenList.get(i));
        }

    }
}
