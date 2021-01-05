package builder.Impl;

import builder.IBuilder;
import product.Product;
import product.part.PartA;
import product.part.PartB;
import product.part.PartC;

import java.util.concurrent.TimeUnit;

/**
 * @author Pope
 * 负责
 */
public class BuilderA implements IBuilder {

    Product product = new Product();

    @Override
    public IBuilder buildPartA() {
        product.setPartA(new PartA());
        //构造者A需要花费2秒构建A部分
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public IBuilder buildPartB() {
        product.setPartB(new PartB());
        //构造者A需要花费1秒构建B部分
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public IBuilder buildPartC() {
        product.setPartC(new PartC());
        //构造者A需要花费3秒构建C部分
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }


}
