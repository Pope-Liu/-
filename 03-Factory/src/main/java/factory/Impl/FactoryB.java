package factory.Impl;

import factory.IFactory;
import product.IProduct;
import product.Impl.ProductB;

import java.util.concurrent.TimeUnit;

/**
 * @author Pope
 * 工厂B，生产产品B
 */
public class FactoryB implements IFactory {
    /**
     * 生产产品B
     * @return 生产的产品B
     */
    @Override
    public IProduct produce() {
        System.out.println("生产中");
        //模拟生产过程，实际情况中这里可能会有很多代码
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("经过了复杂的过程...==========>生产了产品B");
        return new ProductB();
    }
}
