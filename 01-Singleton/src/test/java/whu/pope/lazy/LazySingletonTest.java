package whu.pope.lazy;

import org.junit.jupiter.api.Test;
import whu.pope.hungry.HungrySingleton;

/**
 * @author Pope
 */
public class LazySingletonTest {

    @Test
    public void getInstanceTest() {
        System.out.println("==========创建第一个懒汉式单例对象lazySingleton01==========");
        LazySingleton lazySingleton01 = LazySingleton.getInstance();
        System.out.println();

        System.out.println("==========创建第二个懒汉式单例对象lazySingleton02==========");
        LazySingleton lazySingleton02 = LazySingleton.getInstance();
        System.out.println();

        System.out.println("lazySingleton01 == lazySingleton01 结果：" + (lazySingleton01 == lazySingleton02));
    }

    @Test
    public void getInstanceTestMultiThread() {
        System.out.println("==========懒汉式单例模式==========");
        int threadNum = 10;
        for (int i = 0; i < threadNum; i++) {
            final String name = String.valueOf(i);
            new Thread(() -> {
                LazySingleton instance = LazySingleton.getInstance();
            }, name).start();
        }
    }

}
