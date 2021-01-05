package product.Impl;

import product.IProduct;

import java.util.concurrent.TimeUnit;

/**
 * @author Pope
 */
public class ProductB implements IProduct {
    @Override
    public void show() {
        System.out.println("产品B完成！");
    }
}
