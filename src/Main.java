import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력해주세요:");
        String name = scanner.nextLine();

        System.out.print("나이를 입력해주세요:");
        int age = scanner.nextInt();

        System.out.print("키를 입력해주세요:");
        double height = scanner.nextDouble();

        System.out.print(name + "\n" + age + "\n" + height);
    }
}

