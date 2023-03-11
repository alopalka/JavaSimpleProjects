package simple.project;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException {
        Person p = new Person("Satoshi", "Nakamoto", LocalDate.of(1999, 12, 10), Sex.MALE);

        // Before
        System.out.println(p);

        // Let's break java
        List<Field> fields = new ArrayList<>(Arrays.asList(p.getClass().getDeclaredFields()));
        fields.forEach(f -> System.out.println(f.getName()));

        System.out.println();

        // Changing final attribute values :O
        for (Field f : fields) {
            if (f.getName().equals("birthDate")) {
                f.setAccessible(true);
                f.set(p, LocalDate.now());
            }
        }
        System.out.println();

        // After
        System.out.println(p);

        System.out.println();

        List<Method> methods = new ArrayList<>(Arrays.asList(p.getClass().getDeclaredMethods()));
        methods.forEach(m -> System.out.println(m.getName()));

        System.out.println();

        // Calling method illegally
        for (Method m : methods) {
            if (m.getName().equals("someSecretMethod")) {
                m.setAccessible(true);
                m.invoke(p);
            }
        }
    }
}
