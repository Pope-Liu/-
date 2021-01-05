package factory;

import factory.Impl.FactoryA;
import factory.Impl.FactoryB;
import org.junit.jupiter.api.Test;
import product.IProduct;

/**
 * @author Pope
 */
public class FactoryTest {

    @Test
    public void factoryTest(){
        IFactory factoryA = new FactoryA();
        System.out.println("==========工厂factoryA生产产品productA==========");
        IProduct productA = factoryA.produce();
        productA.show();

        System.out.println();

        IFactory factoryB = new FactoryB();
        System.out.println("==========工厂factoryB生产产品productB==========");
        IProduct productB = factoryB.produce();
        productB.show();
    }

}
