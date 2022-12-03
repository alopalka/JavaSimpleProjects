import java.util.List;

public class PasswordGenerator {

    public static String generatePassword(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length should be greater then 0!");
        }
        String password = "";
        List<Component> componentList = Component.getRandomList(length);
        for (Component c : componentList) {
            password += c.getRandomValue();
        }
        return password;
    }

    

}
