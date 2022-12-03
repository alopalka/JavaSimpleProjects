import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(PasswordGenerator.generatePassword(15));
        }
    }
}