package product.Impl;

import product.IProduct;

import java.util.concurrent.TimeUnit;

/**
 * @author Pope
 */
public class ProductA implements IProduct {
    @Override
    public void show() {
        System.out.println("产品A完成！");
    }
}
