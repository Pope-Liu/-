package whu.pope.hungry;

/**
 * @author Pope
 * 饿汉式单例模式
 */
public class HungrySingleton {
    /**
     * 在类初始化时就创建单例对象
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("创建饿汉式单例对象");
    }

    /**
     * 由于对象在类初始化时就已经创建好了，因此只需要直接返回单例对象
     * @return 饿汉式单例对象
     */
    public static HungrySingleton getInstance() {
        System.out.println("返回饿汉式单例对象");
        return INSTANCE;
    }
}
