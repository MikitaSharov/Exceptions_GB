import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human human;

        System.out.println("Введите: Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона(только цифры) пол(f или m)");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        int CHECK_LENGTH = 6;
        if (inputArray.length < CHECK_LENGTH) {
            throw new RuntimeException("Введено меньше данных чем нужно");
        }
        if (inputArray.length > CHECK_LENGTH) {
            throw new RuntimeException("Введено больше данных чем нужно");
        }

        human = new Human(inputArray);

        Writer writer = new Writer();
        writer.write(human);
    }
}
