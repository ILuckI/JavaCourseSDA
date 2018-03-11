package Zadanie;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class book = Book.class;
        Constructor constructor = book.getConstructor(String.class, Date.class);
        Field[] bookFields = book.getDeclaredFields();
        for (Field field : bookFields) {
            System.out.println(field.getName());
        }
        try {
            Book newBook = (Book) constructor.newInstance("Book of Eli", new Date());
            Method[] bookMethods = book.getMethods();
            for (Method method : bookMethods) {
                System.out.println(method.getName());
            }
            Field title = book.getDeclaredField("title");
            title.setAccessible(true);
            title.set(newBook, "Zmiana miejsc");
            newBook.getTitle();

            Method getTitle = book.getDeclaredMethod("getTitle");
            System.out.println(getTitle.invoke(newBook));

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------");

        Class email = EMail.class;
        Constructor constr = email.getConstructor(String.class, String[].class, Date.class);
        EMail emailObj = (EMail) constr.newInstance("email", new String[]{"aa", "bb", "ccc"}, new Date());

        Method addAuthor = email.getMethod("addAuthor", String.class);
        addAuthor.invoke(emailObj, "KKKKKK");
        addAuthor.invoke(emailObj, "MMMMM");
        addAuthor.invoke(emailObj, "AAAAAA");

        Method getAuthors = email.getMethod("getAutors");
        String[] authors = (String[]) getAuthors.invoke(emailObj);
        for (String s : authors) {
            System.out.println(s);

        }

        Class superClass = email.getSuperclass();
        String[] doPodmiany = {"1","0","1","0","1","0","1","0","1","0"};
        Field autorzy = superClass.getDeclaredField("autors");
        autorzy.setAccessible(true);
        autorzy.set(emailObj, doPodmiany);
        authors = (String[]) getAuthors.invoke(emailObj);
        for (String s : authors) {
            System.out.println(s);

        }

    }
}
