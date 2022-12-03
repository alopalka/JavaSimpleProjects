import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Component {
    LETTER("abcdefghijklmnopqrstuvwxyz"),
    BIGLETTER("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    NUMBER("1234567890"),
    SYMBOL("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
    private String componentElements;
    private final static List<Component> avalableComponents = List.of(Component.values());

    Component(String componentElements) {
        this.componentElements = componentElements;
    }

    public String getComponentElements() {
        return componentElements;
    }

    public void setComponentElements(String componentElements) {
        this.componentElements = componentElements;
    }

    public char getRandomValue() {
        Random random = new Random();
        return componentElements.charAt(random.nextInt(0, componentElements.length()));
    }

    public static List<Component> getRandomList(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length should be greater then 0 !");
        }
        List<Component> components = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            components.add(
                    avalableComponents.get(
                            random.nextInt(0, avalableComponents.size())
                    ));
        }
        return components;
    }
}
