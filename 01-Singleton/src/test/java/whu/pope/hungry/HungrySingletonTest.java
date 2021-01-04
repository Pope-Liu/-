package whu.pope.hungry;

import org.junit.jupiter.api.Test;
import whu.pope.lazy.LazySingleton;

/**
 * @author Pope
 */
public class HungrySingletonTest {

    @Test
    public void getInstanceTest() {
        System.out.println("==========创建第一个饿汉式单例对象hungrySingleton01==========");
        HungrySingleton hungrySingleton01 = HungrySingleton.getInstance();
        System.out.println();

        System.out.println("==========创建第二个饿汉式单例对象hungrySingleton02==========");
        HungrySingleton hungrySingleton02 = HungrySingleton.getInstance();
        System.out.println();

        System.out.println("hungrySingleton01 == hungrySingleton01 结果：" + (hungrySingleton01 == hungrySingleton02
        ));
    }


    /**
     * 多线程下单例模式
     */
    @Test
    public void getInstanceTestMultiThread() {
        System.out.println("==========测试多线程下饿汉式单例模式==========");
        int threadNum = 10;
        for (int i = 0; i < threadNum; i++) {
            final String name = String.valueOf(i);
            new Thread(() -> {
                HungrySingleton instance = HungrySingleton.getInstance();
            }, name).start();
        }
    }

}
