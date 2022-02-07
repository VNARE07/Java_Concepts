package ReflectionsApi;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Class<?> cls = list.getClass();
        String name;
        while (true){
            name = cls.getName();
            if (cls.isInterface()){
                System.out.println("interface");
            }
            System.out.println(name);
            if (name.equals("java.lang.Object")){
                Constructor<?>[] val = cls.getConstructors();
                for (int i = 0; i < val.length; i++){
                    System.out.println(val[i]);
                }
                break;
            }
            else{
                Constructor<?>[] val = cls.getConstructors();
                for (int i = 0; i < val.length; i++){
                    System.out.println(val[i]);
                }
                cls = cls.getSuperclass();
            }
        }
    }
}
