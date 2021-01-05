package singleton.lazy;

/**
 * @author Pope
 * 懒汉式单例模式
 * 只有当需要的时候才创建
 * 注意！
 * 1.instance声明语句中的volatile与getInstance()方法的synchronized修饰符不能去掉，否则线程不安全
 */
public class LazySingleton {

    /**
     * 一开始并没初始化对象，只有当外部调用getSingleton方法时才初始化。
     */
    private static volatile LazySingleton instance = null;

    ///private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("创建懒汉式单例对象");
    }

    /**
     * 判断单例对象是否为空，如果为空则创建新的，不为空则返回；
     *
     * @return 懒汉式单例对象
     */
    public static synchronized LazySingleton getInstance() {
        if (instance != null) {
            System.out.println("返回已有懒汉式单例对象");
            return instance;
        }
        instance = new LazySingleton();
        return instance;
    }

}
