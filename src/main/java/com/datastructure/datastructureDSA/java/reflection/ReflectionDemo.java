package com.datastructure.datastructureDSA.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        Class clazz = Class.forName("reflection.Test");
        Test o = (Test) clazz.newInstance();

        Method show = clazz.getDeclaredMethod("show", null);
        show.setAccessible(false);
        show.invoke(o,null);

    }
}
