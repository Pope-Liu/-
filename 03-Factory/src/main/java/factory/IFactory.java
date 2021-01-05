package factory;

import product.IProduct;

/**
 * @author Pope
 *
 */
public interface IFactory {
    /**
     * 生产方法
     * @return 生产的产品
     */
    IProduct produce();
}
