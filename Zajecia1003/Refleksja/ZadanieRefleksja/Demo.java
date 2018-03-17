package Zajecia1003.Refleksja.ZadanieRefleksja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class bookDef=Book.class;
        Constructor bookConstructor=bookDef.getConstructor(String.class, Date.class);

        Book bookObject=(Book) bookConstructor.newInstance("Przeminelo z wiatrem",new Date());
        Field[] bookFields=bookDef.getDeclaredFields();
        for (Field field :bookFields) {
            System.out.println(field.getName());
        }
        Field title=bookDef.getDeclaredField("title");
        title.setAccessible(true);
        title.set(bookObject,"Jednak nie");

        Method getTitle=bookDef.getDeclaredMethod("getTitle");
        String returnValue=(String) getTitle.invoke(bookObject);
        System.out.println(returnValue);

        Class emailDef=EMail.class;
        Constructor emailConst=emailDef.getConstructor(String[].class,String.class,Date.class);
        EMail emailObj=(EMail) emailConst.newInstance(new String[] {"x","y"},"Test",new Date());


        Method addAutor=emailDef.getDeclaredMethod("addAutor", String.class);
        Method getAutor=emailDef.getMethod("getAutors");
        String[] autors=(String[])getAutor.invoke(emailObj);
        for (String string :autors) {
            System.out.println(string);
        }


        addAutor.invoke(emailObj,"zzz");

        Class superClass=emailDef.getSuperclass();
        String[] doPodmiany={"1","2"};
        Field autorzy=superClass.getDeclaredField("autors");
        autorzy.setAccessible(true);
        autorzy.set(emailObj,doPodmiany);
        autors=(String[])getAutor.invoke(emailObj);

        for (String s :autors) {
            System.out.println(s);
        }


    }
}
