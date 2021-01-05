package director;

import builder.IBuilder;
import product.Product;

/**
 * @author Pope
 * 负责各个组件之间的装配
 */
public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public Product construct(){
        //通过builder的不同建造顺序来创建不同的产品，如A-->B-->C的顺序
        return builder.buildPartA().buildPartB().buildPartC().getProduct();
    }

    public void setBuilder(IBuilder builder) {
        this.builder = builder;
    }
}
