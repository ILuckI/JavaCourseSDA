package Zajecia1003.Refleksja.DocumentZadanie;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class book = Book.class;
        Constructor bookConstructor = book.getConstructor(String[].class, String.class);
        String[] aaa = new String[]{"a", "b"};
        Book newBook = (Book) bookConstructor.newInstance(aaa, "c");

        Method[] methods = book.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }


    }
}
