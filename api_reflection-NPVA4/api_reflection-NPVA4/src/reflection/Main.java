package reflection;

import org.reflections.Reflections;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Reflections reflections = new Reflections("Reflection API");

        Object[] classes = reflections.getTypesAnnotatedWith(Todo.class).toArray();

        for (int i = 0; i < classes.length; i++) {
            Annotation annotation = ((Class) classes[i]).getAnnotation(Todo.class);
            System.out.println(i + ": " + ((Todo) annotation).task());
            System.out.println(i + ": " + ((Todo) annotation).release());
        }
        System.out.print("Todo: ");
        Scanner task = new Scanner(System.in);
        String text = String.valueOf(task);
        System.out.print("Release number: ");
        Scanner release = new Scanner(System.in);
        Integer nr = Integer.valueOf(String.valueOf(release));
        Task1 task1 = new Task1(text, nr);
        Object todo = Integer.valueOf(String.valueOf(task1));

        Object instance = ((Class)classes[(int) todo]).newInstance();
        Method method = instance.getClass().getDeclaredMethod("task & relase", null);
        method.invoke(instance);
    }
}
