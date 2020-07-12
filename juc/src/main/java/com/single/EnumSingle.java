package com.single;

        import java.lang.reflect.Constructor;
        import java.lang.reflect.InvocationTargetException;

/**
 * @author: Dennis
 * @date: 2020/7/12 14:05
 */
// enum 本身也是一个 Class 类
public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();

        //Exception in thread "main" java.lang.NoSuchMethodException: com.single.EnumSingle.<init>()
        System.out.println(instance1);
        System.out.println(instance2);

    }
}
