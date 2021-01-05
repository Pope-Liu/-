package builder;

import product.Product;

/**
 * @author Pope
 */
public interface IBuilder {

    /**
     * 构建产品的A部分
     * @return 构建者本身
     */
    IBuilder buildPartA();

    /**
     * 构建产品的B部分
     * @return 构建者本身
     */
    IBuilder buildPartB();

    /**
     * 构建产品的C部分
     * @return 构建者本身
     */
    IBuilder buildPartC();

    /**
     * 获取构建的产品
     * @return 构建的产品
     */
    Product getProduct();

}
