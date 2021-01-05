package factory.Impl;

import factory.IFactory;
import product.IProduct;
import product.Impl.ProductA;

import java.util.concurrent.TimeUnit;

/**
 * @author Pope
 * 工厂A，生产产品A
 */
public class FactoryA implements IFactory {

    /**
     * 生产产品A
     * @return 生产出来的产品A
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
        System.out.println("经过了复杂的过程...==========>生产了产品A");
        return new ProductA();
    }
}
